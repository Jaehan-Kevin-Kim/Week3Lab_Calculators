
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class arithmeticcalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        request.setAttribute(("result"),"---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
       
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
        String firstInput = request.getParameter("firstInput");
        String secondInput = request.getParameter("secondInput");
        String plus = request.getParameter("plus");
        String minus = request.getParameter("minus");
        String multiply = request.getParameter("multiply");

        int result = 0;
        
        request.setAttribute("firstInput", firstInput);
        request.setAttribute("secondInput", secondInput);
        
        if (firstInput == null || firstInput.equals("") || secondInput ==null || secondInput.equals("") ){
            request.setAttribute("result", "invalid");
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
              return;
        }
        
        try {
            
        int firstInputInt = Integer.parseInt(firstInput);
        int secondInputInt = Integer.parseInt(secondInput);
     
        
            if (plus != null){
                result = firstInputInt + secondInputInt;
                System.out.println(result);
            } else   if (minus != null){
                result = firstInputInt - secondInputInt;
            } else   if (multiply != null){
                result = firstInputInt * secondInputInt;
            } else {
                result = firstInputInt % secondInputInt;
            }
             
            request.setAttribute("result", Integer.toString(result));
            
        } catch (Exception e){
             request.setAttribute("result", "invalid");
        }
                
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
                
        
    }


}
