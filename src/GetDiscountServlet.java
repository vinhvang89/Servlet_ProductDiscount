import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetDiscountServlet",urlPatterns = "/result")
public class GetDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String price = request.getParameter("price");
            String description = request.getParameter("description");
            String discount = request.getParameter("discount");
            float price1 = Float.parseFloat(price);
            float discount1 = Float.parseFloat(discount);
            float discountProduct = discount1*price1;
        PrintWriter printWriter = response.getWriter();
        printWriter.print(description + " total discount : " + discountProduct);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
