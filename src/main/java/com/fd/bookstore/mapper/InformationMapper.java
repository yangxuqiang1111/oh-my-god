package com.fd.bookstore.mapper;

import com.fd.bookstore.po.Information;

import java.util.ArrayList;

public interface InformationMapper {
    int deleteByPrimaryKey(String uid);

    int insert(Information record);

    int insertSelective(Information record);

    Information selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);

    ArrayList<Information> listAll(Integer limit, Integer offset, String order, String ordername, String uid, String name);
}