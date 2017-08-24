package com.fd.bookstore.controller;

import com.fd.bookstore.po.Information;
import com.fd.bookstore.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by fangdi on 2017/8/23.
 */
@Controller
@RequestMapping("/information")
public class UserInformationController {
    @Autowired
    InformationService informationService;

    @ResponseBody
    @RequestMapping("/list")
    public Object getInformation(
            @RequestParam("limit") Integer limit,
            @RequestParam("offset") Integer offset,
            @RequestParam("order") String order,
            @RequestParam("ordername") String ordername,
            @RequestParam("uid") String uid,
            @RequestParam("name") String name) {

        ArrayList<Information> infomationList = informationService.listAll(limit, offset, order, ordername, uid, name);

        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("data", infomationList);
        hashMap.put("count", infomationList.size());

        return hashMap;
    }
}
