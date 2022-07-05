package com.manuni.getspecificteamallplayerinfo;

public class PlayerObjectData {
    private String fullname;
    private String gender;
    private String battingstyle;
    private String updated_at;

    private PositionData position;

    public PlayerObjectData() {
    }

    public PlayerObjectData(String fullname, String gender, String battingstyle, String updated_at, PositionData position) {
        this.fullname = fullname;
        this.gender = gender;
        this.battingstyle = battingstyle;
        this.updated_at = updated_at;
        this.position = position;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBattingstyle() {
        return battingstyle;
    }

    public void setBattingstyle(String battingstyle) {
        this.battingstyle = battingstyle;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public PositionData getPosition() {
        return position;
    }

    public void setPosition(PositionData position) {
        this.position = position;
    }
}
