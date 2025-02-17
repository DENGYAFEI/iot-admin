package com.iot.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iot.admin.mapper.UserMapper;
import com.iot.admin.service.UserService;
import com.iot.common.model.entity.admin.User;
import org.springframework.stereotype.Service;

/**
* @author 20379
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2025-01-06 20:05:40
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




