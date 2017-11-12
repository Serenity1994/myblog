package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "photos", schema = "myblog", catalog = "")
public class Photos {
    private int id;
    private String photoName;
    private String photoSrc;
    private String photoDescription;
    private Integer userId;
    private Integer sortId;
    private Integer uploadTime;
    private String uploadIp;

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
    @Column(name = "photo_name", nullable = true, length = 255)
    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    @Basic
    @Column(name = "photo_src", nullable = true, length = 255)
    public String getPhotoSrc() {
        return photoSrc;
    }

    public void setPhotoSrc(String photoSrc) {
        this.photoSrc = photoSrc;
    }

    @Basic
    @Column(name = "photo_description", nullable = true, length = 255)
    public String getPhotoDescription() {
        return photoDescription;
    }

    public void setPhotoDescription(String photoDescription) {
        this.photoDescription = photoDescription;
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
    @Column(name = "sort_id", nullable = true)
    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    @Basic
    @Column(name = "upload_time", nullable = true)
    public Integer getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Integer uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Basic
    @Column(name = "upload_ip", nullable = true, length = 15)
    public String getUploadIp() {
        return uploadIp;
    }

    public void setUploadIp(String uploadIp) {
        this.uploadIp = uploadIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photos photos = (Photos) o;

        if (id != photos.id) return false;
        if (photoName != null ? !photoName.equals(photos.photoName) : photos.photoName != null) return false;
        if (photoSrc != null ? !photoSrc.equals(photos.photoSrc) : photos.photoSrc != null) return false;
        if (photoDescription != null ? !photoDescription.equals(photos.photoDescription) : photos.photoDescription != null)
            return false;
        if (userId != null ? !userId.equals(photos.userId) : photos.userId != null) return false;
        if (sortId != null ? !sortId.equals(photos.sortId) : photos.sortId != null) return false;
        if (uploadTime != null ? !uploadTime.equals(photos.uploadTime) : photos.uploadTime != null) return false;
        if (uploadIp != null ? !uploadIp.equals(photos.uploadIp) : photos.uploadIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (photoName != null ? photoName.hashCode() : 0);
        result = 31 * result + (photoSrc != null ? photoSrc.hashCode() : 0);
        result = 31 * result + (photoDescription != null ? photoDescription.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (sortId != null ? sortId.hashCode() : 0);
        result = 31 * result + (uploadTime != null ? uploadTime.hashCode() : 0);
        result = 31 * result + (uploadIp != null ? uploadIp.hashCode() : 0);
        return result;
    }
}
