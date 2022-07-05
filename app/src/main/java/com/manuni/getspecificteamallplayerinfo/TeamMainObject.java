package com.manuni.getspecificteamallplayerinfo;

public class TeamMainObject {
    private TeamData data;

    public TeamMainObject() {
    }

    public TeamMainObject(TeamData data) {
        this.data = data;
    }

    public TeamData getData() {
        return data;
    }

    public void setData(TeamData data) {
        this.data = data;
    }
}
