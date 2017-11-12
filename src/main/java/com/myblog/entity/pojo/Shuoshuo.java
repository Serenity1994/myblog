package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "shuoshuo", schema = "myblog", catalog = "")
public class Shuoshuo {
    private int id;
    private Integer userId;
    private Integer shuoTime;
    private String shuoIp;
    private String shuoshuo;
    private Integer typeId;

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
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "shuo_time", nullable = true)
    public Integer getShuoTime() {
        return shuoTime;
    }

    public void setShuoTime(Integer shuoTime) {
        this.shuoTime = shuoTime;
    }

    @Basic
    @Column(name = "shuo_ip", nullable = true, length = 15)
    public String getShuoIp() {
        return shuoIp;
    }

    public void setShuoIp(String shuoIp) {
        this.shuoIp = shuoIp;
    }

    @Basic
    @Column(name = "shuoshuo", nullable = true, length = 255)
    public String getShuoshuo() {
        return shuoshuo;
    }

    public void setShuoshuo(String shuoshuo) {
        this.shuoshuo = shuoshuo;
    }

    @Basic
    @Column(name = "type_id", nullable = true)
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shuoshuo shuoshuo1 = (Shuoshuo) o;

        if (id != shuoshuo1.id) return false;
        if (userId != null ? !userId.equals(shuoshuo1.userId) : shuoshuo1.userId != null) return false;
        if (shuoTime != null ? !shuoTime.equals(shuoshuo1.shuoTime) : shuoshuo1.shuoTime != null) return false;
        if (shuoIp != null ? !shuoIp.equals(shuoshuo1.shuoIp) : shuoshuo1.shuoIp != null) return false;
        if (shuoshuo != null ? !shuoshuo.equals(shuoshuo1.shuoshuo) : shuoshuo1.shuoshuo != null) return false;
        if (typeId != null ? !typeId.equals(shuoshuo1.typeId) : shuoshuo1.typeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (shuoTime != null ? shuoTime.hashCode() : 0);
        result = 31 * result + (shuoIp != null ? shuoIp.hashCode() : 0);
        result = 31 * result + (shuoshuo != null ? shuoshuo.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        return result;
    }
}
