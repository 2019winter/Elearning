package cn.java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * col_course
 * @author 
 */
public class ColCourse extends ColCourseKey implements Serializable {
    /**
     * 时间
     */
    private Date colcDate;

    private static final long serialVersionUID = 1L;

    public Date getColcDate() {
        return colcDate;
    }

    public void setColcDate(Date colcDate) {
        this.colcDate = colcDate;
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
        ColCourse other = (ColCourse) that;
        return (this.getColcUser() == null ? other.getColcUser() == null : this.getColcUser().equals(other.getColcUser()))
            && (this.getColcCourse() == null ? other.getColcCourse() == null : this.getColcCourse().equals(other.getColcCourse()))
            && (this.getColcDate() == null ? other.getColcDate() == null : this.getColcDate().equals(other.getColcDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getColcUser() == null) ? 0 : getColcUser().hashCode());
        result = prime * result + ((getColcCourse() == null) ? 0 : getColcCourse().hashCode());
        result = prime * result + ((getColcDate() == null) ? 0 : getColcDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", colcDate=").append(colcDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}