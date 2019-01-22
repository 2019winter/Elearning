package cn.java.entity;

import java.io.Serializable;

/**
 * schedule
 * @author 
 */
public class ScheduleKey implements Serializable {
    /**
     * 用户
     */
    private Integer scheduleUser;

    /**
     * 小节
     */
    private Integer scheduleSection;

    private static final long serialVersionUID = 1L;

    public Integer getScheduleUser() {
        return scheduleUser;
    }

    public void setScheduleUser(Integer scheduleUser) {
        this.scheduleUser = scheduleUser;
    }

    public Integer getScheduleSection() {
        return scheduleSection;
    }

    public void setScheduleSection(Integer scheduleSection) {
        this.scheduleSection = scheduleSection;
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
        ScheduleKey other = (ScheduleKey) that;
        return (this.getScheduleUser() == null ? other.getScheduleUser() == null : this.getScheduleUser().equals(other.getScheduleUser()))
            && (this.getScheduleSection() == null ? other.getScheduleSection() == null : this.getScheduleSection().equals(other.getScheduleSection()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScheduleUser() == null) ? 0 : getScheduleUser().hashCode());
        result = prime * result + ((getScheduleSection() == null) ? 0 : getScheduleSection().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scheduleUser=").append(scheduleUser);
        sb.append(", scheduleSection=").append(scheduleSection);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}