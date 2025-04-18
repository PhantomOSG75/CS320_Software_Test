/*Michael Wood
 * School: SNHU
 * Course: 320-Software Test, Automation
 * Instructor: Tanisha Jacks
 * Date: 03/22/2025
 */


package Main;


public class Contact {
	//Declaring Attributes
	private String _contactID; //Max 10 Characters
	public String _firstName;     //Max 10 Characters
	public String _lastName;      //Max 10 Characters
	public String _phoneNumber;        // Must be 10 digits exactly
	public String _address;       //Max 10 Characters

	//None of the listed above can be NUll


	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		new String();
		
		
		//set parameters
		 if(contactID == null || contactID.length() > 10) {
			 throw new IllegalArgumentException("Invalid ID");
		 }
		 if(firstName == null || firstName.length() > 10 || lastName == null || lastName.length() > 10) {
			 throw new IllegalArgumentException("Up to 10 Characters Allowed");
		 }
		 if(phoneNumber == null || phoneNumber.length() > 10 || phoneNumber.length() < 10) {
			 throw new IllegalArgumentException("Invalid Number");
		 }
		 if(address == null || address.length() > 30) {
			 throw new IllegalArgumentException("Address not Found");
			 }
		 
		 _contactID = contactID;
		 _firstName = firstName;
		 _lastName = lastName;
		 _phoneNumber = phoneNumber;
		 _address = address;
	
	}
	public String getcontactID() {
		return _contactID;
	}
	
	public String getfirstName() {
		return _firstName;
	}
	
	public String getlastName() {
		return _lastName;
	}
	
	public String getphoneNumber() {
		return _phoneNumber;
	}
		
	public String getaddress() {
		return _address;
	}
	
		 public void setfirstName(String firstName) {
			 if(firstName == null || firstName.length() > 10) {
				 throw new IllegalArgumentException("Invalid First Name");
				 }
			 _firstName = firstName;
		 }
		 public void setlastName(String lastName) {
			 if(lastName == null || lastName.length() > 10) {
				 throw new IllegalArgumentException("Invalid Last Name");
			 }
			 _lastName = lastName;
		 }
		 public void setphoneNumber(String phoneNumber) {
			 if(phoneNumber == null || phoneNumber.length() > 10 || phoneNumber.length() < 10) {
				 throw new IllegalArgumentException("Invalid Number");
			 }
			 _phoneNumber = phoneNumber;
		 }
		 public void setaddress(String address) {
			 if(address == null || address.length() > 30) {
				 throw new IllegalArgumentException("Address Not Found");
				 }
			 _address = address;
		 }
	

}