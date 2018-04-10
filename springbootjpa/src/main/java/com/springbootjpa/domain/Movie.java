package com.springbootjpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 */
@Entity//说明此类是实体类
@Table(name="MOVIE") //说明实体类对应的表名
public class Movie implements Serializable{
    private static final long serialVersionUID = -8628422620493809849L;
    @Id
    //主键
    //id的值自动增长
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //字段对应属性
    @Column
    private String name;

    @Column
    private Double price;

    @Column(name = "action_time")
    private Date actionTime;

    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }
}
