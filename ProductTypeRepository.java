package com.cg.es.repository;

import java.util.List;

import com.cg.es.entities.ProductType;

public interface ProductTypeRepository {
	
	public boolean addProductType(ProductType ProductType);
	public boolean updateProductType(ProductType ProductType);
	public boolean removeProductType(int ProductTypeId);
	
	public List<ProductType> showAllProductTypes();
	public boolean getProductType(int prdTypeId);
	
}
