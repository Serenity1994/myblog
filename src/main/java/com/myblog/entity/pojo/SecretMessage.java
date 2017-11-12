package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "secret_message", schema = "myblog", catalog = "")
public class SecretMessage {
    private int id;
    private Integer sendId;
    private Integer receiveId;
    private String messageTopic;
    private String messageContent;

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
    @Column(name = "receive_id", nullable = true)
    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    @Basic
    @Column(name = "message_topic", nullable = true, length = 64)
    public String getMessageTopic() {
        return messageTopic;
    }

    public void setMessageTopic(String messageTopic) {
        this.messageTopic = messageTopic;
    }

    @Basic
    @Column(name = "message_content", nullable = true, length = 255)
    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecretMessage that = (SecretMessage) o;

        if (id != that.id) return false;
        if (sendId != null ? !sendId.equals(that.sendId) : that.sendId != null) return false;
        if (receiveId != null ? !receiveId.equals(that.receiveId) : that.receiveId != null) return false;
        if (messageTopic != null ? !messageTopic.equals(that.messageTopic) : that.messageTopic != null) return false;
        if (messageContent != null ? !messageContent.equals(that.messageContent) : that.messageContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sendId != null ? sendId.hashCode() : 0);
        result = 31 * result + (receiveId != null ? receiveId.hashCode() : 0);
        result = 31 * result + (messageTopic != null ? messageTopic.hashCode() : 0);
        result = 31 * result + (messageContent != null ? messageContent.hashCode() : 0);
        return result;
    }
}
