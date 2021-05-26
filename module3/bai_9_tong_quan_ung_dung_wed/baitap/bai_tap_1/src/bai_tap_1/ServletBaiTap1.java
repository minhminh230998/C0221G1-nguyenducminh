package bai_tap_1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletBaiTap1", urlPatterns = "/gia")
public class ServletBaiTap1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float prices = Float.parseFloat(request.getParameter("price"));
        float discounts = Float.parseFloat(request.getParameter("discount"));
        double amount = prices * discounts * 0.01;
        request.setAttribute("giaTien",amount);
        RequestDispatcher dispatcher=request.getRequestDispatcher("giaTien.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
