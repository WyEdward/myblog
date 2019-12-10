package cn.wyedward.domain;

import java.io.Serializable;

/**
 * 博客类别
 */
public class Blogtype implements Serializable {
    private Integer id; //博客id
    private String typeName; //博客类别
    private Integer orderNum; //博客排序

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "Blogtype{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
