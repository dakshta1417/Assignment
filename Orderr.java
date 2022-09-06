package com.spring.siobj.list;

import java.util.Iterator;
import java.util.List;

public class Orderr {

	int orderId;
	int orderQuantity;
	Double totalPrice;
	List<Item> item;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Orderr [orderId=" + orderId + ", orderQuantity=" + orderQuantity + ", totalPrice=" + totalPrice
				+ "]";
	}
	
	public void displayItem()
	{
		Iterator it=item.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
}
