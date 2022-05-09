package org.vipcube.spring.boot.mybatis.service;

import org.vipcube.spring.boot.mybatis.domain.User;
import org.vipcube.spring.boot.mybatis.domain.UserWithLogs;

public interface IUserService {
	long addUser( User user );
	long updateUserById( User user );
	long deleteUserById( long id );
	User selectById( long id );
	UserWithLogs selectLeftJoinLogs( long id );
}
