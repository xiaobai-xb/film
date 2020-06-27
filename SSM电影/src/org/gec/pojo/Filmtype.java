package org.gec.pojo;

import java.io.Serializable;

public class Filmtype implements Serializable {
    private Integer typeid;

    private String typename;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    @Override
    public String toString() {
        return "Filmtype{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                '}';
    }
}