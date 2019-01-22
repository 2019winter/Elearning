package cn,java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * action
 * @author 
 */
public class Action implements Serializable {
    /**
     * aid
     */
    private Integer aid;

    /**
     * 动作实施者,用户表id
     */
    private Integer actionUser;

    /**
     * 时间
     */
    private Date actionDate;

    /**
     * 点击类型,点击的类型：1表示
     */
    private Integer actionType;

    /**
     * 点击项,记录对应的请求URL
     */
    private String actionItem;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getActionUser() {
        return actionUser;
    }

    public void setActionUser(Integer actionUser) {
        this.actionUser = actionUser;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public String getActionItem() {
        return actionItem;
    }

    public void setActionItem(String actionItem) {
        this.actionItem = actionItem;
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
        Action other = (Action) that;
        return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()))
            && (this.getActionUser() == null ? other.getActionUser() == null : this.getActionUser().equals(other.getActionUser()))
            && (this.getActionDate() == null ? other.getActionDate() == null : this.getActionDate().equals(other.getActionDate()))
            && (this.getActionType() == null ? other.getActionType() == null : this.getActionType().equals(other.getActionType()))
            && (this.getActionItem() == null ? other.getActionItem() == null : this.getActionItem().equals(other.getActionItem()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        result = prime * result + ((getActionUser() == null) ? 0 : getActionUser().hashCode());
        result = prime * result + ((getActionDate() == null) ? 0 : getActionDate().hashCode());
        result = prime * result + ((getActionType() == null) ? 0 : getActionType().hashCode());
        result = prime * result + ((getActionItem() == null) ? 0 : getActionItem().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", actionUser=").append(actionUser);
        sb.append(", actionDate=").append(actionDate);
        sb.append(", actionType=").append(actionType);
        sb.append(", actionItem=").append(actionItem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}