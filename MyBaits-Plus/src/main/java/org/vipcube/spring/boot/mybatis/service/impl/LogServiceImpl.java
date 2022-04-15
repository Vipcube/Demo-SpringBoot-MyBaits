package org.vipcube.spring.boot.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.vipcube.spring.boot.mybatis.domain.Log;
import org.vipcube.spring.boot.mybatis.service.LogService;
import org.vipcube.spring.boot.mybatis.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
* @author Delos
* @description 针对表【log】的数据库操作Service实现
* @createDate 2022-04-15 14:45:51
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log>
    implements LogService{

}




