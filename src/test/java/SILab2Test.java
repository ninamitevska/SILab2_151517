import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {

    @Test
    public void TestEveryBranch(){
        //RuntimeException ex;

        User user = new User("ninam","123qwA$", "nina.mitevska@students.finki.ukim.mk");

        assertFalse(SILab2.function(user,null));
        assertTrue(SILab2.function(new User("ninam","123qwA$df", "nina.mitevska@students.finki.ukim.mk"), null));
    }

    @Test
    public void MultipleCondition(){

        User user = new User("ninam","123qwA$", "nina.mitevska@students.finki.ukim.mk");

        assertFalse(SILab2.function(new User("ninam","blabla","nina.mitevska@students.finki.ukim.mk"),null));
        assertFalse(SILab2.function(new User("ninam","blabla1","nina.mitevska@students.finki.ukim.mk"),null));
        assertFalse(SILab2.function(new User("ninam","Blabla","nina.mitevska@students.finki.ukim.mk"),null));
        assertFalse(SILab2.function(new User("ninam","blabla!","nina.mitevska@students.finki.ukim.mk"),null));
        assertTrue(SILab2.function(new User("ninam","123qwA$df", "nina.mitevska@students.finki.ukim.mk"), null));

    }


}
