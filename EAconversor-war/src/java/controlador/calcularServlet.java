/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Indicador;
import negocio.metodos;
import sessionBean.convertidorBeanLocal;

/**
 *
 * @author chris
 */
@WebServlet(name = "calcularServlet", urlPatterns = {"/calcularServlet"})
public class calcularServlet extends HttpServlet {

    @EJB
    private convertidorBeanLocal convertidorBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            Indicador indicador = new Indicador();
            metodos Metodos = new metodos();

            double monto = Integer.parseInt(request.getParameter("txt_monto"));
            int opcion = Integer.parseInt(request.getParameter("values"));

            double valorDolar = indicador.obtenerValorDolarApi();
            Metodos.setValorDolar(valorDolar);

            double valorEuro = indicador.obtenerValorEuroApi();
            Metodos.setValorEuro(valorEuro);

            switch (opcion) {
                case 1:
                    
                    if(opcion == 1){
                    double test = convertidorBean.convertirClpADolar(valorDolar, monto);
                    Metodos.setConversion_hecha(test);
                    }
                    break;
                case 2:
                    
                    if(opcion == 2){                        
                    double test = convertidorBean.convertirClpAEuro(valorEuro, monto);
                    Metodos.setConversion_hecha(test);                    
                    }
                    break;
                case 3:
                    
                    if(opcion == 3){
                    double test = convertidorBean.convertirDolarAClp(valorDolar, monto);
                    Metodos.setConversion_hecha(test);
                    }        
                    

                    break;
                case 4:
                       
                    if(opcion == 4){
                    double test = convertidorBean.convertirDolarAEuro(valorEuro, monto, valorDolar);
                    Metodos.setConversion_hecha(test); 
                        
                    }
                    break;
                case 5:

                    if(opcion == 5 ){
                    double test = convertidorBean.convertirEuroAClp(valorEuro, monto);
                    Metodos.setConversion_hecha(test);
                    
                    }
                    break;
                case 6:

                    if(opcion == 6){
                    double test = convertidorBean.convertirEuroADolar(valorEuro, monto, valorDolar);
                    Metodos.setConversion_hecha(test);
                    }
                    break;
            }
            
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("/resultado.jsp");
            
            
            
            request.setAttribute("monto",  monto);
            request.setAttribute("conversion_hecha", Metodos);
            request.setAttribute("valorDolar", valorDolar);
            request.setAttribute("metodos", Metodos);
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
