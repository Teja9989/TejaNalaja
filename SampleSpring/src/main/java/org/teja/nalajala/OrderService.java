package org.teja.nalajala;
	import java.util.ArrayList;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	@Component
	public class OrderService {
		
		private List<Order>order =new ArrayList<>();
		
		@Autowired
		private ProductDBStore dbStore;
		public List<Order> getOrder() {
			return order;
		}
		public void processOrder(Order o) {

			if(o.getProductid()==dbStore.product&& o.getQuantity()<=dbStore.getClass()pro.getQuantity()) {
				System.out.println("orderis placed"+ o.getId());
				order.add(new Order(o.getId(), o.getQuantity(),o.getProductid()));
				
				dbStore.product().setQuantity(dbStore.product().getQuantity()-o.getQuantity());
			}
			else {
				System.out.println("there is no sufficient quantity of particular item"+dbStore.product().getId());
			}

		}
	}

	


