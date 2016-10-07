package ru.shevtsov.caloriesmng.repository;

import ru.shevtsov.caloriesmng.model.User;

import java.util.List;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public interface UserRepository {

    //update and insert
    User save(User user);

    //false if not found
    boolean delete(int id);

    //null if not found
    User get(int id);

    //null if not found
    User getByEmail(String email);

    List<User> getAll();

}
