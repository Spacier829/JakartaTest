package maven.example.com.jakartatest;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "setCookiesServlet", value = "/set-cookies-servlet")
public class SetCookiesServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie cookie1 = new Cookie("some_id", "123");
    Cookie cookie2 = new Cookie("some_name", "Bob");

    cookie1.setMaxAge(24 * 60 * 60);
    cookie2.setMaxAge(24 * 60 * 60);

    response.addCookie(cookie1);
    response.addCookie(cookie2);
  }
}
