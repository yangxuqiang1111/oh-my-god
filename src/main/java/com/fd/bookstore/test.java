package com.fd.bookstore;

import com.fd.bookstore.model.Source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fangdi on 2017/8/6.
 */
public class test {
    public void test1() {
        /**
         * 查询数据库
         */
        ArrayList<Source> sourceList = new ArrayList<Source>();
        Source source1 = new Source();
        source1.setBaidu("123");
        source1.setGuge("456");
        source1.setMail("789");

        sourceList.add(source1);

        HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
        HashMap<String, String> mondayHashMap = new HashMap<String, String>();
        mondayHashMap.put("百度", sourceList.get(0).getBaidu());
        mondayHashMap.put("谷歌", sourceList.get(0).getGuge());
        mondayHashMap.put("邮箱", sourceList.get(0).getMail());
        hashMap.put("周一", mondayHashMap);


    }
}
