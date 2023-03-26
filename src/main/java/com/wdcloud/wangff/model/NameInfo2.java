package com.wdcloud.wangff.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "name_info2")
public class NameInfo2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer year;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }
}