package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller dp);
	void update(Seller dp);
	void DeleteById(Integer id);
	Seller findById(Integer id);
	List<Seller>findAll();	
}
