package com.fd.bookstore.service.impl;

import com.fd.bookstore.mapper.UserMapper;
import com.fd.bookstore.po.User;
import com.fd.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fangdi on 2017/8/6.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    public List<User> listAll() {
        return userMapper.listAll();
    }
}
