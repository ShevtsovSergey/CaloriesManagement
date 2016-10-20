package ru.shevtsov.caloriesmng.web;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import ru.shevtsov.caloriesmng.LoggerWrapper;
import ru.shevtsov.caloriesmng.service.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dead_rabbit
 * 06.10.2016
 */
public class UserServlet extends HttpServlet {

    private static final LoggerWrapper LOG = LoggerWrapper.get(UserServlet.class);
    private WebApplicationContext wac;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.debug("RequestDispatcher userList");
        UserService us = wac.getBean(UserService.class);
        request.setAttribute("userList", us.getAll());
        request.getRequestDispatcher("/userList.jsp").forward(request, response);

        //response.sendRedirect("userList.jsp");
    }
}
