package mw_jk_project_01;

import java.util.Arrays;

public class Applicants extends User {
	// Attributes
		private String phone;
		private String address;
		private String city;
		private String state;
		private String zip;
		private Resume[] listOfResumes = new Resume[0];

		/**
		 * @param firstname
		 * @param lastname
		 * @param email
		 * @param password
		 * @param phone
		 * @param address
		 * @param city
		 * @param state
		 * @param zip
		 */
		public Applicants(String firstname, String lastname, String email,
				String password, String phone, String address, String city,
				String state, String zip) {
			super(firstname, lastname, email, password);
			this.phone = phone;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
		}
		public Applicants(Applicants object2){
			super(object2.getFirstname(), object2.getLastname(), object2.getEmail(), object2.getPassword());
			this.phone = object2.phone;
			this.address = object2.address;
			this.city = object2.city;
			this.state = object2.state;
			this.zip = object2.zip;
		}

		/**
		 * @return the phone
		 */
		public String getPhone() {
			return phone;
		}

		/**
		 * @param phone the phone to set
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}

		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}

		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}

		/**
		 * @return the zip
		 */
		public String getZip() {
			return zip;
		}

		/**
		 * @param zip the zip to set
		 */
		public void setZip(String zip) {
			this.zip = zip;
		}
		
		public int totalofResumes(){
			int total = 0;
			for (int i = 0; listOfResumes[i] != null ; i++){
					total++;
			}
			return total;
		}
		
		public void addResume(Resume resume){
			Resume[] temp = new Resume[listOfResumes.length+1];
			System.out.println(listOfResumes.length + 1);
			
			for (int i=0; i < listOfResumes.length; i++){
				temp[i] = listOfResumes[i];
				
				
			}
			temp[temp.length-1] = resume;
			listOfResumes = temp;
		
			
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return super.toString() 
					+ phone 
					+ address
					+ city  + state  + zip
					+ Arrays.toString(listOfResumes);
				//	 +listOfResumes[0].getName();
		}
		/**
		 * @return the listOfResumes
		 */
		public Resume[] getListOfResumes() {
			return listOfResumes;
		}
		
}
