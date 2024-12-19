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
      Class.forName("org.postgresql.Driver");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    try {
      Connection connection = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/jakarta_ee_db",
          "postgres",
          "123");
      Statement stmt = connection.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM books");
      while (rs.next()) {
        pw.println(rs.getString("id") + " " +
                   rs.getString("title") + " " + rs.getString("author") + " " + rs.getString("quantity"));
      }
      stmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
