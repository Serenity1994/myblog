package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "photo_sort", schema = "myblog", catalog = "")
public class PhotoSort {
    private int id;
    private String sortImgName;
    private String sortImgType;
    private String imgPassword;
    private Integer userId;
    private String imgSortQuestion;
    private String imgSortAnswer;
    private Integer typeId;
    private Integer topPicSrc;

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
    @Column(name = "sort_img_name", nullable = true, length = 20)
    public String getSortImgName() {
        return sortImgName;
    }

    public void setSortImgName(String sortImgName) {
        this.sortImgName = sortImgName;
    }

    @Basic
    @Column(name = "sort_img_type", nullable = true, length = 20)
    public String getSortImgType() {
        return sortImgType;
    }

    public void setSortImgType(String sortImgType) {
        this.sortImgType = sortImgType;
    }

    @Basic
    @Column(name = "img_password", nullable = true, length = 32)
    public String getImgPassword() {
        return imgPassword;
    }

    public void setImgPassword(String imgPassword) {
        this.imgPassword = imgPassword;
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
    @Column(name = "img_sort_question", nullable = true, length = 255)
    public String getImgSortQuestion() {
        return imgSortQuestion;
    }

    public void setImgSortQuestion(String imgSortQuestion) {
        this.imgSortQuestion = imgSortQuestion;
    }

    @Basic
    @Column(name = "img_sort_answer", nullable = true, length = 128)
    public String getImgSortAnswer() {
        return imgSortAnswer;
    }

    public void setImgSortAnswer(String imgSortAnswer) {
        this.imgSortAnswer = imgSortAnswer;
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
    @Column(name = "top_pic_src", nullable = true)
    public Integer getTopPicSrc() {
        return topPicSrc;
    }

    public void setTopPicSrc(Integer topPicSrc) {
        this.topPicSrc = topPicSrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoSort photoSort = (PhotoSort) o;

        if (id != photoSort.id) return false;
        if (sortImgName != null ? !sortImgName.equals(photoSort.sortImgName) : photoSort.sortImgName != null)
            return false;
        if (sortImgType != null ? !sortImgType.equals(photoSort.sortImgType) : photoSort.sortImgType != null)
            return false;
        if (imgPassword != null ? !imgPassword.equals(photoSort.imgPassword) : photoSort.imgPassword != null)
            return false;
        if (userId != null ? !userId.equals(photoSort.userId) : photoSort.userId != null) return false;
        if (imgSortQuestion != null ? !imgSortQuestion.equals(photoSort.imgSortQuestion) : photoSort.imgSortQuestion != null)
            return false;
        if (imgSortAnswer != null ? !imgSortAnswer.equals(photoSort.imgSortAnswer) : photoSort.imgSortAnswer != null)
            return false;
        if (typeId != null ? !typeId.equals(photoSort.typeId) : photoSort.typeId != null) return false;
        if (topPicSrc != null ? !topPicSrc.equals(photoSort.topPicSrc) : photoSort.topPicSrc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sortImgName != null ? sortImgName.hashCode() : 0);
        result = 31 * result + (sortImgType != null ? sortImgType.hashCode() : 0);
        result = 31 * result + (imgPassword != null ? imgPassword.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (imgSortQuestion != null ? imgSortQuestion.hashCode() : 0);
        result = 31 * result + (imgSortAnswer != null ? imgSortAnswer.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (topPicSrc != null ? topPicSrc.hashCode() : 0);
        return result;
    }
}
