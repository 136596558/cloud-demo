package cn.itcast.gateway.user.service;

import cn.itcast.gateway.user.mapper.UserMapper;
import cn.itcast.gateway.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}