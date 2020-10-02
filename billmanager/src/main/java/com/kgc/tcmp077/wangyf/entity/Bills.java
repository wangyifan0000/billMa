package com.kgc.tcmp077.wangyf.entity;

import java.util.Date;

public class Bills {
    private Integer id;

    private String title;

    private Date bibleTime;

    private Integer typeId;

    private Integer price;

    private String explian;
    private String  typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getBibleTime() {
        return bibleTime;
    }

    public void setBibleTime(Date bibleTime) {
        this.bibleTime = bibleTime;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getExplian() {
        return explian;
    }

    public void setExplian(String explian) {
        this.explian = explian == null ? null : explian.trim();
    }
}