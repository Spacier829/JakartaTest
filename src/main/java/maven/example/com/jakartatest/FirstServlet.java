package maven.example.com.jakartatest;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "firstServlet", value = "/first-servlet")
public class FirstServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    response.sendRedirect("https://github.com/JakartaTest/jakartatest");
//    response.sendRedirect("/testJsp.jsp");
//    response.setContentType("text/html");
//
//    // Hello
//    PrintWriter out = response.getWriter();
//    out.println("<html><body>");
//    out.println("<h1>" + "First Servlet" + "</h1>");
//    out.println("</body></html>");
  }
}
