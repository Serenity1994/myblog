package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "user_rank", schema = "myblog", catalog = "")
public class UserRank {
    private int id;
    private Integer userRankId;
    private Integer rankMark;
    private String rankName;

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
    @Column(name = "user_rank_id", nullable = true)
    public Integer getUserRankId() {
        return userRankId;
    }

    public void setUserRankId(Integer userRankId) {
        this.userRankId = userRankId;
    }

    @Basic
    @Column(name = "rank_mark", nullable = true)
    public Integer getRankMark() {
        return rankMark;
    }

    public void setRankMark(Integer rankMark) {
        this.rankMark = rankMark;
    }

    @Basic
    @Column(name = "rank_name", nullable = true, length = 32)
    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRank userRank = (UserRank) o;

        if (id != userRank.id) return false;
        if (userRankId != null ? !userRankId.equals(userRank.userRankId) : userRank.userRankId != null) return false;
        if (rankMark != null ? !rankMark.equals(userRank.rankMark) : userRank.rankMark != null) return false;
        if (rankName != null ? !rankName.equals(userRank.rankName) : userRank.rankName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userRankId != null ? userRankId.hashCode() : 0);
        result = 31 * result + (rankMark != null ? rankMark.hashCode() : 0);
        result = 31 * result + (rankName != null ? rankName.hashCode() : 0);
        return result;
    }
}
