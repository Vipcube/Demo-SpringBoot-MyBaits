package org.vipcube.spring.boot.mybatis.repository;

import org.springframework.stereotype.Repository;
import org.vipcube.spring.boot.mybatis.entity.User;
import org.vipcube.spring.boot.mybatis.entity.UserWithLogs;

@Repository
public interface UserRepository {
	int addUser( User user );
	int updateUserById( User user );
	int deleteUserById( long id );
	User selectById( long id );
	UserWithLogs selectLeftJoinLogs( long id );
}
