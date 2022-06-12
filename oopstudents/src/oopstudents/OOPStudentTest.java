package oopstudents;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OOPStudentTest {

	@Test
	void test() {
		OOPStudent alice = new OOPStudent();
		assertEquals(null, alice.getTeammate());
		
		OOPStudent bob = new OOPStudent();
		assertEquals(null, bob.getTeammate());
		
		alice.startCollaboratingWith(bob);
		assertEquals(bob, alice.getTeammate());
		assertEquals(alice, bob.getTeammate());
		
		bob.stopCollaboration();
		assertEquals(null, bob.getTeammate());
		assertEquals(null, alice.getTeammate());
	}

}
