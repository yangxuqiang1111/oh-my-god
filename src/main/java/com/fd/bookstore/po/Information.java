package com.fd.bookstore.po;

import java.util.Date;

public class Information {
    private String uid;

    private String name;

    private String sex;

    private String age;

    private String area;

    private String loginway;

    private String status;

    private Date createtime;

    private String orderservice;

    private String connectip;

    private String connectport;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getLoginway() {
        return loginway;
    }

    public void setLoginway(String loginway) {
        this.loginway = loginway == null ? null : loginway.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getOrderservice() {
        return orderservice;
    }

    public void setOrderservice(String orderservice) {
        this.orderservice = orderservice == null ? null : orderservice.trim();
    }

    public String getConnectip() {
        return connectip;
    }

    public void setConnectip(String connectip) {
        this.connectip = connectip == null ? null : connectip.trim();
    }

    public String getConnectport() {
        return connectport;
    }

    public void setConnectport(String connectport) {
        this.connectport = connectport == null ? null : connectport.trim();
    }
}