package cn.java.entity;

import java.io.Serializable;

/**
 * section
 * @author 
 */
public class Section implements Serializable {
    /**
     * sid
     */
    private Integer sid;

    /**
     * 节名称
     */
    private String sectionName;

    /**
     * 节号,每章的introduction部分也作为一个节，节号为n，其余二级标题的节，节号为n.n
     */
    private String sectionNumber;

    /**
     * 所属课程,对应课程id
     */
    private Integer sectionCourse;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public Integer getSectionCourse() {
        return sectionCourse;
    }

    public void setSectionCourse(Integer sectionCourse) {
        this.sectionCourse = sectionCourse;
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
        Section other = (Section) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSectionName() == null ? other.getSectionName() == null : this.getSectionName().equals(other.getSectionName()))
            && (this.getSectionNumber() == null ? other.getSectionNumber() == null : this.getSectionNumber().equals(other.getSectionNumber()))
            && (this.getSectionCourse() == null ? other.getSectionCourse() == null : this.getSectionCourse().equals(other.getSectionCourse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSectionName() == null) ? 0 : getSectionName().hashCode());
        result = prime * result + ((getSectionNumber() == null) ? 0 : getSectionNumber().hashCode());
        result = prime * result + ((getSectionCourse() == null) ? 0 : getSectionCourse().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sectionName=").append(sectionName);
        sb.append(", sectionNumber=").append(sectionNumber);
        sb.append(", sectionCourse=").append(sectionCourse);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}