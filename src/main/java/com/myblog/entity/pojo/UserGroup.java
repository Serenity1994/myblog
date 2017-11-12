package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "user_group", schema = "myblog", catalog = "")
public class UserGroup {
    private int id;
    private Integer groupId;
    private String groupName;
    private String groupPower;

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
    @Column(name = "group_id", nullable = true)
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "group_name", nullable = true, length = 20)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "group_power", nullable = true, length = 20)
    public String getGroupPower() {
        return groupPower;
    }

    public void setGroupPower(String groupPower) {
        this.groupPower = groupPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserGroup userGroup = (UserGroup) o;

        if (id != userGroup.id) return false;
        if (groupId != null ? !groupId.equals(userGroup.groupId) : userGroup.groupId != null) return false;
        if (groupName != null ? !groupName.equals(userGroup.groupName) : userGroup.groupName != null) return false;
        if (groupPower != null ? !groupPower.equals(userGroup.groupPower) : userGroup.groupPower != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (groupPower != null ? groupPower.hashCode() : 0);
        return result;
    }
}
