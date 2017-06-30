package com.gong.controller;

import com.gong.model.User;
import com.gong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/29.
 */
@Resource
@Controller
//@RequestMapping(value = "/user")
public class UserController {
    @Autowired
   private UserService userService;
    public void setUserService(UserService userService)
    {
       this.userService = userService;
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView login(User user){
        ModelAndView mv = new ModelAndView("success");
        userService.saveUser(user);
        User user9 = userService.getUser(user.getId());
        System.out.println(user9.getUsername());
        return mv;
    }

//    @RequestMapping(value = "/denglu",method = RequestMethod.GET)
//    @ResponseBody
////    public Map<String,Object> denglu(User user){
//        Map<String,Object> map = new HashMap<String, Object>();
//        User user6 = userService.getUser();
//        if(null!=user){
//            map.put("message", "查询Id=" + id + "的用户名为:" + user.getUsername());
//        }else{
//            map.put("message", "没有查询到与Id=" + id + "相关的数据");
//        }
//        return map;
//    }
//    }


//    @RequestMapping(value = "/add",method = RequestMethod.GET)
//    @ResponseBody
//    public Map<String, Object> add(HttpServletRequest request, @PathVariable("user")User user){
//        Map<String, Object> map = new HashMap<String, Object>();
//        System.out.println("eqwrq");
////        userService.add(user);
////        map.put(user.getId(),user);
//        return map;
//    }

//    @RequestMapping(value="/query",method={RequestMethod.GET,RequestMethod.POST})
//    public ModelAndView query(String id){
//
//    }
//    public Map<String,Object> query(HttpServletRequest request,HttpServletResponse response,
//                                    @PathVariable("id")String id){
//        Map<String,Object> map = new HashMap<String, Object>();
//        System.out.println(id);
//        User user = userService.getUser(id);
//        if(null!=user){
//            map.put("message", "查询Id=" + id + "的用户名为:" + user.getUsername());
//        }else{
//            map.put("message", "没有查询到与Id=" + id + "相关的数据");
//        }
//        return map;
//    }
//    @RequestMapping(value="delete",method={RequestMethod.GET,RequestMethod.POST})
//    public Map<String,Object> delete(HttpServletRequest request, HttpServletResponse response,
//                                     @PathVariable("id")String id){
//        Map<String,Object> map = new HashMap<String, Object>();
//        try {
//            userService.delete(id);
//            map.put("message", "删除Id为" + id +"的用户成功.");
//        } catch (Exception e) {
//            e.printStackTrace();
//            map.put("message", "删除Id为" + id +"的用户失败, "+e.getMessage());
//        }
//        return map;
//    }
}
