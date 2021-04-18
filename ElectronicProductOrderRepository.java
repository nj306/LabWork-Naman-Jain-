package com.cg.es.repository;

import java.util.List;

import com.cg.es.entities.ElectronicProductOrder;
import com.cg.es.error.ElectronicProductOrderNotFoundException;

public interface ElectronicProductOrderRepository {
	public ElectronicProductOrder addProductOrder(ElectronicProductOrder productOrder);
	public ElectronicProductOrder updateProductOrder(ElectronicProductOrder productOrder) throws ElectronicProductOrderNotFoundException;
	public ElectronicProductOrder removeProductOrder(int ProductOrderId) throws ElectronicProductOrderNotFoundException;
	public List<ElectronicProductOrder> showAllOrders();
	public List<ElectronicProductOrder> showAllOrders(int customerId);
	public ElectronicProductOrder viewProductOrder(int ProductOrderId) throws ElectronicProductOrderNotFoundException;
	}
