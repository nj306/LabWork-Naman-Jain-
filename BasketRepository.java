package com.cg.es.repository;

import java.util.List;
import com.cg.es.entities.Basket;
import com.cg.es.entities.ElectronicProduct;
import com.cg.es.error.BasketNotFoundException;


public interface BasketRepository {
	
	public Basket addBasket(Basket basket);
	public Basket removeBasket(int basketId) throws BasketNotFoundException;
	public Basket addProduct(Basket basket,ElectronicProduct pr,int quantity);
	public Basket updateQuantityInBasket(Basket basket,ElectronicProduct pr,int quantity);
	public double totalCost();
	public Basket viewBasket(Basket basket);


}
