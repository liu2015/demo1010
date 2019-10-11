package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.myMpper.UserMpper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: demo1010
 * @Package: com.example.demo.service.impl
 * @ClassName: UserServiceimpl
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/10 15:00
 * @Version: 1.0
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserMpper userMpper;

    public boolean add(User user){
        userMpper.add( user );
        return false;
    }

    public boolean del(String userId){
        userMpper.del( userId );
        return false;
    }


    public List<User> findall(){
        return userMpper.findall();

    }
    public User sel(String userId) {
        return userMpper.sel( userId );
    }

    public List<User> seach(String userName,String phone){

        return userMpper.seach( userName,phone );
    }
    public int inert (User user)
    {
        int d=userMpper.inert( user );
        return d;

    }


}
