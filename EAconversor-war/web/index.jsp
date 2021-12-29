<%-- 
    Document   : index
    Created on : 19/05/2021, 08:42:42 PM
    Author     : chris
--%>

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
        
        <h1> conversor de monedas</h1>

        <div class="container"> 
            <form name="frm_ingreso" action="calcularServlet" method="post"> 

                <div class="mb-3">               
                    <label for="txt_monto" class="form-label"> Monto </label>
                    <input type="text" class="form-control" id="txt_monto" name="txt_monto" aria-describedby="ayudaMonto">
                    <div id="ayudaMonto" class="form-text">Ingrese el monto a convertir, EJ: 2000 Clp a Dolar </div>
                </div>                          


                <select class="form-select" aria-label="Default select example" id="values" name="values"> 
                    <option selected>seleccione la conversion de monedas que quiere realizar </option>
                    <option value="1">Peso Chileno a Dolar </option>
                    <option value="2">Peso Chileno a Euro</option>
                    <option value="3">Dolar a Peso Chileno</option>
                    <option value="4">Dolar a Euro</option>
                    <option value="5">Euro a Peso chileno</option>
                    <option value="6">Euro a Dolar</option>

                </select>

                <button type="submit" class="btn btn-primary">Realizar Conversion</button>
            </form>
        </div> 
        
        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="img/1a.jpg" height="700" width="300" class="d-block w-100" alt="300">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Moneda: Euro</h5>
                        <p>moneda usada dentro de toda la union europea.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="img/2a.png" height="700" width="300" class="d-block w-100" alt="300">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Moneda: Dolar Americano($)</h5>
                        <p>moneda usada dentro de los 51 estados que conforman los estados unidos de America.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="img/3a.png" height="700" width="300" class="d-block w-100" alt="300">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Moneda: Pesos Chilenos(CLP)</h5>
                        <p>moneda usada dentro del territorio continental e insular del territorio chileno.</p>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>


              
    </body>
</html>
