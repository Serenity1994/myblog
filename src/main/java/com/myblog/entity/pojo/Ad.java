package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "ad", schema = "myblog", catalog = "")
public class Ad {
    private int id;
    private Integer positionId;
    private Integer mediaType;
    private String adName;
    private String adLink;
    private String adCode;
    private Integer startTime;
    private Integer endTime;
    private String linkMan;
    private String linkEmail;
    private String linkPhone;
    private Integer clickCount;
    private Integer enabled;

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
    @Column(name = "position_id", nullable = true)
    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    @Basic
    @Column(name = "media_type", nullable = true)
    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    @Basic
    @Column(name = "ad_name", nullable = true, length = 60)
    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    @Basic
    @Column(name = "ad_link", nullable = true, length = 255)
    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }

    @Basic
    @Column(name = "ad_code", nullable = true, length = -1)
    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode;
    }

    @Basic
    @Column(name = "start_time", nullable = true)
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "link_man", nullable = true, length = 60)
    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    @Basic
    @Column(name = "link_email", nullable = true, length = 60)
    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }

    @Basic
    @Column(name = "link_phone", nullable = true, length = 60)
    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    @Basic
    @Column(name = "click_count", nullable = true)
    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    @Basic
    @Column(name = "enabled", nullable = true)
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ad ad = (Ad) o;

        if (id != ad.id) return false;
        if (positionId != null ? !positionId.equals(ad.positionId) : ad.positionId != null) return false;
        if (mediaType != null ? !mediaType.equals(ad.mediaType) : ad.mediaType != null) return false;
        if (adName != null ? !adName.equals(ad.adName) : ad.adName != null) return false;
        if (adLink != null ? !adLink.equals(ad.adLink) : ad.adLink != null) return false;
        if (adCode != null ? !adCode.equals(ad.adCode) : ad.adCode != null) return false;
        if (startTime != null ? !startTime.equals(ad.startTime) : ad.startTime != null) return false;
        if (endTime != null ? !endTime.equals(ad.endTime) : ad.endTime != null) return false;
        if (linkMan != null ? !linkMan.equals(ad.linkMan) : ad.linkMan != null) return false;
        if (linkEmail != null ? !linkEmail.equals(ad.linkEmail) : ad.linkEmail != null) return false;
        if (linkPhone != null ? !linkPhone.equals(ad.linkPhone) : ad.linkPhone != null) return false;
        if (clickCount != null ? !clickCount.equals(ad.clickCount) : ad.clickCount != null) return false;
        if (enabled != null ? !enabled.equals(ad.enabled) : ad.enabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (positionId != null ? positionId.hashCode() : 0);
        result = 31 * result + (mediaType != null ? mediaType.hashCode() : 0);
        result = 31 * result + (adName != null ? adName.hashCode() : 0);
        result = 31 * result + (adLink != null ? adLink.hashCode() : 0);
        result = 31 * result + (adCode != null ? adCode.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (linkMan != null ? linkMan.hashCode() : 0);
        result = 31 * result + (linkEmail != null ? linkEmail.hashCode() : 0);
        result = 31 * result + (linkPhone != null ? linkPhone.hashCode() : 0);
        result = 31 * result + (clickCount != null ? clickCount.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }
}
