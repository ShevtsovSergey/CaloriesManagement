package ru.shevtsov.caloriesmng;

import ru.shevtsov.caloriesmng.mather.ModelMatcher;
import ru.shevtsov.caloriesmng.model.BaseEntity;
import ru.shevtsov.caloriesmng.model.Role;
import ru.shevtsov.caloriesmng.model.User;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

/**
 * Created by dead_rabbit
 * 15.10.2016
 */
public class UserTestData {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserTestData.class);


    public static final TestUser USER = new TestUser(BaseEntity.START_SEQ, "User", "user@yandex.ru", "password", true, Role.ROLE_USER);
    public static final User ADMIN = new TestUser(BaseEntity.START_SEQ + 1, "Admin", "admin@gmail.com", "admin", true, Role.ROLE_ADMIN);

    public static class TestUser extends User {

        public TestUser(User u) {
            this(u.getId(), u.getName(), u.getEmail(), u.getPassword(), u.isEnabled(), u.getRoles());
        }

        public TestUser(String name, String email, String password, Role role, Role ... roles) {
            this(null, name, email, password, true, EnumSet.of(role, roles));
        }

        public TestUser(Integer id, String name, String email, String password, boolean enabled, Role role, Role ... roles) {
            this(id, name, email, password, enabled, EnumSet.of(role, roles));
        }

        public TestUser(Integer id, String name, String email, String password, boolean enabled, Set<Role> roles) {
            super(id, name, email, password, enabled, roles);
        }

        public User asUser() {return new User(this);}

        @Override
        public String toString() {
            return "User{" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", enabled=" + enabled +
                    ", registered=" + registered +
                    ", autoritties=" + roles +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TestUser that = (TestUser) o;

            return Objects.equals(this.password, that.password)
                    && Objects.equals(this.id, that.id)
                    && Objects.equals(this.name, that.name)
                    && Objects.equals(this.email, that.email)
                    && Objects.equals(this.enabled, that.enabled);

        }

    }

    public static final ModelMatcher<User, TestUser> MATCHER = new ModelMatcher<>(
            new Function<User, TestUser>() {
                @Override
                public TestUser apply(User u) { return ((u instanceof TestUser) ? (TestUser) u : new TestUser(u)); }
            });

}
