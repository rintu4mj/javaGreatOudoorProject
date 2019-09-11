package model;

import java.io.Serializable;

public class Product implements Serializable {
	
	private String pId;
	private String pName;
	private String pColor;
	private String pSpecs;
	private String pDimesions;
	private double price;
	private long qty;
	private long qtyOrder;
	private Manufacturer manufacturer;
	
	enum category
	{
		CAMPING, GOLF, MOUNTAINERING, OUTDOOR, PERSONAL
	}
	
	private static final long serialVersionUID = 7551999649936522525L;
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpColor() {
		return pColor;
	}
	public void setpColor(String pColor) {
		this.pColor = pColor;
	}
	public String getpSpecs() {
		return pSpecs;
	}
	public void setpSpecs(String pSpecs) {
		this.pSpecs = pSpecs;
	}
	public String getpDimesions() {
		return pDimesions;
	}
	public void setpDimesions(String pDimesions) {
		this.pDimesions = pDimesions;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	public long getQtyOrder() {
		return qtyOrder;
	}
	public void setQtyOrder(long qtyOrder) {
		this.qtyOrder = qtyOrder;
	}
	
	//Constructor
	
	public Product(String pId, String pName, String pColor, String pSpecs, String pDimesions, String mId, double price,
			long qty, long qtyOrder, Manufacturer manufacturer) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pColor = pColor;
		this.pSpecs = pSpecs;
		this.pDimesions = pDimesions;
		this.manufacturer = manufacturer;
		this.price = price;
		this.qty = qty;
		this.qtyOrder = qtyOrder;
	}

}
