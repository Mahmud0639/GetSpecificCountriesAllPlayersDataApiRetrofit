package com.manuni.getspecificteamallplayerinfo;

public class PositionData {
    private String name;
    private String resource;
    private int id;

    public PositionData() {
    }

    public PositionData(String name, String resource, int id) {
        this.name = name;
        this.resource = resource;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
