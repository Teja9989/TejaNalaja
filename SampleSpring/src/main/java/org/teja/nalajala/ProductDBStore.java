package org.teja.nalajala;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

public class ProductDBStore {
	

	@Component
	class ProdutDBStore {

		private List<Product> product = new ArrayList<Product>();
		public void ProductDBStore()
		{
			product.add(new Product(1,"chicken",20,1));
			product.add(new Product(2,"mutton",22,2));
			product.add(new Product(3,"shrimp",20,55));
			product.add(new Product(4,"fish",204,1));
			product.add(new Product(5,"lamb",2,1));
		}
	public Product  productDBStore() {
		for(Product product1: product) {
			System.out.println(product1);
			return product1;

		}
		return null;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
}
}

