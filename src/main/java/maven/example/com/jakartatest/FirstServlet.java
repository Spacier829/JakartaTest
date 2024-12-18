package maven.example.com.jakartatest;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import logic.Cart;

@WebServlet(name = "firstServlet", value = "/first-servlet")
public class FirstServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();

    String user = session.getAttribute("current_user").toString();
    if (user == null) {
      // response для анонима
      // Регистрация
      // session.setAttribute("current_user", ID)
    } else {
      //response для авторизованного пользова теля
    }

//    Cart cart = (Cart) session.getAttribute("cart");
//
//    String name = request.getParameter("name");
//    int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//    if (cart == null) {
//      cart = new Cart();
//      cart.setName(name);
//      cart.setQuantity(quantity);
//    }
//
//    session.setAttribute("cart", cart);


//    PrintWriter pw = response.getWriter();
//    pw.println("<html>");
//    pw.println("<h1>Ur count is: " +  + "</h1>");
//    pw.println("</html>");

    getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
  }
}
