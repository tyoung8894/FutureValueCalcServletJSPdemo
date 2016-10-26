/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elon.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import elon.business.User;

/**
 *
 * @author tyoung12
 */
/**@WebServlet(name = "CalculatorServlet", urlPatterns = {"/calculate"}) */
public class CalculatorServlet extends HttpServlet {

   
     @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String investmentAmount = request.getParameter("InvestmentAmount");
        String yearlyInterestRate = request.getParameter("YearlyInterestRate");
        String numberOfYears = request.getParameter("NumberOfYears");
        
        User user = new User();
        user.setInvestmentAmount(investmentAmount);
        user.setYearlyInterestRate(yearlyInterestRate);
        user.setNumberOfYears(numberOfYears);        
        
        request.setAttribute("user", user);
        
        String url = "/calculate.jsp";
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
        
        @Override
        protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
        
}

