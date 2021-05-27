package servlet;

import productModel.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletProduct", urlPatterns = "/product")

public class ServletProduct extends HttpServlet {
    private ProductService productService=new ProductServiceImpl();
    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> product = productService.findAll();
        request.setAttribute("product", product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                break;
            case "update":
                break;
            case "remove":
                break;
            default:
                break;

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "view":
                break;
            case "create":
                break;
            case "update":
                break;
            case "remove":
                break;
            default:
                listProduct(request,response);
                break;

        }
    }

}
