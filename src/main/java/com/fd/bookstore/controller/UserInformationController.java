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
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "pageTotal", defaultValue = "10") Integer pageTotal,
            @RequestParam(value = "order", required = false) String order,
            @RequestParam(value = "ordername", required = false) String ordername,
            @RequestParam(value = "uid", required = false) String uid,
            @RequestParam(value = "name", required = false) String name) {

        ArrayList<Information> infomationList = informationService.listAll(page, pageTotal, order, ordername, uid, name);

        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("data", infomationList);
        hashMap.put("count", infomationList.size());

        return hashMap;
    }
}
