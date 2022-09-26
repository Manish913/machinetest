package com.machinetest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.machinetest.entity.Orders;
import com.machinetest.repositoy.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderrepo;
	@Override
	public Orders save(Orders order) {
		return orderrepo.save(order);
	}
	@Override
	public Orders getOneOrder(long id) {
		Optional<Orders> findById =  orderrepo.findById((int) id);
	      Orders order = findById.get();
			return order;
	}

}
