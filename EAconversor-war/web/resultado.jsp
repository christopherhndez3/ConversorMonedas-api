<%-- 
    Document   : resultado
    Created on : 22/05/2021, 07:37:18 PM
    Author     : chris
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <jsp:include page="/WEB-INF/jspf/bootstrap.jspf"></jsp:include>
    </head>
    <body>
         <jsp:include page="/WEB-INF/jspf/encabezado.jspf"></jsp:include>
    
        <div class="container"> 
        <h4> Resultado de solicitud de seguro</h4>
            <div class="alert alert-success" role="alert">
                hoy los valores de la moneda dolar son $${metodos.valorDolar}  y la moneda Euro son: $ ${metodos.valorEuro}.
            </div>
            <div class="alert alert-secondary" role="alert">
                El resultado de su conversion es $<fmt:formatNumber  maxFractionDigits = "2" value = "${metodos.conversion_hecha}" />
                
                
               
            </div>
         </div>
    </body>
</html>
