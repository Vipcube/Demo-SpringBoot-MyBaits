package org.vipcube.spring.boot.mybatis.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.apache.ibatis.reflection.MetaObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@MapperScan( "org.vipcube.spring.boot.mybatis.mapper" )
public class MyBatisConfig {

	@Bean
	public MetaObjectHandler auditingMetaObjectHandler() {
		return new AuditingMetaObjectHandler();
	}

	@Bean
	public MybatisPlusInterceptor mybatisPlusInterceptor() {
		MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
		interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
		interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
		return interceptor;
	}

	private class AuditingMetaObjectHandler implements MetaObjectHandler {
		@Override
		public void insertFill( MetaObject metaObject ) {
			this.setFieldValByName( "createTime", LocalDateTime.now(), metaObject );
			this.setFieldValByName("version", 0, metaObject);
		}

		@Override
		public void updateFill( MetaObject metaObject ) {

		}
	}
}
