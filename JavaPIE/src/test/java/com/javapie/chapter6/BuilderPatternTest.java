package com.javapie.chapter6;

import org.junit.Test;

public class BuilderPatternTest {

	@Test
	public void testBuilderPattern() {
		final Pet.Builder builder = new Pet.Builder();
		final Pet pet = builder
				.withAnimal(Animal.CAT)
				.withPetName("Squidge")
				.withOwnerName("Simon Smith")
				.withAddress("123 High Street")
				.withTelephone("077777770")
				.withEmailAddress("simon@email.com")
				.build();
	}

}
