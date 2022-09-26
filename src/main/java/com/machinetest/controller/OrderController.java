package com.machinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.machinetest.dto.OrderRequest;
import com.machinetest.entity.Orders;
import com.machinetest.repositoy.ItemRepository;
import com.machinetest.repositoy.OrderRepository;
import com.machinetest.services.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderservice;
	
	@Autowired
	private OrderRepository orderrepo;
	@Autowired
	private ItemRepository itemrepo;
	
	@PostMapping("/orders")
	public Orders saveorder(@RequestBody OrderRequest request) {
		return orderservice.save(request.getOrders());
	}
	
	@GetMapping("/order")
	public List<Orders> findAllOrders(){
		return orderrepo.findAll();
	}
	
	@GetMapping("/lead/{id}")
	public Orders getOneLead(@PathVariable("id") long id) {
		Orders order = orderservice.getOneOrder(id);
		return order;
		
	}
}
