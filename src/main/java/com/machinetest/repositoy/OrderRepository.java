package com.machinetest.repositoy;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.machinetest.entity.Orders;

public interface OrderRepository extends JpaRepositoryImplementation<Orders, Integer> {

}
