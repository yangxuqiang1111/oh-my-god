package com.fd.bookstore.service;

import com.fd.bookstore.po.Information;

import java.util.ArrayList;

/**
 * Created by fangdi on 2017/8/23.
 */
public interface InformationService {

    public ArrayList<Information> listAll(Integer limit, Integer offset, String order, String ordername, String uid, String name);
}
