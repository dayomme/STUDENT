package Model;

public class DTO {

	private String name ; // 이름 
	private int birthday ; // 생일
	private String address; //주소
	private String phonNumber; // 번호 
	
	
	public DTO(String name, int birthday, String address, String phonNumber) {
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.phonNumber = phonNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBirthday() {
		return birthday;
	}


	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhonNumber() {
		return phonNumber;
	}


	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}
	
}
