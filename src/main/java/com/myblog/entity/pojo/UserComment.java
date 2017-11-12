package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "user_comment", schema = "myblog", catalog = "")
public class UserComment {
    private int id;
    private Integer userId;
    private Integer typeId;
    private Integer commitId;
    private String commitContent;
    private Integer commitUserId;
    private Integer commitTime;
    private String commitIp;

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
    @Column(name = "type_id", nullable = true)
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "commit_id", nullable = true)
    public Integer getCommitId() {
        return commitId;
    }

    public void setCommitId(Integer commitId) {
        this.commitId = commitId;
    }

    @Basic
    @Column(name = "commit_content", nullable = true, length = 255)
    public String getCommitContent() {
        return commitContent;
    }

    public void setCommitContent(String commitContent) {
        this.commitContent = commitContent;
    }

    @Basic
    @Column(name = "commit_user_id", nullable = true)
    public Integer getCommitUserId() {
        return commitUserId;
    }

    public void setCommitUserId(Integer commitUserId) {
        this.commitUserId = commitUserId;
    }

    @Basic
    @Column(name = "commit_time", nullable = true)
    public Integer getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Integer commitTime) {
        this.commitTime = commitTime;
    }

    @Basic
    @Column(name = "commit_ip", nullable = true, length = 15)
    public String getCommitIp() {
        return commitIp;
    }

    public void setCommitIp(String commitIp) {
        this.commitIp = commitIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserComment that = (UserComment) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;
        if (commitId != null ? !commitId.equals(that.commitId) : that.commitId != null) return false;
        if (commitContent != null ? !commitContent.equals(that.commitContent) : that.commitContent != null)
            return false;
        if (commitUserId != null ? !commitUserId.equals(that.commitUserId) : that.commitUserId != null) return false;
        if (commitTime != null ? !commitTime.equals(that.commitTime) : that.commitTime != null) return false;
        if (commitIp != null ? !commitIp.equals(that.commitIp) : that.commitIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (commitId != null ? commitId.hashCode() : 0);
        result = 31 * result + (commitContent != null ? commitContent.hashCode() : 0);
        result = 31 * result + (commitUserId != null ? commitUserId.hashCode() : 0);
        result = 31 * result + (commitTime != null ? commitTime.hashCode() : 0);
        result = 31 * result + (commitIp != null ? commitIp.hashCode() : 0);
        return result;
    }
}
