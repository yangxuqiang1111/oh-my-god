package com.fd.bookstore.mapper;

import com.fd.bookstore.po.Information;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface InformationMapper {
    int deleteByPrimaryKey(String uid);

    int insert(Information record);

    int insertSelective(Information record);

    Information selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);

    ArrayList<Information> listAll(@Param("offset") Integer offset, @Param("pageTotal") Integer pageTotal,
                                   @Param("order") String order, @Param("ordername") String ordername,
                                   @Param("uid") String uid, @Param("name") String name);
}