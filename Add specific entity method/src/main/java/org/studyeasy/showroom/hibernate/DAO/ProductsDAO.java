package org.studyeasy.showroom.hibernate.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.showroom.hibernate.entities.BrandEntity;
import org.studyeasy.showroom.hibernate.entities.ProductEntity;

public class ProductsDAO {
	
	SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(ProductEntity.class)
            .addAnnotatedClass(BrandEntity.class)
            .buildSessionFactory();

	@SuppressWarnings("unchecked")
	public List<ProductEntity> getProductsByBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		List<ProductEntity> list = new ArrayList<ProductEntity>();
		
		String sql  = "from products";
		productList = session.createQuery(sql).getResultList();
		for (ProductEntity e : productList) {
			if (e.getBrandEntity().getBrandId() == brandId) {
				list.add(e);
			}
		}
		return list;
	}

	public List<ProductEntity> getProductsByBrandAndCategory(int brandId, String category) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		String HQL  = "from products where brandId = '"+brandId+"' and category='"+category+"'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}



}
