package com.machinetest.repositoy;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.machinetest.entity.item;

public interface ItemRepository extends JpaRepositoryImplementation<item, Integer> {

}
