package com.fd.bookstore.service.impl;

import com.fd.bookstore.mapper.InformationMapper;
import com.fd.bookstore.po.Information;
import com.fd.bookstore.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by fangdi on 2017/8/23.
 */
@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    InformationMapper informationMapper;

    public ArrayList<Information> listAll(Integer limit, Integer offset, String order, String ordername, String uid, String name) {
        return informationMapper.listAll(limit, offset, order, ordername, uid, name);
    }
}
