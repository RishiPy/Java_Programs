package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDao dao;
	
	@RequestMapping("/first")
	public String acc() {

		return "homepage";
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.GET)
	public ModelAndView add(){
		ModelAndView mav=new ModelAndView("product");
		mav.addObject("cmd",new Product());
		List<Product> l=dao.getProductList();
		mav.addObject("productlist", l);
	   return mav;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String added(@ModelAttribute("cmd") Product p){
		dao.saveProduct(p);
	    return "redirect:/addProduct";
	}
	
	@RequestMapping(value="/delete/{pid}")	
		public ModelAndView delete(@PathVariable int pid){
		dao.deleteProduct(pid);
			return new ModelAndView("redirect:/addProduct");
		}
	
	@RequestMapping(value="/editpro/{pid}")	
	public ModelAndView update(@PathVariable int pid){
		Product p=dao.getProductById(pid);
		return new ModelAndView("EditProduct","cmd",p);
	}

	@RequestMapping(value="/Save",method=RequestMethod.POST)
	public ModelAndView updateSave(@ModelAttribute ("cmd")Product pid){
		dao.editProduct(pid);
		return new ModelAndView("redirect:/addProduct");
	}
	
	
	}

	
	


