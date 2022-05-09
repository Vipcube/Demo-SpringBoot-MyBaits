package org.vipcube.spring.boot.mybatis.service;

import org.vipcube.spring.boot.mybatis.domain.Log;

public interface ILogService {
	Log selectById( long id );
}
