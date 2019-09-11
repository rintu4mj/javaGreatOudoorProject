package model;

import java.io.Serializable;
import java.util.*;

public class Retailer extends User implements Serializable {
	

	private double Discount;
	private Address address;
	List<RetailerInventoryItem> retailerInventory = new ArrayList<RetailerInventoryItem>();
	
	public List<RetailerInventoryItem> getRetailerInventory() {
		return retailerInventory;
	}
	public void setRetailerInventory(List<RetailerInventoryItem> retailerInventory) {
		this.retailerInventory = retailerInventory;
	}
	private static final long serialVersionUID = 7551999649936522526L;
	
	// Constructor
	public Retailer(String userId, String userName, String userMail, long userNumber, boolean activeStatus,
			String password, int userCategory, double discount, Address address, List<RetailerInventoryItem> retailerInventory) {
		super(userId, userName, userMail, userNumber, activeStatus, password, userCategory);
		Discount = discount;
		this.address = address;
		this.retailerInventory = retailerInventory;
	}
	
	
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	

}
