package ru.shevtsov.caloriesmng.model;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class NamedEntity extends BaseEntity {

    protected String name;

    public NamedEntity() {
    }

    public NamedEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
