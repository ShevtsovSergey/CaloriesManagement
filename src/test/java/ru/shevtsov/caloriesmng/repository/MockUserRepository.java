package ru.shevtsov.caloriesmng.repository;

import org.springframework.stereotype.Repository;
import ru.shevtsov.caloriesmng.LoggerWrapper;
import ru.shevtsov.caloriesmng.model.User;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collections;
import java.util.List;

@Repository
public class MockUserRepository implements UserRepository{

    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserRepository.class);

    @PostConstruct
    public void postConstruct(){
        LOG.info("PostConstruct");
    }

    @PreDestroy
    public void PreDestroy(){
        LOG.info("PreDestroy");
    }

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
