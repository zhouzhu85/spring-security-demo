package com.zhouzhu.domain;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-19 11:10
 */
public class Permission {
    private Integer id;
    private String permName;
    private String permTag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getPermTag() {
        return permTag;
    }

    public void setPermTag(String permTag) {
        this.permTag = permTag;
    }
}
