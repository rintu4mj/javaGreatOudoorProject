package model;
//stores address of retailers address
import java.io.Serializable;

public class Address implements Serializable {
	
	private String addressId;
	private String country;
	private String city;
	private String state;
	private int zip;
	private String buildingNo;
	private String retailerId;
	
	private static final long serialVersionUID = 7551999649936522523L;
	
	//Constructor
	public Address(String addressId, String country, String city, String state, int zip, String buildingNo,
			String retailerId) {
		super();
		this.addressId = addressId;
		this.country = country;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.buildingNo = buildingNo;
		this.retailerId = retailerId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}
	
	
	

}
