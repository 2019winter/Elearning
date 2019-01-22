package cn.java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * boardcast
 * @author 
 */
public class Boardcast implements Serializable {
    /**
     * bid
     */
    private Integer bid;

    /**
     * 通知时间
     */
    private Date boardcastDate;

    /**
     * 通知内容
     */
    private String boardcastContent;

    private static final long serialVersionUID = 1L;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Date getBoardcastDate() {
        return boardcastDate;
    }

    public void setBoardcastDate(Date boardcastDate) {
        this.boardcastDate = boardcastDate;
    }

    public String getBoardcastContent() {
        return boardcastContent;
    }

    public void setBoardcastContent(String boardcastContent) {
        this.boardcastContent = boardcastContent;
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
        Boardcast other = (Boardcast) that;
        return (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
            && (this.getBoardcastDate() == null ? other.getBoardcastDate() == null : this.getBoardcastDate().equals(other.getBoardcastDate()))
            && (this.getBoardcastContent() == null ? other.getBoardcastContent() == null : this.getBoardcastContent().equals(other.getBoardcastContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getBoardcastDate() == null) ? 0 : getBoardcastDate().hashCode());
        result = prime * result + ((getBoardcastContent() == null) ? 0 : getBoardcastContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bid=").append(bid);
        sb.append(", boardcastDate=").append(boardcastDate);
        sb.append(", boardcastContent=").append(boardcastContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}