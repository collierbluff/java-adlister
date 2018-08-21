import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza")
public class PizzaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String pizzaSize = request.getParameter("pizzaSize");
        String pizzaToppings = request.getParameter("ham") + "<br>" + request.getParameter("onion") + "<br>" + request.getParameter("mushroom");


        request.setAttribute("name", name);
        request.setAttribute("address", address);
        request.setAttribute("pizzaSize", pizzaSize);
        request.setAttribute("pizzaToppings", pizzaToppings);


        request.getRequestDispatcher("/pizza-summary.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);

    }
}
