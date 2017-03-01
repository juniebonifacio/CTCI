package com.javapie.chapter6;

import java.util.Date;

public class Pet {

	private Animal animal;
	private String petName;
	private String ownerName;
	private String address;
	private String telephone;
	private Date dateOfBirth;
	private String emailAddress;
	
	private Pet(
			Animal animal, 
			String petName, 
			String ownerName, 
			String address, 
			String telephone,
			Date dateOfBirth, 
			String emailAddress) {
		this.animal=animal;
		this.petName=petName;
		this.ownerName=ownerName;
		this.address=address;
		this.telephone=telephone;
		this.dateOfBirth=dateOfBirth;
		this.emailAddress=emailAddress;
	}
	
	public static class Builder {
		
		private Animal animal;
		private String petName;
		private String ownerName;
		private String address;
		private String telephone;
		private Date dateOfBirth;
		private String emailAddress;
		
		public Builder withAnimal(final Animal animal) {
			this.animal = animal;
			return this;
		}
		
		public Builder withPetName(final String petName) {
			this.petName = petName;
			return this;
		}
	
		public Builder withOwnerName(final String ownerName) {
			this.ownerName = ownerName;
			return this;
		}
		
		public Builder withAddress(final String address) {
			this.address = address;
			return this;
		}
		
		public Builder withTelephone(final String telephone) {
			this.telephone = telephone;
			return this;
		}
		
		public Builder withDateOfBirth(final Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}
		
		public Builder withEmailAddress(final String emailAddress) {
			this.emailAddress = emailAddress;
			return this;
		}
		
		public Pet build() {
			
			if(animal == null ||
				petName == null ||
				ownerName == null ||
				address == null ||
				telephone == null) {
					throw new IllegalStateException("Cannot create Pet");
			}
			
			return new Pet(
					animal,
					petName,
					ownerName,
					address,
					telephone,
					dateOfBirth,
					emailAddress);
		}
	}
	
}