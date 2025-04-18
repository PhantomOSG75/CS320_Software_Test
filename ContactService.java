// Michael Wood 2025

package Main;

import java.util.Random;
import java.util.Vector;


public class ContactService{
	
	private Vector<Contact> contactList = new Vector<Contact>();
	private int contactCount = 0;
	
	public int getContactCount() {
		return contactCount;
	}
	
	public Vector<Contact> getcontactList() {
		return contactList;
	}
	
	public void addContact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		Contact newContact = new Contact(contactID, firstName, lastName, phoneNum, address);
		
		contactList.add(newContact);
		contactCount++;
	}
	
	public void addContact(Contact contact) {
		contactList.add(contact);
		contactCount++;
	}

	public void deleteContact(String contactID) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if(contactList.isEmpty()) {
			throw new IllegalArgumentException("No Contacts Found");
			}
		
		int indx = -1;
		for (Contact c : contactList) {
			if (c.getcontactID() == contactID) {
				indx = contactList.indexOf(c);
			}
		}
		
		if (indx == -1) {
			System.out.println("Contact Not Found");
			return;
		}
		
		else {
			contactList.remove(indx);
			contactCount--;
			System.out.println("Contact Removed From List.");
		}
	}
		
	private void deleteContact(Contact contact) {
			contactList.remove(contact);
			contactCount--;
	}
	
	public void updateContact(String contactID, String update, int selection) {
		if(contactID == null || contactID.length() > 10 || update == null || selection < 0) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if (contactList.isEmpty()) {
			throw new IllegalArgumentException(" Contacts Do Not Exist");
		}
		
		int indx = -1;
		for (Contact c : contactList) {
			if (c.getcontactID() == contactID) {
				indx = contactList.indexOf(c);
			}
		}
		
		if (indx == -1) {
			System.out.println("Contact Not Found");
			return;
		}
		
		Contact updateContact = contactList.get(indx);
		
		switch (selection) {
		
		case 1: {
			updateContact.setfirstName(update);;
			break;
		}
		
		case 2: {
			updateContact.setlastName(update);;
			break;
		}
		
		case 3: {
			updateContact.setphoneNumber(update);;
			break;
		}
		
		case 4: {
			updateContact.setaddress(update);;
			break;
		}
		
		default: {
			System.out.println(" Contact Not Updated, Requested Change Denied.");
			break;
		}
		}
		
		deleteContact(contactList.elementAt(indx));
		addContact(updateContact);
		}
		
		public void updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
			if (contactID == null || contactID.length() > 10) {
				throw new IllegalArgumentException("Invalid Id");
			}
			
			if(contactList.isEmpty()) {
				throw new IllegalArgumentException("No Contacts In List");
			}
			
			int indx = -1;
			for(Contact c : contactList) {
				if (c.getcontactID() == contactID) {
					indx = contactList.indexOf(c);
				}
			}
			
			if (indx == -1) {
				System.out.println("Contact Not Found");
				return;
			}
		
			Contact tempcontact = contactList.get(indx);
			tempcontact.setfirstName(firstName);;
			tempcontact.setlastName(lastName);;
			tempcontact.setphoneNumber(phoneNumber);
			tempcontact.setaddress(address);;
			
			contactList.remove(indx);
			contactList.add(tempcontact);
			}
		
		//Automatically generate Unique Contact ID
		public String uniqueIDCreation() {
		Random rand = new Random();
		int newcontactID = rand.nextInt(1000000000);
		String uniqueID = Integer.toString(newcontactID);
		
		for (Contact c : contactList) {
			while (c.getcontactID() == uniqueID) {
				newcontactID = rand.nextInt(1000000000);
				uniqueID = Integer.toString(newcontactID);
			}
		}
		
		System.out.println("ID Created: " + uniqueID);
		return uniqueID;
		}
}















