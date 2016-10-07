package ru.shevtsov.caloriesmng.model;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class BaseEntity {

    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
