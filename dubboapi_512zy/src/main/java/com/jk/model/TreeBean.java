package com.jk.model;

import java.util.List;

public class TreeBean {


    private Integer  id;
    private String  text;//树节点名称
    private String  url;//跳转地址
    private Integer   pid;//	父id

    private String state;
    private List<TreeBean> children;
    //
    private Boolean checked;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<TreeBean> getChildren() {
        return children;
    }

    public void setChildren(List<TreeBean> children) {
        this.children = children;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "TreeBean{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", pid=" + pid +
                ", state='" + state + '\'' +
                ", children=" + children +
                ", checked=" + checked +
                '}';
    }
}
