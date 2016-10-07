package ru.shevtsov.caloriesmng.service;

import ru.shevtsov.caloriesmng.model.User;
import ru.shevtsov.caloriesmng.repository.UserRepository;
import ru.shevtsov.caloriesmng.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class UserServiceImpl implements UserService{

    private UserRepository repository;

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(int id) throws NotFoundException {

    }

    @Override
    public User get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) throws NotFoundException {

    }
}
