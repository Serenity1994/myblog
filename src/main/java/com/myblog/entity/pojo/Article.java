package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "article", schema = "myblog", catalog = "")
public class Article {
    private int id;
    private String articleName;
    private Integer articleTime;
    private String articleIp;
    private Integer articleClick;
    private Integer sortArticleId;
    private Integer userId;
    private Integer typeId;
    private Integer articleType;
    private String articleContent;
    private Integer articleUp;
    private Integer articleSupport;

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
    @Column(name = "article_name", nullable = true, length = 128)
    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    @Basic
    @Column(name = "article_time", nullable = true)
    public Integer getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Integer articleTime) {
        this.articleTime = articleTime;
    }

    @Basic
    @Column(name = "article_ip", nullable = true, length = 15)
    public String getArticleIp() {
        return articleIp;
    }

    public void setArticleIp(String articleIp) {
        this.articleIp = articleIp;
    }

    @Basic
    @Column(name = "article_click", nullable = true)
    public Integer getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(Integer articleClick) {
        this.articleClick = articleClick;
    }

    @Basic
    @Column(name = "sort_article_id", nullable = true)
    public Integer getSortArticleId() {
        return sortArticleId;
    }

    public void setSortArticleId(Integer sortArticleId) {
        this.sortArticleId = sortArticleId;
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
    @Column(name = "article_type", nullable = true)
    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    @Basic
    @Column(name = "article_content", nullable = true, length = -1)
    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Basic
    @Column(name = "article_up", nullable = true)
    public Integer getArticleUp() {
        return articleUp;
    }

    public void setArticleUp(Integer articleUp) {
        this.articleUp = articleUp;
    }

    @Basic
    @Column(name = "article_support", nullable = true)
    public Integer getArticleSupport() {
        return articleSupport;
    }

    public void setArticleSupport(Integer articleSupport) {
        this.articleSupport = articleSupport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != article.id) return false;
        if (articleName != null ? !articleName.equals(article.articleName) : article.articleName != null) return false;
        if (articleTime != null ? !articleTime.equals(article.articleTime) : article.articleTime != null) return false;
        if (articleIp != null ? !articleIp.equals(article.articleIp) : article.articleIp != null) return false;
        if (articleClick != null ? !articleClick.equals(article.articleClick) : article.articleClick != null)
            return false;
        if (sortArticleId != null ? !sortArticleId.equals(article.sortArticleId) : article.sortArticleId != null)
            return false;
        if (userId != null ? !userId.equals(article.userId) : article.userId != null) return false;
        if (typeId != null ? !typeId.equals(article.typeId) : article.typeId != null) return false;
        if (articleType != null ? !articleType.equals(article.articleType) : article.articleType != null) return false;
        if (articleContent != null ? !articleContent.equals(article.articleContent) : article.articleContent != null)
            return false;
        if (articleUp != null ? !articleUp.equals(article.articleUp) : article.articleUp != null) return false;
        if (articleSupport != null ? !articleSupport.equals(article.articleSupport) : article.articleSupport != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (articleName != null ? articleName.hashCode() : 0);
        result = 31 * result + (articleTime != null ? articleTime.hashCode() : 0);
        result = 31 * result + (articleIp != null ? articleIp.hashCode() : 0);
        result = 31 * result + (articleClick != null ? articleClick.hashCode() : 0);
        result = 31 * result + (sortArticleId != null ? sortArticleId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (articleType != null ? articleType.hashCode() : 0);
        result = 31 * result + (articleContent != null ? articleContent.hashCode() : 0);
        result = 31 * result + (articleUp != null ? articleUp.hashCode() : 0);
        result = 31 * result + (articleSupport != null ? articleSupport.hashCode() : 0);
        return result;
    }
}
