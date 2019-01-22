package cn.java.entity;

import java.io.Serializable;

/**
 * prefer
 * @author 
 */
public class PreferKey implements Serializable {
    /**
     * 用户
     */
    private Integer preferUser;

    /**
     * 偏好
     */
    private Integer preferPrf;

    private static final long serialVersionUID = 1L;

    public Integer getPreferUser() {
        return preferUser;
    }

    public void setPreferUser(Integer preferUser) {
        this.preferUser = preferUser;
    }

    public Integer getPreferPrf() {
        return preferPrf;
    }

    public void setPreferPrf(Integer preferPrf) {
        this.preferPrf = preferPrf;
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
        PreferKey other = (PreferKey) that;
        return (this.getPreferUser() == null ? other.getPreferUser() == null : this.getPreferUser().equals(other.getPreferUser()))
            && (this.getPreferPrf() == null ? other.getPreferPrf() == null : this.getPreferPrf().equals(other.getPreferPrf()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPreferUser() == null) ? 0 : getPreferUser().hashCode());
        result = prime * result + ((getPreferPrf() == null) ? 0 : getPreferPrf().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", preferUser=").append(preferUser);
        sb.append(", preferPrf=").append(preferPrf);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}