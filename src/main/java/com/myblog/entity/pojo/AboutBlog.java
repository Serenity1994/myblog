package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "about_blog", schema = "myblog", catalog = "")
public class AboutBlog {
    private int id;
    private String blogKeyword;
    private String blogDescription;
    private String blogName;
    private String blogTitle;

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
    @Column(name = "blog_keyword", nullable = true, length = 255)
    public String getBlogKeyword() {
        return blogKeyword;
    }

    public void setBlogKeyword(String blogKeyword) {
        this.blogKeyword = blogKeyword;
    }

    @Basic
    @Column(name = "blog_description", nullable = true, length = 255)
    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

    @Basic
    @Column(name = "blog_name", nullable = true, length = 36)
    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    @Basic
    @Column(name = "blog_title", nullable = true, length = 128)
    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AboutBlog aboutBlog = (AboutBlog) o;

        if (id != aboutBlog.id) return false;
        if (blogKeyword != null ? !blogKeyword.equals(aboutBlog.blogKeyword) : aboutBlog.blogKeyword != null)
            return false;
        if (blogDescription != null ? !blogDescription.equals(aboutBlog.blogDescription) : aboutBlog.blogDescription != null)
            return false;
        if (blogName != null ? !blogName.equals(aboutBlog.blogName) : aboutBlog.blogName != null) return false;
        if (blogTitle != null ? !blogTitle.equals(aboutBlog.blogTitle) : aboutBlog.blogTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (blogKeyword != null ? blogKeyword.hashCode() : 0);
        result = 31 * result + (blogDescription != null ? blogDescription.hashCode() : 0);
        result = 31 * result + (blogName != null ? blogName.hashCode() : 0);
        result = 31 * result + (blogTitle != null ? blogTitle.hashCode() : 0);
        return result;
    }
}
