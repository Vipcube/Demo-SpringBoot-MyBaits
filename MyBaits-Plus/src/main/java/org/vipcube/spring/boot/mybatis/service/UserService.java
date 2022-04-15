package org.vipcube.spring.boot.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.vipcube.spring.boot.mybatis.domain.User;
import org.vipcube.spring.boot.mybatis.domain.UserWithLogs;

/**
* @author Delos
* @description 针对表【user】的数据库操作Service
* @createDate 2022-04-15 14:45:43
*/
public interface UserService extends IService<User> {
	UserWithLogs selectLeftJoinLogs( long id );
}
