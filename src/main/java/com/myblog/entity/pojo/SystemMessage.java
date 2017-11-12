package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "system_message", schema = "myblog", catalog = "")
public class SystemMessage {
    private int id;
    private Integer sendId;
    private Integer groupId;
    private Integer sendDefault;
    private String systemTopic;
    private String systemContent;

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
    @Column(name = "send_id", nullable = true)
    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    @Basic
    @Column(name = "group_id", nullable = true)
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "send_default", nullable = true)
    public Integer getSendDefault() {
        return sendDefault;
    }

    public void setSendDefault(Integer sendDefault) {
        this.sendDefault = sendDefault;
    }

    @Basic
    @Column(name = "system_topic", nullable = true, length = 60)
    public String getSystemTopic() {
        return systemTopic;
    }

    public void setSystemTopic(String systemTopic) {
        this.systemTopic = systemTopic;
    }

    @Basic
    @Column(name = "system_content", nullable = true, length = 255)
    public String getSystemContent() {
        return systemContent;
    }

    public void setSystemContent(String systemContent) {
        this.systemContent = systemContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemMessage that = (SystemMessage) o;

        if (id != that.id) return false;
        if (sendId != null ? !sendId.equals(that.sendId) : that.sendId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (sendDefault != null ? !sendDefault.equals(that.sendDefault) : that.sendDefault != null) return false;
        if (systemTopic != null ? !systemTopic.equals(that.systemTopic) : that.systemTopic != null) return false;
        if (systemContent != null ? !systemContent.equals(that.systemContent) : that.systemContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sendId != null ? sendId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (sendDefault != null ? sendDefault.hashCode() : 0);
        result = 31 * result + (systemTopic != null ? systemTopic.hashCode() : 0);
        result = 31 * result + (systemContent != null ? systemContent.hashCode() : 0);
        return result;
    }
}
