package ru.shevtsov.caloriesmng;

import ru.shevtsov.caloriesmng.model.Role;

import java.util.Set;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class LogedUser {

    protected int id;
    protected Set<Role> roles;
    protected boolean enabled;

    public int getId() {
        return id;
    }
}
