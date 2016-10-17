package ru.shevtsov.caloriesmng.model;

import ru.shevtsov.caloriesmng.util.TimeUtil;

import java.time.LocalDateTime;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class UserMeal extends BaseEntity {

    protected LocalDateTime dateTime;

    protected String description;

    protected int calories;

    private User user;

    public UserMeal() {
    }

    public UserMeal(Integer id, LocalDateTime dateTime, String description, int calories) {
        super(id);
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Meal(" + id + ", " + TimeUtil.toString(dateTime) + ", "  + description + ", calories: " + calories + ")" ;
    }
}
