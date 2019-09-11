package model;
import java.util.*;
import java.io.Serializable;

public class Manufacturer implements Serializable {
	
	private String mId;
	
	private String mLoc;
	private Date mEstYear;
	private String mName;
	private String mMail;
	private static final long serialVersionUID = 7551999649936522524L;
	
	// Constructor
	public Manufacturer(String mId, String mLoc, Date mEstYear, String mName, String mMail) {
		super();
		this.mId = mId;
		this.mLoc = mLoc;
		this.mEstYear = mEstYear;
		this.mName = mName;
		this.mMail = mMail;
	}
	
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmLoc() {
		return mLoc;
	}
	public void setmLoc(String mLoc) {
		this.mLoc = mLoc;
	}
	public Date getmEstYear() {
		return mEstYear;
	}
	public void setmEstYear(Date mEstYear) {
		this.mEstYear = mEstYear;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmMail() {
		return mMail;
	}
	public void setmMail(String mMail) {
		this.mMail = mMail;
	}

	

}
