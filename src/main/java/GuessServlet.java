import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    private int randomNum = (int) (Math.random() * 100) + 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int guess = Integer.parseInt(request.getParameter("number"));

        String outcome = "";

        request.setAttribute("guess", guess);

        if(guess == randomNum){
            outcome = "Correct!";
        }else if(guess < randomNum){
            outcome = "Too Low!";
        }else if(guess > randomNum){
            outcome = "Too High!";
        }

        request.setAttribute("outcome", outcome);

        request.getRequestDispatcher("/result.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/guess.jsp").forward(request, response);

    }
}
