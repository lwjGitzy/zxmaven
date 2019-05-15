package com.jk.model;

import java.util.List;

public class DeptBean {
    private Integer id;
    private String text;//name
    private Integer pid;
    //
    private List<DeptBean> children;


    public DeptBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    public DeptBean(Integer id, String text, Integer pid, List<DeptBean> children) {
        super();
        this.id = id;
        this.text = text;
        this.pid = pid;
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<DeptBean> getChildren() {
        return children;
    }

    public void setChildren(List<DeptBean> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "DeptBean{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", pid=" + pid +
                ", children=" + children +
                '}';
    }
}
