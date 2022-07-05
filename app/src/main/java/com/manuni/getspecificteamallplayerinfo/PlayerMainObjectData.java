package com.manuni.getspecificteamallplayerinfo;

import java.util.List;

public class PlayerMainObjectData {
    List<PlayerObjectData> data;

    public PlayerMainObjectData() {
    }

    public PlayerMainObjectData(List<PlayerObjectData> data) {
        this.data = data;
    }

    public List<PlayerObjectData> getData() {
        return data;
    }

    public void setData(List<PlayerObjectData> data) {
        this.data = data;
    }
}
