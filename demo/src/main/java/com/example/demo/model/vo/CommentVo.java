package com.example.demo.model.vo;

public class CommentVo {

    private int cno;
    private int bno;

    private String comment;
    private String username;
    private String registertime;

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRegistertime() {
        return registertime;
    }

    public void setRegistertime(String registertime) {
        this.registertime = registertime;
    }

    @Override
    public String toString() {
        return "CommentVo{" +
                "cno=" + cno +
                ", bno=" + bno +
                ", comment='" + comment + '\'' +
                ", username='" + username + '\'' +
                ", registertime='" + registertime + '\'' +
                '}';
    }
}
