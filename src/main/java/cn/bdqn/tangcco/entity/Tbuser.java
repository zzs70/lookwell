package cn.bdqn.tangcco.entity;

public class Tbuser {
    private Integer userid;

    private Integer roleid;

    private String username;

    private String password;

    private String nickname;

    private String phone;
    private Double ballance;

    private Integer integral;

    private Integer beanfun;
    public Integer getUserid() {
        return userid;
    }

    public Tbuser() {
    }

    public Tbuser(String password, String phone) {
        this.password = password;
        this.phone = phone;
    }



    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Double getBallance() {
        return ballance;
    }

    public void setBallance(Double ballance) {
        this.ballance = ballance;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getBeanfun() {
        return beanfun;
    }

    public void setBeanfun(Integer beanfun) {
        this.beanfun = beanfun;
    }
}