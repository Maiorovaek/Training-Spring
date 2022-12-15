package com;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
    private String name;
    private String secretIdentity;

    public String getName() {
        return name;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }
}
