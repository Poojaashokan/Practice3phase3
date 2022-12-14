package com.JUnit;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(parameterResolver.class)
class AuthenticationTest {

	@Test
	@Tag("my-tag")
	void test(Authentication at) {
		assertTrue(at.validate("Pooja123", "Pooja@20"));
	}

}
