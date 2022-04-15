package org.vipcube.spring.boot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan( {
		"org.vipcube.spring.boot.mybatis.mapper"
} )
@SpringBootApplication
public class MyBatisApplication {
	public static void main( String[] args ){
		SpringApplication.run( MyBatisApplication.class, args );
	}
}
