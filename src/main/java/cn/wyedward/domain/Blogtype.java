package cn.wyedward.domain;

import java.io.Serializable;

/**
 * 博客类别
 */
public class Blogtype implements Serializable {
    private int id; //博客id
    private String typeName; //博客类别
    private int orderNum; //博客排序

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
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
