package com.example.demo.myMpper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: demo1010
 * @Package: com.example.demo.myMpper
 * @ClassName: UserMpper
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/10 14:48
 * @Version: 1.0
 */

@Repository
public interface UserMpper {

    Boolean add(User user);

    Boolean del(String userId);

    List<User> findall();

    User sel(String userId);

    List<User> seach(String userName,String phone);

    int inert(User user);

}
