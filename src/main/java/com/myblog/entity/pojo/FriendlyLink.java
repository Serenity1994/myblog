package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "friendly_link", schema = "myblog", catalog = "")
public class FriendlyLink {
    private int id;
    private String linkName;
    private String linkUrl;
    private String linkLogo;
    private Integer showOrder;

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
    @Column(name = "link_name", nullable = true, length = 60)
    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    @Basic
    @Column(name = "link_url", nullable = true, length = 255)
    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    @Basic
    @Column(name = "link_logo", nullable = true, length = 255)
    public String getLinkLogo() {
        return linkLogo;
    }

    public void setLinkLogo(String linkLogo) {
        this.linkLogo = linkLogo;
    }

    @Basic
    @Column(name = "show_order", nullable = true)
    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FriendlyLink that = (FriendlyLink) o;

        if (id != that.id) return false;
        if (linkName != null ? !linkName.equals(that.linkName) : that.linkName != null) return false;
        if (linkUrl != null ? !linkUrl.equals(that.linkUrl) : that.linkUrl != null) return false;
        if (linkLogo != null ? !linkLogo.equals(that.linkLogo) : that.linkLogo != null) return false;
        if (showOrder != null ? !showOrder.equals(that.showOrder) : that.showOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (linkName != null ? linkName.hashCode() : 0);
        result = 31 * result + (linkUrl != null ? linkUrl.hashCode() : 0);
        result = 31 * result + (linkLogo != null ? linkLogo.hashCode() : 0);
        result = 31 * result + (showOrder != null ? showOrder.hashCode() : 0);
        return result;
    }
}
