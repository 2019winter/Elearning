package cn.java.entity;

import java.io.Serializable;

/**
 * schedule
 * @author 
 */
public class Schedule extends ScheduleKey implements Serializable {
    /**
     * 时间
     */
    private Integer scheduleDate;

    private static final long serialVersionUID = 1L;

    public Integer getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Integer scheduleDate) {
        this.scheduleDate = scheduleDate;
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
        Schedule other = (Schedule) that;
        return (this.getScheduleUser() == null ? other.getScheduleUser() == null : this.getScheduleUser().equals(other.getScheduleUser()))
            && (this.getScheduleSection() == null ? other.getScheduleSection() == null : this.getScheduleSection().equals(other.getScheduleSection()))
            && (this.getScheduleDate() == null ? other.getScheduleDate() == null : this.getScheduleDate().equals(other.getScheduleDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScheduleUser() == null) ? 0 : getScheduleUser().hashCode());
        result = prime * result + ((getScheduleSection() == null) ? 0 : getScheduleSection().hashCode());
        result = prime * result + ((getScheduleDate() == null) ? 0 : getScheduleDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scheduleDate=").append(scheduleDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}