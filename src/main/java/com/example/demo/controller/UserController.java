package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: demo1010
 * @Package: com.example.demo.controller
 * @ClassName: UserController
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/10 15:24
 * @Version: 1.0
 */
@Controller
public class UserController {

    @Autowired
    UserServiceimpl userServiceimpl;

    @RequestMapping("/")
    public String index(){

        return "redirect:/list";
    }
    @RequestMapping("list")
    public String findall(ModelMap map){
        List<User> all=userServiceimpl.findall();
        map.addAttribute( "all",all );

        return "index";

    }

    @RequestMapping("/insert")
    public String insert(User user){
        int dd=userServiceimpl.inert( user );
        return "redirect:/list";
    }

    @RequestMapping("add")
    public String add(User user){
        userServiceimpl.add( user );
        return "redirect:/list";
    }

    @RequestMapping("/del/{userId}")
    public String del(@PathVariable String userId){
        userServiceimpl.del( userId );
        return "redirect:/list";
    }

    @RequestMapping("/edit/{userId}")
    public String sel(@PathVariable String userId,ModelMap map)
    {
        User sel=userServiceimpl.sel( userId );
        map.addAttribute( "user",sel );
        return "edit";
    }

    @RequestMapping("/seachAll")
    public String seach(User user,ModelMap map){
        String  username=user.getUserName();
        String phone=user.getPhone();
        List<User> users=userServiceimpl.seach( username,phone );
        map.addAttribute( "seachAll",users );

        return "seach";
    }

    @RequestMapping("/seach")
    public String seach(){
        return "seach";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }
}
