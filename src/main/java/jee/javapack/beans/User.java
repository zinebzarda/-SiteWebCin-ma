package jee.javapack.beans;

public class User {
    private String userName;
    private String userMail;
    private String password;
    private String roleAU;

    public User(String userName, String userMail, String password, String roleAU) {
        this.userName = userName;
        this.userMail = userMail;
        this.password = password;
        this.roleAU = roleAU;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleAU() {
        return roleAU;
    }

    public void setRoleAU(String roleAU) {
        this.roleAU = roleAU;
    }
}
