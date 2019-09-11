package model;

import java.io.Serializable;
import java.util.*;

public class Order implements Serializable {
	
	private String oID;
	private String rID;
	private Address address;
	private Date oInitTime;
	private Date oRecTime;
	private Date oDisTime;
	private String oRetId;
	private String oSalId;
	private String orderType;
	List<Product> prodList = new ArrayList<Product>();
	private boolean dispatched_status;
	private static final long serialVersionUID = 7551999649936822526L;
	public String getoID() {
		return oID;
	}
	public void setoID(String oID) {
		this.oID = oID;
	}
	public String getrID() {
		return rID;
	}
	public void setrID(String rID) {
		this.rID = rID;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getoInitTime() {
		return oInitTime;
	}
	public void setoInitTime(Date oInitTime) {
		this.oInitTime = oInitTime;
	}
	public Date getoRecTime() {
		return oRecTime;
	}
	public void setoRecTime(Date oRecTime) {
		this.oRecTime = oRecTime;
	}
	public Date getoDisTime() {
		return oDisTime;
	}
	public void setoDisTime(Date oDisTime) {
		this.oDisTime = oDisTime;
	}
	public String getoRetId() {
		return oRetId;
	}
	public void setoRetId(String oRetId) {
		this.oRetId = oRetId;
	}
	public String getoSalId() {
		return oSalId;
	}
	public void setoSalId(String oSalId) {
		this.oSalId = oSalId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public List<Product> getProdList() {
		return prodList;
	}
	public void setProdList(List<Product> prodList) {
		this.prodList = prodList;
	}
	public boolean isDispatched_status() {
		return dispatched_status;
	}
	public void setDispatched_status(boolean dispatched_status) {
		this.dispatched_status = dispatched_status;
	}
	//Constructor for Order
	public Order(String oID, String pID, String rID, Address address, Date oInitTime, Date oRecTime, Date oDisTime,
			String oRetId, String oSalId, String orderType, List<Product> prodList, boolean dispatched_status) {
		super();
		this.oID = oID;
		
		this.rID = rID;
		this.address = address;
		this.oInitTime = oInitTime;
		this.oRecTime = oRecTime;
		this.oDisTime = oDisTime;
		this.oRetId = oRetId;
		this.oSalId = oSalId;
		this.orderType = orderType;
		this.prodList = prodList;
		this.dispatched_status = dispatched_status;
	}
	
	
	
	
	

}
