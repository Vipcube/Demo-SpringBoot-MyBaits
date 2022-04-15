package org.vipcube.spring.boot.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vipcube.spring.boot.mybatis.domain.User;
import org.vipcube.spring.boot.mybatis.domain.UserWithLogs;
import org.vipcube.spring.boot.mybatis.mapper.UserMapper;
import org.vipcube.spring.boot.mybatis.service.UserService;

/**
* @author Delos
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-04-15 14:45:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

	public UserWithLogs selectLeftJoinLogs( long id ){
		return this.baseMapper.selectLeftJoinLogs( id );
	}

	@Transactional(
			rollbackFor = {Exception.class}
	)
	@Override
	public boolean updateById( User user ){
		User byId = this.getById( user.getId() );
		BeanUtils.copyProperties( user, byId, "id", "version" );
		return SqlHelper.retBool( this.getBaseMapper().updateById( byId ) );
	}
}




