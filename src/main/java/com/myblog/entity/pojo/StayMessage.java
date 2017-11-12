package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "stay_message", schema = "myblog", catalog = "")
public class StayMessage {
    private int id;
    private Integer userId;
    private Integer stayUserId;
    private String messageContent;
    private String stayUserIp;
    private Integer messageStayTime;
    private String place;

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
    @Column(name = "stay_user_id", nullable = true)
    public Integer getStayUserId() {
        return stayUserId;
    }

    public void setStayUserId(Integer stayUserId) {
        this.stayUserId = stayUserId;
    }

    @Basic
    @Column(name = "message_content", nullable = true, length = 255)
    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @Basic
    @Column(name = "stay_user_ip", nullable = true, length = 15)
    public String getStayUserIp() {
        return stayUserIp;
    }

    public void setStayUserIp(String stayUserIp) {
        this.stayUserIp = stayUserIp;
    }

    @Basic
    @Column(name = "message_stay_time", nullable = true)
    public Integer getMessageStayTime() {
        return messageStayTime;
    }

    public void setMessageStayTime(Integer messageStayTime) {
        this.messageStayTime = messageStayTime;
    }

    @Basic
    @Column(name = "place", nullable = true, length = 64)
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StayMessage that = (StayMessage) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (stayUserId != null ? !stayUserId.equals(that.stayUserId) : that.stayUserId != null) return false;
        if (messageContent != null ? !messageContent.equals(that.messageContent) : that.messageContent != null)
            return false;
        if (stayUserIp != null ? !stayUserIp.equals(that.stayUserIp) : that.stayUserIp != null) return false;
        if (messageStayTime != null ? !messageStayTime.equals(that.messageStayTime) : that.messageStayTime != null)
            return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (stayUserId != null ? stayUserId.hashCode() : 0);
        result = 31 * result + (messageContent != null ? messageContent.hashCode() : 0);
        result = 31 * result + (stayUserIp != null ? stayUserIp.hashCode() : 0);
        result = 31 * result + (messageStayTime != null ? messageStayTime.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        return result;
    }
}
