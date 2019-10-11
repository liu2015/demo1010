package com.example.demo.entity;

/**
 * @ProjectName: demo1010
 * @Package: com.example.demo.entity
 * @ClassName: User
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/10 14:42
 * @Version: 1.0
 */
public class User {

    private String userId;
    private String userName;
    private String password;
    private String phone;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId=userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone=phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
