package com.cg.es.repository;

import java.util.List;

import com.cg.es.entities.ElectronicProduct;
import com.cg.es.error.ElectronicProductNotFoundException;

public interface ElectronicProductRepository {

	public ElectronicProduct addProduct(ElectronicProduct product);
	public ElectronicProduct updateProduct(ElectronicProduct product) throws ElectronicProductNotFoundException;
	public ElectronicProduct removeProduct(int productId) throws ElectronicProductNotFoundException;
	public List<ElectronicProduct> showAllProducts();
	public ElectronicProduct viewProduct(int ProductdId);
	public List<ElectronicProduct> showAllProducts(String category);
	public List<ElectronicProduct> showProductListByName(String name);

}
