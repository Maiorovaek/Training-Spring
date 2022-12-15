package com;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {
    private String homeTown;
    private int formed;
    private boolean active;

    private List<Member> members;

    public String getHomeTown() {
        return homeTown;
    }

    public List<Member> getMembers() {
        return members;
    }

    public int getFormed() {
        return formed;
    }

    public boolean isActive() {
        return active;
    }
}
