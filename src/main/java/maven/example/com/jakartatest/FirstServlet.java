package maven.example.com.jakartatest;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "firstServlet", value = "/first-servlet")
public class FirstServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();

    Integer count = (Integer) session.getAttribute("count");
    if (count == null) {
      count = 1;
      session.setAttribute("count", count);
    } else {
      session.setAttribute("count", ++count);
    }

    PrintWriter pw = response.getWriter();
    pw.println("<html>");
    pw.println("<h1>Ur count is: " + count + "</h1>");
    pw.println("</html>");
  }
}
