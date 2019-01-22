package cn.java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    /**
     * uid,唯一标识
     */
    private Integer uid;

    /**
     * 用户名
     */
    private String userUsername;

    /**
     * 昵称
     */
    private String userUsernick;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 头像,存放头像文件的路径，不设置则默认路径
     */
    private String userAvatar;

    /**
     * 签名,存放最大长度255
     */
    private String userSign;

    /**
     * 性别
     */
    private String userGender;

    /**
     * 积分
     */
    private Integer userCoin;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 手机,有可能11位，有可能固定电话
     */
    private String userPhone;

    /**
     * qq
     */
    private String userQq;

    /**
     * 学院,参照学院表id
     */
    private Integer userCollege;

    /**
     * 专业,参照专业表id
     */
    private Integer userMajor;

    /**
     * 是否管理员,0/1表示是否管理员
     */
    private String userAuth;

    /**
     * 状态,0/1表示是否激活
     */
    private String userStatus;

    /**
     * 注册时间
     */
    private Date userRegtime;

    /**
     * 注册ip
     */
    private String userRegip;

    /**
     * 上次登录时间
     */
    private Date userLasttime;

    /**
     * 上次登录ip
     */
    private String userLastip;

    /**
     * 邮箱激活的最后时间,邮箱激活链接到期的最后时间
     */
    private Date userMailtime;

    /**
     * 上传次数
     */
    private Integer userUploadCount;

    /**
     * 下载次数
     */
    private Integer userDownloadCount;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserUsernick() {
        return userUsernick;
    }

    public void setUserUsernick(String userUsernick) {
        this.userUsernick = userUsernick;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Integer getUserCoin() {
        return userCoin;
    }

    public void setUserCoin(Integer userCoin) {
        this.userCoin = userCoin;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public Integer getUserCollege() {
        return userCollege;
    }

    public void setUserCollege(Integer userCollege) {
        this.userCollege = userCollege;
    }

    public Integer getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(Integer userMajor) {
        this.userMajor = userMajor;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(Date userRegtime) {
        this.userRegtime = userRegtime;
    }

    public String getUserRegip() {
        return userRegip;
    }

    public void setUserRegip(String userRegip) {
        this.userRegip = userRegip;
    }

    public Date getUserLasttime() {
        return userLasttime;
    }

    public void setUserLasttime(Date userLasttime) {
        this.userLasttime = userLasttime;
    }

    public String getUserLastip() {
        return userLastip;
    }

    public void setUserLastip(String userLastip) {
        this.userLastip = userLastip;
    }

    public Date getUserMailtime() {
        return userMailtime;
    }

    public void setUserMailtime(Date userMailtime) {
        this.userMailtime = userMailtime;
    }

    public Integer getUserUploadCount() {
        return userUploadCount;
    }

    public void setUserUploadCount(Integer userUploadCount) {
        this.userUploadCount = userUploadCount;
    }

    public Integer getUserDownloadCount() {
        return userDownloadCount;
    }

    public void setUserDownloadCount(Integer userDownloadCount) {
        this.userDownloadCount = userDownloadCount;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUserUsername() == null ? other.getUserUsername() == null : this.getUserUsername().equals(other.getUserUsername()))
            && (this.getUserUsernick() == null ? other.getUserUsernick() == null : this.getUserUsernick().equals(other.getUserUsernick()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserAvatar() == null ? other.getUserAvatar() == null : this.getUserAvatar().equals(other.getUserAvatar()))
            && (this.getUserSign() == null ? other.getUserSign() == null : this.getUserSign().equals(other.getUserSign()))
            && (this.getUserGender() == null ? other.getUserGender() == null : this.getUserGender().equals(other.getUserGender()))
            && (this.getUserCoin() == null ? other.getUserCoin() == null : this.getUserCoin().equals(other.getUserCoin()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserQq() == null ? other.getUserQq() == null : this.getUserQq().equals(other.getUserQq()))
            && (this.getUserCollege() == null ? other.getUserCollege() == null : this.getUserCollege().equals(other.getUserCollege()))
            && (this.getUserMajor() == null ? other.getUserMajor() == null : this.getUserMajor().equals(other.getUserMajor()))
            && (this.getUserAuth() == null ? other.getUserAuth() == null : this.getUserAuth().equals(other.getUserAuth()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserRegtime() == null ? other.getUserRegtime() == null : this.getUserRegtime().equals(other.getUserRegtime()))
            && (this.getUserRegip() == null ? other.getUserRegip() == null : this.getUserRegip().equals(other.getUserRegip()))
            && (this.getUserLasttime() == null ? other.getUserLasttime() == null : this.getUserLasttime().equals(other.getUserLasttime()))
            && (this.getUserLastip() == null ? other.getUserLastip() == null : this.getUserLastip().equals(other.getUserLastip()))
            && (this.getUserMailtime() == null ? other.getUserMailtime() == null : this.getUserMailtime().equals(other.getUserMailtime()))
            && (this.getUserUploadCount() == null ? other.getUserUploadCount() == null : this.getUserUploadCount().equals(other.getUserUploadCount()))
            && (this.getUserDownloadCount() == null ? other.getUserDownloadCount() == null : this.getUserDownloadCount().equals(other.getUserDownloadCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUserUsername() == null) ? 0 : getUserUsername().hashCode());
        result = prime * result + ((getUserUsernick() == null) ? 0 : getUserUsernick().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserAvatar() == null) ? 0 : getUserAvatar().hashCode());
        result = prime * result + ((getUserSign() == null) ? 0 : getUserSign().hashCode());
        result = prime * result + ((getUserGender() == null) ? 0 : getUserGender().hashCode());
        result = prime * result + ((getUserCoin() == null) ? 0 : getUserCoin().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserQq() == null) ? 0 : getUserQq().hashCode());
        result = prime * result + ((getUserCollege() == null) ? 0 : getUserCollege().hashCode());
        result = prime * result + ((getUserMajor() == null) ? 0 : getUserMajor().hashCode());
        result = prime * result + ((getUserAuth() == null) ? 0 : getUserAuth().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserRegtime() == null) ? 0 : getUserRegtime().hashCode());
        result = prime * result + ((getUserRegip() == null) ? 0 : getUserRegip().hashCode());
        result = prime * result + ((getUserLasttime() == null) ? 0 : getUserLasttime().hashCode());
        result = prime * result + ((getUserLastip() == null) ? 0 : getUserLastip().hashCode());
        result = prime * result + ((getUserMailtime() == null) ? 0 : getUserMailtime().hashCode());
        result = prime * result + ((getUserUploadCount() == null) ? 0 : getUserUploadCount().hashCode());
        result = prime * result + ((getUserDownloadCount() == null) ? 0 : getUserDownloadCount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", userUsername=").append(userUsername);
        sb.append(", userUsernick=").append(userUsernick);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userAvatar=").append(userAvatar);
        sb.append(", userSign=").append(userSign);
        sb.append(", userGender=").append(userGender);
        sb.append(", userCoin=").append(userCoin);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userQq=").append(userQq);
        sb.append(", userCollege=").append(userCollege);
        sb.append(", userMajor=").append(userMajor);
        sb.append(", userAuth=").append(userAuth);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userRegtime=").append(userRegtime);
        sb.append(", userRegip=").append(userRegip);
        sb.append(", userLasttime=").append(userLasttime);
        sb.append(", userLastip=").append(userLastip);
        sb.append(", userMailtime=").append(userMailtime);
        sb.append(", userUploadCount=").append(userUploadCount);
        sb.append(", userDownloadCount=").append(userDownloadCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}