package mainPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chanhnguyen
 */
@WebServlet(urlPatterns = {"/CoffeeMakerServlet"})
public class CoffeeMakerServlet extends HttpServlet {
    
    private final CoffeeMaker myCoffeeMaker = CoffeeMaker.getInstance();

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CoffeeMakerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CoffeeMakerServlet at " + request.getContextPath() + "</h1>");         
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
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        String info = request.getParameter("button");
        if(info.equals("clickedOnOff")){
            myCoffeeMaker.pressOnOff();
            out.print(myCoffeeMaker.getIsOn());
        } else if (info.contains("Water")){
            int currentWater = Integer.parseInt(info.substring(7));
            myCoffeeMaker.addWater(currentWater + 10);
            out.print(myCoffeeMaker.getWaterAmount());
        } else if (info.contains("Bean")){
            int currentBean = Integer.parseInt(info.substring(6));
            myCoffeeMaker.addBean(currentBean + 10);
            out.print(myCoffeeMaker.getBeanAmount());
        } else if (info.equals("brew")){
            if(myCoffeeMaker.makeCoffee(3, 7)){
                out.print(myCoffeeMaker.getWaterAmount()+"-"+ myCoffeeMaker.getBeanAmount());
            }else{
                out.print("noCoffee");
            }
        }   
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
