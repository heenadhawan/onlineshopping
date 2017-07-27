package net.kzn.shoppingbackend.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart{
	/**
	 * 
	 */
	
	/*
	 * private fields
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy = "cart" , cascade=CascadeType.ALL , fetch = FetchType.EAGER)
	private List<CartItem> cartItems;

	
	private double grandTotal;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
			
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public User getUser() {
		return user;
	}

	public void setCustomer(User user) {
		this.user = user;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	

		 
}