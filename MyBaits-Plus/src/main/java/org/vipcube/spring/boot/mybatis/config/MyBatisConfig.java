package org.vipcube.spring.boot.mybatis.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
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
	public OptimisticLockerInnerInterceptor optimisticLockerInnerInterceptor(){
		return new OptimisticLockerInnerInterceptor();
	}

	@Bean
	public PaginationInnerInterceptor paginationInnerInterceptor(){
		return new PaginationInnerInterceptor();
	}

	private class AuditingMetaObjectHandler implements MetaObjectHandler {
		@Override
		public void insertFill( MetaObject metaObject ) {
			this.setFieldValByName( "createTime", LocalDateTime.now(), metaObject );
		}

		@Override
		public void updateFill( MetaObject metaObject ) {

		}
	}
}
