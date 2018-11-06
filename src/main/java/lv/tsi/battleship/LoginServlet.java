package lv.tsi.battleship;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("User: '" + name + "', is trying to log in using: '" + password + "' password.");

        if ("Johnson".equals(password)) {
            request.getRequestDispatcher("/WEB-INF/success.jsp").include(request, response);
            System.out.println("User: '" + name + "' has logged in.");
        } else {
            response.sendRedirect("fail.jsp");
            System.out.println("Trying to access user: '" + name + "' with failure - wrong password.");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
