package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "article_sort", schema = "myblog", catalog = "")
public class ArticleSort {
    private int id;
    private Integer userId;
    private String sortArticleName;

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
    @Column(name = "sort_article_name", nullable = true, length = 60)
    public String getSortArticleName() {
        return sortArticleName;
    }

    public void setSortArticleName(String sortArticleName) {
        this.sortArticleName = sortArticleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleSort that = (ArticleSort) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (sortArticleName != null ? !sortArticleName.equals(that.sortArticleName) : that.sortArticleName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (sortArticleName != null ? sortArticleName.hashCode() : 0);
        return result;
    }
}
