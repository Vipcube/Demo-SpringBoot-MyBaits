package org.vipcube.spring.boot.mybatis.repository;

import org.springframework.stereotype.Repository;
import org.vipcube.spring.boot.mybatis.entity.Log;

@Repository
public interface LogRepository {
	Log selectById( long id );
}
