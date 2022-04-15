package org.vipcube.spring.boot.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.vipcube.spring.boot.mybatis.domain.User;
import org.vipcube.spring.boot.mybatis.service.UserService;
import org.vipcube.spring.boot.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Delos
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-04-15 14:45:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




