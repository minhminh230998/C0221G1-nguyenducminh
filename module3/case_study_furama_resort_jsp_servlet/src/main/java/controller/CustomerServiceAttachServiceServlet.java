package controller;

import model.bean.customer.Customer;
import model.bean.customerService.AttachServiceContract;
import model.bean.customerService.CustomerService;
import model.service.IAttachService;
import model.service.IAttachServiceContract;
import model.service.ICustomerService;
import model.service.ICustomerServiceService;
import model.service.impl.AttachServiceContractImpl;
import model.service.impl.CustomerServiceImplService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServiceAttachServiceServlet",urlPatterns = "/cusseratt")
public class CustomerServiceAttachServiceServlet extends HttpServlet {
    ICustomerServiceService iCustomerServiceService=new CustomerServiceImplService();
    IAttachServiceContract iAttachServiceContract=new AttachServiceContractImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                showFormDelete(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerService> customerServiceList= iCustomerServiceService.findAll();
        List<AttachServiceContract> attachServiceContractList=iAttachServiceContract.findAll();
        request.setAttribute("customerServiceList",customerServiceList);
        request.setAttribute("attachServiceContractList",attachServiceContractList);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/customerServiceAttach/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
