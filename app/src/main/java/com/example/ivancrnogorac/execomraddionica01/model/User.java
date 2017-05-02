package com.example.ivancrnogorac.execomraddionica01.model;

/**
 * Created by Ivan Crnogorac on 4/29/2017.
 */

public class User {

    private String firstName;

    private String lasteName;

    private String iconUrl;

    public User(String firstName, String lasteName, String iconUrl) {
        this.firstName = firstName;
        this.lasteName = lasteName;
        this.iconUrl = iconUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasteName() {
        return lasteName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lasteName='").append(lasteName).append('\'');
        sb.append(", iconUrl='").append(iconUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
