/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Web_Service.ArrayOfEdu;
import Web_Service.Edu;
import Web_Service.WebService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Administrator
 */
public class EducationServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_49697/WebService.asmx.wsdl")
    private WebService service;

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
            out.println("<title>Servlet EducationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Servlet EducationServlet at " + request.getContextPath() + "</h1>");
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
        ArrayOfEdu edu =  getAllByEdu();
        ArrayList<Edu> edulist = new ArrayList<Edu>();
        edulist = ( ArrayList<Edu>) edu.getEdu();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" crossorigin=\"anonymous\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.dataTables.min.css\"> <script type=\"text/javascript\" language=\"javascript\" src=\"js/jquery-1.11.3.min.js\">\n" +
"	</script>\n" +
"	<script type=\"text/javascript\" language=\"javascript\" src=\"js/jquery.dataTables.min.js\"></script>");
            out.println("<script src=\"js/bootstrap.min.js\" crossorigin=\"anonymous\"></script>");
            out.println("<title>Education</title>");                        
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class=\"navbar navbar-default\">\n" +
"            <div class=\"container-fluid\">\n" +
"                <!-- Brand and toggle get grouped for better mobile display -->\n" +
"                <div class=\"navbar-header\">\n" +
"                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n" +
"                        <span class=\"sr-only\">Toggle navigation</span>\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                        <span class=\"icon-bar\"></span>\n" +
"                    </button>\n" +
"                    <a class=\"navbar-brand\" href=\"./\">Population Query</a>\n" +
"                </div>\n" +
"\n" +
"                <!-- Collect the nav links, forms, and other content for toggling -->\n" +
"                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n" +
"                    <ul class=\"nav navbar-nav\">\n" +
"                        <li><a href=\"./\">Index</a></li>\n" +
"                        <li class=\"dropdown\">\n" +
"                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Online Query <span class=\"caret\"></span></a>\n" +
"                            <ul class=\"dropdown-menu\">\n" +
"                                <li class=\"active\"><a href=\"EducationServlet\">By Education</a></li>\n" +
"                                <li role=\"separator\" class=\"divider\"></li>\n" +
"                                <li><a href=\"AgeServlet\">By Age</a></li>\n" +
"                                <li role=\"separator\" class=\"divider\"></li>\n" +
"                                <li><a href=\"DistrictServlet\">By District</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                    </ul>\n" +
"                </div><!-- /.navbar-collapse -->\n" +
"            </div><!-- /.container-fluid -->\n" +
"        </nav>");
            
             out.println("<table id=\"example\" class=\"display table\" cellspacing=\"0\" width=\"100%\">");
             out.println("<thead><tr><th>Occupation</th><th>\"No schooling / \n" +
"Pre-primary\"</th><th>Primary</th><th>Lower Secondary</th><th>Upper Secondary / Sixth Form</th><th>Diploma / Certificate</th><th>Sub-degree course</th><th>Degree course</th><th>Total</th></tr></thead><tbody>");
            for(Edu temp : edulist){

                out.println("<tr><td>"+temp.getType()+"</td>");
                out.println("<td>"+temp.getPreprimary()+"</td>");
                out.println("<td>"+temp.getPrimary()+"</td>");
                out.println("<td>"+temp.getLowersecondary()+"</td>");
                out.println("<td>"+temp.getIppersecondary()+"</td>");
                out.println("<td>"+temp.getDiploma()+"</td>");
                out.println("<td>"+temp.getSubdegreel()+"</td>");
                out.println("<td>"+temp.getDegree()+"</td>");
                out.println("<td>"+temp.getTotal()+"</td>");
                out.println("</tr>");
            }
            out.println("</tbody></table>");
            out.println("<script>");
            out.printf("$(document).ready(function() {\n" +
"    $('#example').DataTable();\n" + "})</script>");
            out.println("</body>");
            out.println("</html>");
        }
        //processRequest(request, response);
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

    private ArrayOfEdu getAllByEdu() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Web_Service.WebServiceSoap port = service.getWebServiceSoap();
        return port.getAllByEdu();
    }

    
    
}
