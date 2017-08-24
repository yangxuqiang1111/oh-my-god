package com.fd.bookstore.controller;

import com.fd.bookstore.model.Source;
import com.fd.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangdi on 2017/8/6.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("fd", "fd");
        modelAndView.addObject("user", userService.listAll());
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/test")
    public Map test() {
        /**
         * 查询数据库
         */
        ArrayList<Source> sourceList = new ArrayList<Source>();
        Source source1 = new Source();
        source1.setBaidu("123");
        source1.setGuge("456");
        source1.setMail("789");

        sourceList.add(source1);

//        HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
//        HashMap<String, String> mondayHashMap = new HashMap<String, String>();
//        mondayHashMap.put("百度", sourceList.get(0).getBaidu());
//        mondayHashMap.put("谷歌", sourceList.get(0).getGuge());
//        mondayHashMap.put("邮箱", sourceList.get(0).getMail());
//        hashMap.put("周一", mondayHashMap);

        HashMap<String, Source> hashMap = new HashMap<String, Source>();
        hashMap.put("周一", sourceList.get(0));

        return hashMap;

    }


}
