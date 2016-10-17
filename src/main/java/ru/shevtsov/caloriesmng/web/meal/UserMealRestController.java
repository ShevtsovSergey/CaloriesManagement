package ru.shevtsov.caloriesmng.web.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.shevtsov.caloriesmng.LoggedUser;
import ru.shevtsov.caloriesmng.LoggerWrapper;
import ru.shevtsov.caloriesmng.model.UserMeal;
import ru.shevtsov.caloriesmng.service.UserMealService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
@Controller
public class UserMealRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserMealRestController.class);

    @Autowired
    private UserMealService service;

    public UserMeal get(int id) {
        int userId = LoggedUser.id();
        LOG.info("get meal {} for User {}", id, userId);
        return service.get(id, userId);
    }

    public void delete(int id) {
        int userId = LoggedUser.id();
        LOG.info("delete meal {} for User {}", id, userId);
        service.delete(id, userId);
    }

    public List<UserMeal> getAll() {
        int userId = LoggedUser.id();
        LOG.info("getAll for User {}", userId);
        return service.getAll(userId);
    }

    public void deleteAll() {
        int userId = LoggedUser.id();
        LOG.info("deleteAll for User {}", userId);
        service.deleteAll(userId);
    }

    public UserMeal update(UserMeal meal) {
        int userId = LoggedUser.id();
        LOG.info("update  {} for User {}", meal, userId);
        return service.save(meal, userId);
    }

    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate) {
        int userId = LoggedUser.id();
        LOG.info("getBetween {} and {} for User {}", startDate, endDate, userId);
        return service.getBetween(startDate, endDate, userId);
    }

}
