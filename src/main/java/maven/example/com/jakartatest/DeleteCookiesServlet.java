package maven.example.com.jakartatest;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "deleteCookiesServlet", value = "/delete-cookies-servlet")
public class DeleteCookiesServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie cookie = new Cookie("some_id", "");

    cookie.setMaxAge(0);

    response.addCookie(cookie);
  }
}
