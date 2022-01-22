/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chinedu Alake
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalc.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
         String result;
        request.setAttribute("first",firstInput);
        request.setAttribute("second",secondInput);

        if (firstInput != null && secondInput != null) {
            try {
                
                int first = Integer.parseInt(firstInput);
                int second = Integer.parseInt(secondInput);
                String calc = request.getParameter("operation");
                
                switch(calc){
                    case "+": result = (first + second) + "";
                    request.setAttribute("message", result);
                    break;
                    
                    case "-": result = (first - second) + "";
                    request.setAttribute("message", result);
                    break;
                    
                    case "*": result = (first * second) + "";
                    request.setAttribute("message", result);
                    break;
                    
                    case "%": result = (first / second) + "";
                    request.setAttribute("message", result);
                    break;
                }

            
        }catch(NumberFormatException e){
           request.setAttribute("message","Result: invalid");
        }
                
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalc.jsp").forward(request, response);
    }
    }
}



