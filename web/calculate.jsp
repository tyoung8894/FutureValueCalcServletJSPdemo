<%-- 
    Document   : calculate
    Created on : Oct 26, 2016, 4:38:04 PM
    Author     : tyoung12 --%>


 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
    /head>
    <body>
    <label>Investment Amount:</label>
    <span>${user.investmentAmount}</span><br>
    <label>Yearly Interest Rate:</label>
    <span>${user.yearlyInterestRate}</span><br>
    <label>Number Of Years:</label>
    <span>${user.numberOfYears}</span><br>
    </body>
</html>
