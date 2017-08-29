package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;


@Controller
public class ProductController {
    @Autowired
	ProductDAO productdao;
	
	@RequestMapping("/viewPro")
	public ModelAndView viewProducts()
	{
		List<Product> list=productdao.getProductList();
		return new ModelAndView("viewProductList","list",list );
	}
	
	
	@RequestMapping("/addP")
	public ModelAndView add(){
		ModelAndView mav=new ModelAndView("addProduct");
		mav.addObject("cmd",new Product());
		return mav;
	}
	
	@RequestMapping(value="/newProduct",method=RequestMethod.POST)
	public ModelAndView viewProduct(@ModelAttribute("cmd") Product p){
	
		ModelAndView mav=new ModelAndView("redirect:/viewPro");
		//mav.addObject("pro",p);
		productdao.save(p);
		return mav;
	}

	@RequestMapping(value="/deletepro/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
	productdao.deleteProduct(id);
		return new ModelAndView("redirect:/viewPro");
	}

	@RequestMapping(value="/editpro/{id}")
	public ModelAndView update(@PathVariable int id){
	Product p=productdao.getProductById(id);
	return new ModelAndView("EditProduct","command",p);
	}
	
	@RequestMapping(value="/editSave")
	public ModelAndView updateSave(@ModelAttribute ("command")Product pro){
		productdao.updateProduct(pro);
		return new ModelAndView("redirect:/viewPro");
	}

	
}
