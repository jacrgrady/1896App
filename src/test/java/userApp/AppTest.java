package userApp;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.PipedOutputStream;
import java.util.*;

public class AppTest {
    private App appUnderTest = new App();

    // TEST USER PROFILE SETUP
//    @Test
//    public void appInstantiatesDefaultUser() {
//       // assertThat(appUnderTest.getCurrUser(), is(notNullValue()));
//        //assertThat(appUnderTest.getCurrUser().getName(), is("User1"));
//    }
//    // TEST USER FUNCTIONALITIES
//    @Test
//    public void testSwitchUser() {
//        App appUnderTest = new App();
//        User user1 = appUnderTest.getCurrUser();
//        User user2 = new User("User2");
//        appUnderTest.switchUser(user2);
//        assertThat(appUnderTest.getCurrUser().getName(), is("User2"));
//    }
//    @Test
//    public void shouldUpdateName() {
//        App appUnderTest = new App();
//        User user1 = appUnderTest.getCurrUser();
//        user1.setName("John Doe");
//        assertThat(appUnderTest.getCurrUser().getName(), is("John Doe"));
//    }

}