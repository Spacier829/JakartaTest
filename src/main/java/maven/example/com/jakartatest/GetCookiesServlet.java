package maven.example.com.jakartatest;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "getCookiesServlet", value = "/get-cookies-servlet")
public class GetCookiesServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();

    PrintWriter pw = response.getWriter();

    pw.println("<html>");
    for (Cookie cookie : cookies) {
      pw.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");
    }
    pw.println("</html>");
  }
}
