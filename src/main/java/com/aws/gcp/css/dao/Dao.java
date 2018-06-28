package com.aws.gcp.css.dao;

import java.util.List;

import com.aws.gcp.css.entity.Entity;


public interface Dao<T extends Entity, I>
{

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}