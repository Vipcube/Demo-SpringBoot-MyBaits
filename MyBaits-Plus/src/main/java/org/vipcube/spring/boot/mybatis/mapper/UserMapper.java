package org.vipcube.spring.boot.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.vipcube.spring.boot.mybatis.domain.User;
import org.vipcube.spring.boot.mybatis.domain.UserWithLogs;

/**
* @author Delos
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-04-15 14:45:43
* @Entity org.vipcube.spring.boot.mybatis.domain.User
*/
public interface UserMapper extends BaseMapper<User> {
	UserWithLogs selectLeftJoinLogs( long id );
}




