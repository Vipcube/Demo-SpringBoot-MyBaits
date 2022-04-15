package org.vipcube.spring.boot.mybatis.service.impl;

import org.springframework.stereotype.Service;
import org.vipcube.spring.boot.mybatis.entity.Log;
import org.vipcube.spring.boot.mybatis.repository.LogRepository;
import org.vipcube.spring.boot.mybatis.service.ILogService;

@Service
public class LogService implements ILogService {
	private final LogRepository repository;

	public LogService( LogRepository repository ){
		this.repository = repository;
	}

	@Override
	public Log selectById( long id ) {
		return this.repository.selectById( id );
	}
}
