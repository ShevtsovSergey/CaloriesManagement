package ru.shevtsov.caloriesmng.web;

import ru.shevtsov.caloriesmng.LoggerWrapper;

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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.debug("RequestDispatcher userList");
        request.getRequestDispatcher("/userList.jsp").forward(request, response);
    }
}
