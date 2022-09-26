package com.machinetest.services;

import com.machinetest.entity.Orders;

public interface OrderService {

	public Orders save(Orders lead);

	public Orders getOneOrder(long id);
}
