package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/age"})
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String currentAgeString = request.getParameter("age");

        if (currentAgeString == null || currentAgeString.equals("")) {
            request.setAttribute("message", "You must give your current age");

        } else {
            try {
                int currentAgeInt = Integer.parseInt((request.getParameter("age")));
                String nextAge = Integer.toString(++currentAgeInt);
                request.setAttribute("message", "Your age next birthday will be " + nextAge);
            } catch (Exception e) {
                request.setAttribute("message", "You must enter a number.");

            }
        }

//        request.setAttribute("message", "Your age next birthday will be "+ nextAge);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
//        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
