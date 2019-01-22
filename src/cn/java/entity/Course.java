package cn.java.entity;

import java.io.Serializable;

/**
 * course
 * @author 
 */
public class Course implements Serializable {
    /**
     * cid
     */
    private Integer cid;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 课程简介
     */
    private String courseDesc;

    /**
     * 课程缩略图，此处存图片的base64编码
     */
    private String courseIcon;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getCourseIcon() {
        return courseIcon;
    }

    public void setCourseIcon(String courseIcon) {
        this.courseIcon = courseIcon;
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
        Course other = (Course) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getCourseDesc() == null ? other.getCourseDesc() == null : this.getCourseDesc().equals(other.getCourseDesc()))
            && (this.getCourseIcon() == null ? other.getCourseIcon() == null : this.getCourseIcon().equals(other.getCourseIcon()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getCourseDesc() == null) ? 0 : getCourseDesc().hashCode());
        result = prime * result + ((getCourseIcon() == null) ? 0 : getCourseIcon().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", courseName=").append(courseName);
        sb.append(", courseDesc=").append(courseDesc);
        sb.append(", courseIcon=").append(courseIcon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}