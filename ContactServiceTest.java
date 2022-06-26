import static org.junit.Assert.*;
import org.junit.Test;

/*This Junit Class will help us in testing ContactService class and its methods*/
public class ContactServiceTest {

   /* testing the add method to work fine, when details provided should work */
   @Test
   public void testMethodAddPass() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("c1", "Tatenda", "Chiremba", "333 Pamu st");
       Contact c2 = new Contact("c2", "Tino", "Chiremba", "222 Gamu st");
       Contact c3 = new Contact("c3", "Chido", "Chiremba", "111 Ramu st");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c2));
       assertEquals(true, cs.add(c3));
   }

   /* testing the add method to work fine,when details provided should not work */
   @Test
   public void testMethodAddFail() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("c1", "Tatenda", "Chiremba", "333 Pamu st");
       Contact c2 = new Contact("c2", "Tino", "Chiremba", "222 Gamu st");
       Contact c3 = new Contact("c3", "Chido", "Chiremba", "111 Ramu st");
       assertEquals(true, cs.add(c1));
       assertEquals(false, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
   }

   /* test the delete method */
   @Test
   public void testMethodDeletePass() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("c1", "Tatenda", "Chiremba", "333 Pamu st");
       Contact c2 = new Contact("c2", "Tino", "Chiremba", "222 Gamu st");
       Contact c3 = new Contact("c3", "Chido", "Chiremba", "111 Ramu st");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c2));
       assertEquals(true, cs.add(c3));

       assertEquals(true, cs.remove("c3"));
       assertEquals(true, cs.remove("c2"));
   }

   /* test the delete method */
   @Test
   public void testMethodDeleteFail() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("c1", "Tatenda", "Chiremba", "333 Pamu st");
       Contact c2 = new Contact("c2", "Tino", "Chiremba", "222 Gamu st");
       Contact c3 = new Contact("c3", "Chido", "Chiremba", "111 Ramu st");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));

       assertEquals(false, cs.remove("c4"));
       assertEquals(true, cs.remove("c2"));
   }

   /* test the update method */
   @Test
   public void testUpdatePass() {
       ContactService cs = new ContactService();
       Contact c1 = new Contact("c1", "Tatenda", "Chiremba", "333 Pamu st");
       Contact c2 = new Contact("c2", "Tino", "Chiremba", "222 Gamu st");
       Contact c3 = new Contact("c3", "Chido", "Chiremba", "111 Ramu st");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));

       assertEquals(true, cs.update("c3", "Busta", "Rhymes", ""));
       assertEquals(true, cs.update("c2", "Suga", "Daddy", "444 Tamu st"));
   }


}
