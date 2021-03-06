package org.vipcube.spring.boot.mybatis.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vipcube.spring.boot.mybatis.domain.User;
import org.vipcube.spring.boot.mybatis.domain.UserWithLogs;
import org.vipcube.spring.boot.mybatis.repository.UserRepository;
import org.vipcube.spring.boot.mybatis.service.IUserService;

@Service
@Transactional
public class UserService implements IUserService {
	private final UserRepository repository;

	public UserService( UserRepository repository ){
		this.repository = repository;
	}

	@Override
	public long addUser( User user ) {
		this.repository.addUser( user );
		return user.getId();
	}

	@Override
	public long updateUserById( User user ) {
		this.repository.updateUserById( user );
		return user.getId();
	}

	@Override
	public long deleteUserById( long id ) {
		this.repository.deleteUserById( id );
		return id;
	}

	@Override
	public User selectById( long id ) {
		return this.repository.selectById( id );
	}

	@Override
	public UserWithLogs selectLeftJoinLogs( long id ) {
		return this.repository.selectLeftJoinLogs( id );
	}
}
