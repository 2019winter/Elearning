package cn.java.entity;

import java.io.Serializable;

/**
 * col_course
 * @author 
 */
public class ColCourseKey implements Serializable {
    /**
     * 用户
     */
    private Integer colcUser;

    /**
     * 课程
     */
    private Integer colcCourse;

    private static final long serialVersionUID = 1L;

    public Integer getColcUser() {
        return colcUser;
    }

    public void setColcUser(Integer colcUser) {
        this.colcUser = colcUser;
    }

    public Integer getColcCourse() {
        return colcCourse;
    }

    public void setColcCourse(Integer colcCourse) {
        this.colcCourse = colcCourse;
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
        ColCourseKey other = (ColCourseKey) that;
        return (this.getColcUser() == null ? other.getColcUser() == null : this.getColcUser().equals(other.getColcUser()))
            && (this.getColcCourse() == null ? other.getColcCourse() == null : this.getColcCourse().equals(other.getColcCourse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getColcUser() == null) ? 0 : getColcUser().hashCode());
        result = prime * result + ((getColcCourse() == null) ? 0 : getColcCourse().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", colcUser=").append(colcUser);
        sb.append(", colcCourse=").append(colcCourse);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}