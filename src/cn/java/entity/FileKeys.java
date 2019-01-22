package cn.java.entity;

import java.io.Serializable;

/**
 * file_keys
 * @author 
 */
public class FileKeys implements Serializable {
    private Integer fid;

    private String key1;

    private String key2;

    private String key3;

    private String key4;

    private String key5;

    private String key6;

    private String key7;

    private String key8;

    private String key9;

    private String key10;

    private static final long serialVersionUID = 1L;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getKey3() {
        return key3;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
    }

    public String getKey4() {
        return key4;
    }

    public void setKey4(String key4) {
        this.key4 = key4;
    }

    public String getKey5() {
        return key5;
    }

    public void setKey5(String key5) {
        this.key5 = key5;
    }

    public String getKey6() {
        return key6;
    }

    public void setKey6(String key6) {
        this.key6 = key6;
    }

    public String getKey7() {
        return key7;
    }

    public void setKey7(String key7) {
        this.key7 = key7;
    }

    public String getKey8() {
        return key8;
    }

    public void setKey8(String key8) {
        this.key8 = key8;
    }

    public String getKey9() {
        return key9;
    }

    public void setKey9(String key9) {
        this.key9 = key9;
    }

    public String getKey10() {
        return key10;
    }

    public void setKey10(String key10) {
        this.key10 = key10;
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
        FileKeys other = (FileKeys) that;
        return (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
            && (this.getKey1() == null ? other.getKey1() == null : this.getKey1().equals(other.getKey1()))
            && (this.getKey2() == null ? other.getKey2() == null : this.getKey2().equals(other.getKey2()))
            && (this.getKey3() == null ? other.getKey3() == null : this.getKey3().equals(other.getKey3()))
            && (this.getKey4() == null ? other.getKey4() == null : this.getKey4().equals(other.getKey4()))
            && (this.getKey5() == null ? other.getKey5() == null : this.getKey5().equals(other.getKey5()))
            && (this.getKey6() == null ? other.getKey6() == null : this.getKey6().equals(other.getKey6()))
            && (this.getKey7() == null ? other.getKey7() == null : this.getKey7().equals(other.getKey7()))
            && (this.getKey8() == null ? other.getKey8() == null : this.getKey8().equals(other.getKey8()))
            && (this.getKey9() == null ? other.getKey9() == null : this.getKey9().equals(other.getKey9()))
            && (this.getKey10() == null ? other.getKey10() == null : this.getKey10().equals(other.getKey10()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getKey1() == null) ? 0 : getKey1().hashCode());
        result = prime * result + ((getKey2() == null) ? 0 : getKey2().hashCode());
        result = prime * result + ((getKey3() == null) ? 0 : getKey3().hashCode());
        result = prime * result + ((getKey4() == null) ? 0 : getKey4().hashCode());
        result = prime * result + ((getKey5() == null) ? 0 : getKey5().hashCode());
        result = prime * result + ((getKey6() == null) ? 0 : getKey6().hashCode());
        result = prime * result + ((getKey7() == null) ? 0 : getKey7().hashCode());
        result = prime * result + ((getKey8() == null) ? 0 : getKey8().hashCode());
        result = prime * result + ((getKey9() == null) ? 0 : getKey9().hashCode());
        result = prime * result + ((getKey10() == null) ? 0 : getKey10().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fid=").append(fid);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", key4=").append(key4);
        sb.append(", key5=").append(key5);
        sb.append(", key6=").append(key6);
        sb.append(", key7=").append(key7);
        sb.append(", key8=").append(key8);
        sb.append(", key9=").append(key9);
        sb.append(", key10=").append(key10);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}