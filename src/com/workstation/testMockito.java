package com.workstation;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

public class testMockito {


	@Test
	public void test() {
		ObjectB objectB = new ObjectB();
		ObjectA objectA = mock(ObjectA.class);
		when(objectA.getPwString()).thenReturn("hello A");
		
		ReflectionTestUtils.setField(objectB, "objectA", objectA);
		
		ObjectA actucalA = objectB.getObjectA();
		assertEquals("hello A", actucalA.getPwString());
		assertEquals("hello world", objectB.getValue());
	}
	
	
	
}
