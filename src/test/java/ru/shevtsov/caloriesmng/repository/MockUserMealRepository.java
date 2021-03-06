package ru.shevtsov.caloriesmng.repository;

import org.springframework.stereotype.Repository;
import ru.shevtsov.caloriesmng.model.UserMeal;
import ru.shevtsov.caloriesmng.repository.UserMealRepository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class MockUserMealRepository implements UserMealRepository {

    @Override
    public UserMeal save(UserMeal user, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public UserMeal get(int id, int userId) {
        return null;
    }

    @Override
    public List<UserMeal> getAll(int userId) {
        return null;
    }

    @Override
    public void deleteAll(int userId) {

    }

    @Override
    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return null;
    }
}
