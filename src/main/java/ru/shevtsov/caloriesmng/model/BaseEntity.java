package ru.shevtsov.caloriesmng.model;

import ru.shevtsov.caloriesmng.LoggerWrapper;

import javax.persistence.*;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public class BaseEntity {
    private static final LoggerWrapper LOG = LoggerWrapper.get(BaseEntity.class);

    public static final int START_SEQ = 10000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    protected Integer id;

    public BaseEntity() {
    }

    public BaseEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return (this.id == null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntity that = (BaseEntity) o;

        if(id == null || that.id == null) {
            throw LOG.gettIllegalStateException("Equals " + this + "and " + that + "with null id");
        }
        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return (id == null) ? 0 : id;
    }
}
