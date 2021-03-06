package ru.shevtsov.caloriesmng.web.mock;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.shevtsov.caloriesmng.model.Role;
import ru.shevtsov.caloriesmng.model.User;
import ru.shevtsov.caloriesmng.util.exception.ExceptionUtil;
import ru.shevtsov.caloriesmng.util.exception.NotFoundException;
import ru.shevtsov.caloriesmng.web.user.AdminUserRestController;

import java.util.Arrays;

/**
 * Created by dead_rabbit
 * 11.10.2016
 */
public class UserAdminMockTest {
    private static ConfigurableApplicationContext appCtx;
    private static AdminUserRestController controller;

    @BeforeClass
    public static void beforeClass() {
        appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");
        controller = appCtx.getBean(AdminUserRestController.class);
    }

    @AfterClass
    public static void afterClass() { appCtx.close(); }

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
