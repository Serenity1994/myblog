package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "power_list", schema = "myblog", catalog = "")
public class PowerList {
    private int id;
    private Integer powerId;
    private String powerName;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "power_id", nullable = true)
    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    @Basic
    @Column(name = "power_name", nullable = true, length = 36)
    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PowerList powerList = (PowerList) o;

        if (id != powerList.id) return false;
        if (powerId != null ? !powerId.equals(powerList.powerId) : powerList.powerId != null) return false;
        if (powerName != null ? !powerName.equals(powerList.powerName) : powerList.powerName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (powerId != null ? powerId.hashCode() : 0);
        result = 31 * result + (powerName != null ? powerName.hashCode() : 0);
        return result;
    }
}
