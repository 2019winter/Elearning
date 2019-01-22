package cn.java.entity;

import java.io.Serializable;

/**
 * preference
 * @author 
 */
public class Preference implements Serializable {
    /**
     * prfid
     */
    private Integer prfid;

    /**
     * 偏好名
     */
    private String prfName;

    private static final long serialVersionUID = 1L;

    public Integer getPrfid() {
        return prfid;
    }

    public void setPrfid(Integer prfid) {
        this.prfid = prfid;
    }

    public String getPrfName() {
        return prfName;
    }

    public void setPrfName(String prfName) {
        this.prfName = prfName;
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
        Preference other = (Preference) that;
        return (this.getPrfid() == null ? other.getPrfid() == null : this.getPrfid().equals(other.getPrfid()))
            && (this.getPrfName() == null ? other.getPrfName() == null : this.getPrfName().equals(other.getPrfName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrfid() == null) ? 0 : getPrfid().hashCode());
        result = prime * result + ((getPrfName() == null) ? 0 : getPrfName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prfid=").append(prfid);
        sb.append(", prfName=").append(prfName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}