package com.example.controller;

import com.example.dto.customer.CustomerDto;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer.CustomerType;
import com.example.model.service.ICustomerService;
import com.example.model.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    ICustomerTypeService iCustomerTypeService;
    @GetMapping(value = "/list")
    public String showListCustomer(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> name) {

        String names="";
        if(name.isPresent()){
            names = name.get();
        }
        Page<Customer> customers = iCustomerService.findByNameCustomer(names,pageable);
        model.addAttribute("customers", customers);
        model.addAttribute("names", names);
        return "/customer/list-customer";
    }
    @GetMapping(value = "/create")
    public String ShowFormCreateProduct(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        model.addAttribute("customerTypeList",iCustomerTypeService.findAll());
        return "/customer/create-customer";
    }

    @PostMapping(value = "/create")
    public String createProduct(@ModelAttribute @Valid CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("customerTypeList",iCustomerTypeService.findAll());
            return "/customer/create-customer";
        }
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        iCustomerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message", "Update customer successfully!");
        return "redirect:/customer/list";
    }
    @GetMapping(value = "/update")
    public String showFormUpdateProduct(@RequestParam String id, Model model){
        Customer customer=iCustomerService.findByIdCustomer(id);
        CustomerDto customerDto=new CustomerDto();
        BeanUtils.copyProperties(customer,customerDto);
        model.addAttribute("customerDto",customerDto);
        model.addAttribute("customerTypeList",iCustomerTypeService.findAll());
        return "/customer/update-customer";
    }
    @PostMapping(value = "/update")
    public String updateCustomer(@ModelAttribute @Valid CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("customerTypeList",iCustomerTypeService.findAll());
            return "/customer/create-customer";
        }
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        iCustomerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message", "Update customer successfully!");
        return "redirect:/customer/list";
    }
}
