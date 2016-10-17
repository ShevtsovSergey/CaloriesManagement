package ru.shevtsov.caloriesmng;

import ru.shevtsov.caloriesmng.model.Role;

import java.util.Collections;
import java.util.Set;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class LoggedUser {

    protected int id = 0;
    protected Set<Role> roles = Collections.singleton(Role.ROLE_USER);
    protected boolean enabled = true;

    private static LoggedUser LOGGED_USER = new LoggedUser();

    private static LoggedUser get() { return LOGGED_USER; }

    public static int id() {
        return get().id;
    }

    public Set<Role> getAuhorities() { return roles; }

    public boolean isEnabled() { return enabled; }
}
