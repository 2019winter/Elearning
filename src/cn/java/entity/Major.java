package cn.java.entity;

import java.io.Serializable;

/**
 * major
 * @author 
 */
public class Major implements Serializable {
    /**
     * major_id
     */
    private Integer majorId;

    /**
     * 专业名
     */
    private String majorName;

    /**
     * 所属学院
     */
    private Integer majorCollege;

    private static final long serialVersionUID = 1L;

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getMajorCollege() {
        return majorCollege;
    }

    public void setMajorCollege(Integer majorCollege) {
        this.majorCollege = majorCollege;
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
        Major other = (Major) that;
        return (this.getMajorId() == null ? other.getMajorId() == null : this.getMajorId().equals(other.getMajorId()))
            && (this.getMajorName() == null ? other.getMajorName() == null : this.getMajorName().equals(other.getMajorName()))
            && (this.getMajorCollege() == null ? other.getMajorCollege() == null : this.getMajorCollege().equals(other.getMajorCollege()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMajorId() == null) ? 0 : getMajorId().hashCode());
        result = prime * result + ((getMajorName() == null) ? 0 : getMajorName().hashCode());
        result = prime * result + ((getMajorCollege() == null) ? 0 : getMajorCollege().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", majorId=").append(majorId);
        sb.append(", majorName=").append(majorName);
        sb.append(", majorCollege=").append(majorCollege);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}