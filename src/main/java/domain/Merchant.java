package domain;

public class Merchant {
	
	private String pilllrTransactionId;
	
	private Name name;
	private Address address;
	
	
	public String getPilllrTransactionId() {
		return pilllrTransactionId;
	}
	public void setPilllrTransactionId(String pilllrTransactionId) {
		this.pilllrTransactionId = pilllrTransactionId;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
