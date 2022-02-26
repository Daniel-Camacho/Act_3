/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kevin PC
 */
@WebServlet(urlPatterns = {"/calculadora"})
public class calculadora extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet calculadora at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        String suma = request.getParameter("suma");
        String resta = request.getParameter("resta");
        String multiplicacion = request.getParameter("multiplicacion");
        String division = request.getParameter("division");

            int resul = 0;

            if (suma != null) {
                resul = num1 + num2;
                out.println(resul);
            }
            if (resta != null) {
                resul = num1 - num2;
                out.println(resul);
            }
            if (multiplicacion != null) {
                resul = num1* num2;
                out.println(resul);
            }
            if (division != null && num2 != 0) {
                resul = num1 / num2;
                out.println(resul);
            }else{
                out.print("No es posible dividir entre 0");
            }
        
        request.setAttribute("resul", resul);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);    
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
