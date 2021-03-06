package ru.shevtsov.caloriesmng;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.shevtsov.caloriesmng.repository.UserRepository;

import java.util.Arrays;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
public class SpringMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("Bean definition names: " + Arrays.toString(appCtx.getBeanDefinitionNames()));

        UserRepository userRepository = (UserRepository) appCtx.getBean("mockUserRepository");
        UserRepository userRep = appCtx.getBean(UserRepository.class);
        userRepository.getAll();
        appCtx.close();
    }

}
