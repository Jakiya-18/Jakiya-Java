package com.tutorsdude.Dto.Example;

public class PlayerDto {

    private int score;
    private String userName;
    private int level;
    private String email;
    private int matchWon;


    public PlayerDto(int score, String userName, int level, String email, int matchWon){
        this.score = score;
        this.userName =  userName;
        this.level = level;
        this.email = email;
        this.matchWon = matchWon;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatchWon() {
        return matchWon;
    }

    public void setMatchWon(int matchWon) {
        this.matchWon = matchWon;
    }
}
