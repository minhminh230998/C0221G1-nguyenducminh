package Servlet;

import module.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer",urlPatterns = "/Customer")
public class ServletCustomer extends HttpServlet {
    List<Customer> list=new ArrayList<>();
    @Override
    public void init() throws ServletException {

        list.add(new Customer("Minh","20","Quảng Nam","https://cdnmedia.thethaovanhoa.vn/2015/03/30/15/45/m.jpg"));
        list.add(new Customer("Minh","20","Quảng Nam","https://cdnmedia.thethaovanhoa.vn/2015/03/30/15/45/m.jpg"));
        list.add(new Customer("Minh","20","Quảng Nam","https://cdnmedia.thethaovanhoa.vn/2015/03/30/15/45/m.jpg"));
        list.add(new Customer("Minh","20","Quảng Nam","https://cdnmedia.thethaovanhoa.vn/2015/03/30/15/45/m.jpg"));
        list.add(new Customer("Minh","20","Quảng Nam","https://cdnmedia.thethaovanhoa.vn/2015/03/30/15/45/m.jpg"));
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",list);
        request.getRequestDispatcher("/listCustomer.jsp").forward(request,response);
    }
}
