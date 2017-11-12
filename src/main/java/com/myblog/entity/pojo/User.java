package com.myblog.entity.pojo;

import javax.persistence.*;

/**
 * @author serenity
 * @date 17-11-11 22:34
 */
@Entity
@Table(name = "user", schema = "myblog", catalog = "")
public class User {
    private int id;
    private Integer groupId;
    private String userName;
    private String userPwd;
    private Integer userPhone;
    private String userSex;
    private Integer userQq;
    private String userEmail;
    private String userAddress;
    private Integer userMark;
    private Integer userRankId;
    private String userLastLoginIp;
    private Integer userBirthday;
    private String userDescription;
    private String userImageUrl;
    private String userSchool;
    private Integer userRegisterTime;
    private String userRegisterIp;
    private Integer userLastUpdateTime;
    private String userWeibo;
    private String userBloodType;
    private String userSays;
    private Integer userLock;
    private Integer userFreeze;
    private String userPower;

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
    @Column(name = "user_name", nullable = true, length = 32)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_pwd", nullable = true, length = 32)
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Basic
    @Column(name = "user_phone", nullable = true)
    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "user_sex", nullable = true, length = 6)
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "user_qq", nullable = true)
    public Integer getUserQq() {
        return userQq;
    }

    public void setUserQq(Integer userQq) {
        this.userQq = userQq;
    }

    @Basic
    @Column(name = "user_email", nullable = true, length = 64)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_address", nullable = true, length = 255)
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Basic
    @Column(name = "user_mark", nullable = true)
    public Integer getUserMark() {
        return userMark;
    }

    public void setUserMark(Integer userMark) {
        this.userMark = userMark;
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
    @Column(name = "user_last_login_ip", nullable = true, length = 15)
    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp;
    }

    @Basic
    @Column(name = "user_birthday", nullable = true)
    public Integer getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Integer userBirthday) {
        this.userBirthday = userBirthday;
    }

    @Basic
    @Column(name = "user_description", nullable = true, length = 255)
    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    @Basic
    @Column(name = "user_image_url", nullable = true, length = 255)
    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    @Basic
    @Column(name = "user_school", nullable = true, length = 255)
    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    @Basic
    @Column(name = "user_register_time", nullable = true)
    public Integer getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(Integer userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    @Basic
    @Column(name = "user_register_ip", nullable = true, length = 15)
    public String getUserRegisterIp() {
        return userRegisterIp;
    }

    public void setUserRegisterIp(String userRegisterIp) {
        this.userRegisterIp = userRegisterIp;
    }

    @Basic
    @Column(name = "user_last_update_time", nullable = true)
    public Integer getUserLastUpdateTime() {
        return userLastUpdateTime;
    }

    public void setUserLastUpdateTime(Integer userLastUpdateTime) {
        this.userLastUpdateTime = userLastUpdateTime;
    }

    @Basic
    @Column(name = "user_weibo", nullable = true, length = 255)
    public String getUserWeibo() {
        return userWeibo;
    }

    public void setUserWeibo(String userWeibo) {
        this.userWeibo = userWeibo;
    }

    @Basic
    @Column(name = "user_blood_type", nullable = true, length = 3)
    public String getUserBloodType() {
        return userBloodType;
    }

    public void setUserBloodType(String userBloodType) {
        this.userBloodType = userBloodType;
    }

    @Basic
    @Column(name = "user_says", nullable = true, length = 255)
    public String getUserSays() {
        return userSays;
    }

    public void setUserSays(String userSays) {
        this.userSays = userSays;
    }

    @Basic
    @Column(name = "user_lock", nullable = true)
    public Integer getUserLock() {
        return userLock;
    }

    public void setUserLock(Integer userLock) {
        this.userLock = userLock;
    }

    @Basic
    @Column(name = "user_freeze", nullable = true)
    public Integer getUserFreeze() {
        return userFreeze;
    }

    public void setUserFreeze(Integer userFreeze) {
        this.userFreeze = userFreeze;
    }

    @Basic
    @Column(name = "user_power", nullable = true, length = 255)
    public String getUserPower() {
        return userPower;
    }

    public void setUserPower(String userPower) {
        this.userPower = userPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (groupId != null ? !groupId.equals(user.groupId) : user.groupId != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userPwd != null ? !userPwd.equals(user.userPwd) : user.userPwd != null) return false;
        if (userPhone != null ? !userPhone.equals(user.userPhone) : user.userPhone != null) return false;
        if (userSex != null ? !userSex.equals(user.userSex) : user.userSex != null) return false;
        if (userQq != null ? !userQq.equals(user.userQq) : user.userQq != null) return false;
        if (userEmail != null ? !userEmail.equals(user.userEmail) : user.userEmail != null) return false;
        if (userAddress != null ? !userAddress.equals(user.userAddress) : user.userAddress != null) return false;
        if (userMark != null ? !userMark.equals(user.userMark) : user.userMark != null) return false;
        if (userRankId != null ? !userRankId.equals(user.userRankId) : user.userRankId != null) return false;
        if (userLastLoginIp != null ? !userLastLoginIp.equals(user.userLastLoginIp) : user.userLastLoginIp != null)
            return false;
        if (userBirthday != null ? !userBirthday.equals(user.userBirthday) : user.userBirthday != null) return false;
        if (userDescription != null ? !userDescription.equals(user.userDescription) : user.userDescription != null)
            return false;
        if (userImageUrl != null ? !userImageUrl.equals(user.userImageUrl) : user.userImageUrl != null) return false;
        if (userSchool != null ? !userSchool.equals(user.userSchool) : user.userSchool != null) return false;
        if (userRegisterTime != null ? !userRegisterTime.equals(user.userRegisterTime) : user.userRegisterTime != null)
            return false;
        if (userRegisterIp != null ? !userRegisterIp.equals(user.userRegisterIp) : user.userRegisterIp != null)
            return false;
        if (userLastUpdateTime != null ? !userLastUpdateTime.equals(user.userLastUpdateTime) : user.userLastUpdateTime != null)
            return false;
        if (userWeibo != null ? !userWeibo.equals(user.userWeibo) : user.userWeibo != null) return false;
        if (userBloodType != null ? !userBloodType.equals(user.userBloodType) : user.userBloodType != null)
            return false;
        if (userSays != null ? !userSays.equals(user.userSays) : user.userSays != null) return false;
        if (userLock != null ? !userLock.equals(user.userLock) : user.userLock != null) return false;
        if (userFreeze != null ? !userFreeze.equals(user.userFreeze) : user.userFreeze != null) return false;
        if (userPower != null ? !userPower.equals(user.userPower) : user.userPower != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + (userPhone != null ? userPhone.hashCode() : 0);
        result = 31 * result + (userSex != null ? userSex.hashCode() : 0);
        result = 31 * result + (userQq != null ? userQq.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userAddress != null ? userAddress.hashCode() : 0);
        result = 31 * result + (userMark != null ? userMark.hashCode() : 0);
        result = 31 * result + (userRankId != null ? userRankId.hashCode() : 0);
        result = 31 * result + (userLastLoginIp != null ? userLastLoginIp.hashCode() : 0);
        result = 31 * result + (userBirthday != null ? userBirthday.hashCode() : 0);
        result = 31 * result + (userDescription != null ? userDescription.hashCode() : 0);
        result = 31 * result + (userImageUrl != null ? userImageUrl.hashCode() : 0);
        result = 31 * result + (userSchool != null ? userSchool.hashCode() : 0);
        result = 31 * result + (userRegisterTime != null ? userRegisterTime.hashCode() : 0);
        result = 31 * result + (userRegisterIp != null ? userRegisterIp.hashCode() : 0);
        result = 31 * result + (userLastUpdateTime != null ? userLastUpdateTime.hashCode() : 0);
        result = 31 * result + (userWeibo != null ? userWeibo.hashCode() : 0);
        result = 31 * result + (userBloodType != null ? userBloodType.hashCode() : 0);
        result = 31 * result + (userSays != null ? userSays.hashCode() : 0);
        result = 31 * result + (userLock != null ? userLock.hashCode() : 0);
        result = 31 * result + (userFreeze != null ? userFreeze.hashCode() : 0);
        result = 31 * result + (userPower != null ? userPower.hashCode() : 0);
        return result;
    }
}
