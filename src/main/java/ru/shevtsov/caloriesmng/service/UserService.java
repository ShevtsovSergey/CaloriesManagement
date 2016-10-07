package ru.shevtsov.caloriesmng.service;

import ru.shevtsov.caloriesmng.model.User;
import ru.shevtsov.caloriesmng.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public interface UserService {

    User save(User user);
    void delete(int id) throws NotFoundException;
    User get(int id) throws NotFoundException;
    User getByEmail(String email) throws NotFoundException;
    List<User> getAll();
    void update(User user) throws NotFoundException;

}
