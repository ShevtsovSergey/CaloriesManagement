package ru.shevtsov.caloriesmng.repository;

import ru.shevtsov.caloriesmng.model.UserMeal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public interface UserMealRepository {

    //UserMeal.user = null
    UserMeal save(UserMeal user, int userId);

    //false if not found
    boolean delete(int id, int userId);

    //null if not found
    UserMeal get(int id, int userId);

    //ORDERED DATE, TIME
    List<UserMeal> getAll(int userId);

    void deleteAll(int userId);

    List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);

}
