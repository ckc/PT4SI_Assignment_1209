import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import web_service.ArrayOfAgegroup;
import web_service.WebService2011Population;
import java.util.*;
import web_service.Agegroup;

public class byAge extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_50465/WebService_2011Population.asmx.wsdl")
    private WebService2011Population service;

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
            out.println("<title>Servlet by Age</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet by Age at " + request.getContextPath() + "</h1>");
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
        ArrayOfAgegroup agegroup = getAllPopByAge();
        ArrayList<Agegroup> agelist = new ArrayList<Agegroup>();
        agelist = (ArrayList<Agegroup>) agegroup.getAgegroup();
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AgeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgeServlet at " + request.getContextPath() + "</h1>");
            out.println("<table>");
            for(Agegroup temp : agelist){
                out.print("<tr>");
                out.println("<td>"+temp.getType()+"</td>");
                out.println("<td>"+temp.getMale()+"</td>");
                out.println("<td>"+temp.getFemale()+"</td>");
                out.println("<td>"+temp.getTotal()+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
                
            out.println("</body>");
            out.println("</html>");
        }
        
       // processRequest(request, response);
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

    private ArrayOfAgegroup getAllPopByAge() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        web_service.WebService2011PopulationSoap port = service.getWebService2011PopulationSoap();
        return port.getAllPopByAge();
    }

}
