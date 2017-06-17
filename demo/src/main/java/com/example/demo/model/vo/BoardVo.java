package com.example.demo.model.vo;

import java.util.List;

public class BoardVo {

    private int bno;
    private String username;
    private String subject;
    private String content;
    private String registertime;
    private String modifytime;

    private int likeCnt;

    private List<CommentVo> comments;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegistertime() {
        return registertime;
    }

    public void setRegistertime(String registertime) {
        this.registertime = registertime;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime;
    }

    public int getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(int likeCnt) {
        this.likeCnt = likeCnt;
    }

    public List<CommentVo> getComments() {
        return comments;
    }

    public void setComments(List<CommentVo> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "BoardVo{" +
                "bno=" + bno +
                ", username='" + username + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", registertime='" + registertime + '\'' +
                ", modifytime='" + modifytime + '\'' +
                ", likeCnt=" + likeCnt +
                ", comments=" + comments +
                '}';
    }
}
