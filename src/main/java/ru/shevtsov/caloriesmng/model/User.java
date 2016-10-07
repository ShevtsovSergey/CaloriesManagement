package ru.shevtsov.caloriesmng.model;

import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class User extends NamedEntity{

    private String email;
    //length(min = 5)
    private String password;
    private boolean enabled = true;
    private Date registered = new Date();
    private Set<Role> autoritties;
    public User(String name) {
    }

    public User(String name, String email, String password, Role role, Role... roles) {
        super(name);
        this.email = email;
        this.password = password;
        this.enabled = true;
        this.autoritties = EnumSet.of(role, roles);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void addAuthority(Role authority) {
        if (autoritties == null) {
            autoritties = EnumSet.of(authority);
        } else {
            autoritties.add(authority);
        }
    }

    public Collection<Role> getAutoritties() {
        return autoritties;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", registered=" + registered +
                ", autoritties=" + autoritties +
                '}';
    }
}
