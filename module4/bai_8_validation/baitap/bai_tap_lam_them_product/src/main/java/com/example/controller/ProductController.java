package com.example.controller;

import com.example.dto.ProductDto;
import com.example.model.entity.Product;
import com.example.model.service.IManufacturerService;
import com.example.model.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;
    @Autowired
    IManufacturerService iManufacturerService;
    @GetMapping(value = {"", "/product"})
    public String findAll(Model model, @PageableDefault(size = 5)Pageable pageable, @RequestParam Optional<String> name) {

        String names="";
        if(name.isPresent()){
            names = name.get();
        }
        Page<Product> products = iProductService.findByName(pageable,names);
        model.addAttribute("products", products);
        model.addAttribute("names", names);
        return "/product/list";
    }

    @GetMapping(value = "/product/create")
    public String ShowFormCreateProduct(Model model) {
        model.addAttribute("productDto", new ProductDto());
        model.addAttribute("manufacturers",iManufacturerService.findAll());
        return "/product/create";
    }

    @PostMapping(value = "/product/create")
    public String createProduct(@ModelAttribute @Valid ProductDto productdto, BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("manufacturers",iManufacturerService.findAll());
            return "/product/create";
        }
        Product product=new Product();
        BeanUtils.copyProperties(productdto,product);
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("message", "Update customer successfully!");
        return "redirect:/product";
    }
    @GetMapping(value = "/product/update")
    public String showFormUpdateProduct(@RequestParam int id, Model model){
        Product product=iProductService.findById(id);
        model.addAttribute("product",product);
        model.addAttribute("manufacturers",iManufacturerService.findAll());
        return "/product/update";
    }
    @PostMapping(value = "/product/update")
    public String updateCustomer(@ModelAttribute Product product){
        iProductService.save(product);
        return "redirect:/product";
    }
    @GetMapping("product/delete")
    public String showFormDelete(@RequestParam int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/product/delete";
    }
    @PostMapping("/product/delete")
    public String delete(@ModelAttribute Product product, RedirectAttributes redirect) {
        iProductService.deleteById(product.getId());
        redirect.addFlashAttribute("message", "Removed customer successfully!");
        return "redirect:/product";
    }
//    @PostMapping("/product/delete1")
//    public String delete1(Product product, RedirectAttributes redirect) {
//        iProductService.deleteProduct(product.getId());
//        redirect.addFlashAttribute("message", "Removed customer successfully!");
//        return "redirect:/product";
//    }
    @GetMapping("/product/view")
    public String show(@RequestParam int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/product/view";
    }
//    @GetMapping(value = "/product/search")
//    public String searchProduct(@RequestParam String search,Model model){
//        List<Product> products=iProductService.findByName(search);
//
//        if(products.size()!=0) {
//            model.addAttribute("products", products);
//            return "/product/list";
//        }else {
//            model.addAttribute("message","loi");
//            return "/product/error";
//        }
//    }
}
