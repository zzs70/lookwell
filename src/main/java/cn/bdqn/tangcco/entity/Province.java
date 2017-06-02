package cn.bdqn.tangcco.entity;

public class Province {
    private Integer provid;

    private String provname;

    public Integer getProvid() {
        return provid;
    }

    public void setProvid(Integer provid) {
        this.provid = provid;
    }

    public String getProvname() {
        return provname;
    }

    public void setProvname(String provname) {
        this.provname = provname == null ? null : provname.trim();
    }
}