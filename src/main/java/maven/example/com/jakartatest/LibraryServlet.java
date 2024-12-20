package maven.example.com.jakartatest;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.sql.*;

@WebServlet(name = "libraryServlet", value = "/library-servlet")
public class LibraryServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter pw = response.getWriter();

    try {
      Class.forName("org.sqlite.JDBC");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    try {
      Connection connection = DriverManager.getConnection("jdbc:sqlite:D:/Files/Projects/Java/JakartaTest/src/main/java/maven/example/com/jakartatest/users.db");
      Statement stmt = connection.createStatement();
      ResultSet rs = stmt.executeQuery("select * from users");
      while (rs.next()) {
        pw.println(rs.getString("id") + " " +
                   rs.getString("name") + " " + rs.getString("age"));
      }
      stmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
