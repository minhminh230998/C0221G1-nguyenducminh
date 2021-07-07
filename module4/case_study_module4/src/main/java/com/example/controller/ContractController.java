package com.example.controller;

import com.example.dto.contract.ContractDto;
import com.example.dto.service.ServiceDto;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.service.Services;
import com.example.model.service.IContractService;
import com.example.model.service.ICustomerService;
import com.example.model.service.IEmployeeService;
import com.example.model.service.IServiceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/contract")
public class ContractController {
    @Autowired
    IContractService iContractService;
    @Autowired
    IServiceService serviceService;
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    ICustomerService iCustomerService;
    @GetMapping(value = "/create")
    public String ShowFormCreateContract(Model model) {
        model.addAttribute("contractDto", new ContractDto());
        model.addAttribute("customerList",iCustomerService.findAllCustomer());
        model.addAttribute("employeeList",iEmployeeService.findAllEmployee());
        model.addAttribute("serviceList",serviceService.findAllService());
        return "/contract/create-contract";
    }

    @PostMapping(value = "/create")
    public String createContract(@ModelAttribute @Valid ContractDto contractDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("customerList",iCustomerService.findAllCustomer());
            model.addAttribute("employeeList",iEmployeeService.findAllEmployee());
            model.addAttribute("serviceList",serviceService.findAllService());
            return "/contract/create-contract";
        }
        Contract contract=new Contract();
        BeanUtils.copyProperties(contractDto,contract);
        iContractService.saveContract(contract);
        redirectAttributes.addFlashAttribute("message", "Update contract successfully!");
        return "redirect:/customer/list";
    }
}
