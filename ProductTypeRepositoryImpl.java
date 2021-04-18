package com.cg.es.repository;

import java.util.List;
import com.cg.es.entities.ProductType;

public class ProductTypeRepositoryImpl implements ProductTypeRepository {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addProductType(ProductType ProductType) {
		try {
			sessionFactory.getCurrentSession().save(ProductType);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProductType(ProductType ProductType) {
		try {
			sessionFactory.getCurrentSession().update(ProductType);
			return true;
		}

		catch (Exception e) {
			return false;
		}

	}
	
	@Override
	public boolean removeProductType(int ProductType) {
		try {
			sessionFactory.getCurrentSession().remove(ProductType);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<ProductType> showAllProductTypes() {

		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from ProductType");
		List<ProductType> listProductType = query.list();
		return listProductType;
	}

	@Override
	public boolean getProductType(int prdTypeId) {

		Session session = SessionFactory.openSession();
		ProductType ProductType = session.get(ProductType.class, prdTypeId);
		return (Boolean) null;
	}

}
