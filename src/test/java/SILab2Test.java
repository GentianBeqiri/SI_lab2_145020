import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private SILab2 siLab2 = new SILab2();
    private User user = null;
    private User user1 = new User(null, null, null);
    private User user2 = new User(null, null, "anything");
    private User user3 = new User("genti", null, "genti#live.com");
    private User user4 = new User("genti", null, "genti.live@com");
    private User user5 = new User("genti", null, "genti@live.com");
    public List<String> allUsers = new ArrayList<>();


    @Test

    public void everyPathTest() {
        //1, 2, 14
        assertTrue(siLab2.function(null, allUsers));//

        //1, 2, 3, 14
        assertTrue(siLab2.function(user2, allUsers));

        //1, 2, 3,  4,  5.1, 5.2,  /6,  8,  5.3, 5.2/ 10, 11,12, 14
        assertTrue(siLab2.function(user3, allUsers));

        //1, 2, 3,  4,  5.1, 5.2,  /6,  8,  5.3, 5.2/ 10, 11,12, 14
        assertTrue(siLab2.function(user4, allUsers));

        //1, 2, 3,  4,  5.1, 5.2,  /6, 7,  8, 9,  5.3, 5.2/ 10, 11,12,13 14
        assertFalse(siLab2.function(user5, allUsers));
    }

    @Test
    public void everyStatementTest(){
        assertFalse(()->siLab2.function(new User("null",null,null),allUsers));
        assertFalse(()->siLab2.function(new User("null",null,"null"),allUsers));
        assertFalse(()->siLab2.function(new User("genti",null,"genti#live.com"),allUsers));
        assertFalse(()->siLab2.function(new User("genti",null,"genti.live@com"),allUsers));
        assertTrue(()->siLab2.function(new User("genti",null,"genti@live.com" ),allUsers));
    }
}
