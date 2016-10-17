package ru.shevtsov.caloriesmng.web.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.shevtsov.caloriesmng.model.Role;
import ru.shevtsov.caloriesmng.model.User;
import ru.shevtsov.caloriesmng.util.exception.NotFoundException;
import ru.shevtsov.caloriesmng.web.user.AdminUserRestController;


/**
 * Created by dead_rabbit
 * 12.10.2016
 */
@ContextConfiguration("classpath:spring/spring-app.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserAdminSpringMockTest {

    @Autowired
    private static AdminUserRestController controller;

    @Test
    public void testCreate() throws Exception {
        controller.create(new User(null, "Name", "email@ya.ru", "password", true, Role.ROLE_USER));
    }

    @Test
    public void testDelete() throws Exception {
        controller.delete(7);
    }

    @Test(expected = NotFoundException.class)
    public void testDeleteNotFound() throws Exception {
        controller.delete(0);
    }

}
