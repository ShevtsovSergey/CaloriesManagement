package ru.shevtsov.caloriesmng.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.shevtsov.caloriesmng.service.UserService;

/**
 * Created by dead_rabbit
 * 07.10.2016
 */
@Controller
public class UserRestController {

    @Autowired
    private UserService service;

}
