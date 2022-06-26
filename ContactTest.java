import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	public void testAdd() {
		Contact cs = new Contact("c1", "Tatenda", "Chiremba", "333 Pamu st");
		
		Contact c1 = new Contact ("c1", "Tatenda", "Chiremba", "333 Pamu st");
		
		Contact c2 = new Contact("c2", "Tino", "Chiremba", "222 Gamu st");

		Contact c3 = new Contact("c3", "Chido", "Chiremba", "111 Ramu st");
	}
		/* test the update method */
	@Test
		   public void testUpdateFail() {
		       ContactService cs = new ContactService();
		       Contact c1 = new Contact("c1", "Tatenda", "Chiremba", "333 Pamu st");
		       Contact c2 = new Contact("c2", "Tino", "Chiremba", "222 Gamu st");
		       Contact c3 = new Contact("c3", "Chido", "Chiremba", "111 Ramu st");
		 		   
	}
	
	@Test
	public void testDelete() {
		Contact cs = new Contact("c1", "Tatenda", "Chiremba", "333 Pamu st");
		
		Contact c1 = new Contact ("c1", "Tatenda", "Chiremba", "333 Pamu st");
		
		Contact c2 = new Contact("c2", "Tino", "Chiremba", "222 Gamu st");

		Contact c3 = new Contact("c3", "Chido", "Chiremba", "111 Ramu st");
}
}
