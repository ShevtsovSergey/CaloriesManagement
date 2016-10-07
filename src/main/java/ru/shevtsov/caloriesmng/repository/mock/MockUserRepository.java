package ru.shevtsov.caloriesmng.repository.mock;

import ru.shevtsov.caloriesmng.LoggerWrapper;
import ru.shevtsov.caloriesmng.model.User;
import ru.shevtsov.caloriesmng.repository.UserRepository;

import java.util.Collections;
import java.util.List;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class MockUserRepository implements UserRepository{

    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserRepository.class);

    @Override
    public boolean delete(int id) {
        LOG.info("delete " + id);
        return true;
    }

    @Override
    public User save(User user) {
        LOG.info("save " + user);
        return user;
    }

    @Override
    public User get(int id) {
        LOG.info("get " + id);
        return null;
    }

    @Override
    public List<User> getAll() {
        LOG.info("getAll");
        return Collections.emptyList();
    }

    @Override
    public User getByEmail(String email) {
        LOG.info("getByEmail " + email);
        return null;
    }

}
