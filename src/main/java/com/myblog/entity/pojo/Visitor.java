package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "visitor", schema = "myblog", catalog = "")
public class Visitor {
    private int id;
    private Integer visitorId;
    private Integer visitorTime;
    private Integer userId;
    private String visitorIp;
    private Integer typeId;
    private Integer whereId;

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
    @Column(name = "visitor_id", nullable = true)
    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    @Basic
    @Column(name = "visitor_time", nullable = true)
    public Integer getVisitorTime() {
        return visitorTime;
    }

    public void setVisitorTime(Integer visitorTime) {
        this.visitorTime = visitorTime;
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
    @Column(name = "visitor_ip", nullable = true, length = 15)
    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp;
    }

    @Basic
    @Column(name = "type_id", nullable = true)
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "where_id", nullable = true)
    public Integer getWhereId() {
        return whereId;
    }

    public void setWhereId(Integer whereId) {
        this.whereId = whereId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Visitor visitor = (Visitor) o;

        if (id != visitor.id) return false;
        if (visitorId != null ? !visitorId.equals(visitor.visitorId) : visitor.visitorId != null) return false;
        if (visitorTime != null ? !visitorTime.equals(visitor.visitorTime) : visitor.visitorTime != null) return false;
        if (userId != null ? !userId.equals(visitor.userId) : visitor.userId != null) return false;
        if (visitorIp != null ? !visitorIp.equals(visitor.visitorIp) : visitor.visitorIp != null) return false;
        if (typeId != null ? !typeId.equals(visitor.typeId) : visitor.typeId != null) return false;
        if (whereId != null ? !whereId.equals(visitor.whereId) : visitor.whereId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (visitorId != null ? visitorId.hashCode() : 0);
        result = 31 * result + (visitorTime != null ? visitorTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (visitorIp != null ? visitorIp.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (whereId != null ? whereId.hashCode() : 0);
        return result;
    }
}
