package userApp;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.PipedOutputStream;
import java.util.*;

public class AppTest {
    // TEST APP GREETING
    @Test
    public void testAppHasAGreeting() {
        App appUnderTest = new App();
        assertThat(appUnderTest.getGreeting(), is("Welcome"));
    }
    // TEST USER PROFILE SETUP
    @Test
    public void appInstantiatesDefaultUser() {
        App appUnderTest = new App();
        assertThat(appUnderTest.getCurrUser(), is(notNullValue()));
        assertThat(appUnderTest.getCurrUser().getName(), is("User1"));
    }
    // TEST USER FUNCTIONALITIES
    @Test
    public void testSwitchUser() {
        App appUnderTest = new App();
        User user1 = appUnderTest.getCurrUser();
        User user2 = new User("User2");
        appUnderTest.switchUser(user2);
        assertThat(appUnderTest.getCurrUser().getName(), is("User2"));
    }
    @Test
    public void shouldUpdateName() {
        App appUnderTest = new App();
        User user1 = appUnderTest.getCurrUser();
        user1.setName("John Doe");
        assertThat(appUnderTest.getCurrUser().getName(), is("John Doe"));
    }
    @Test
    public void shouldUpdateAge() {
        App appUnderTest = new App();
        User user1 = appUnderTest.getCurrUser();
        user1.setAge(78);
        assertThat(appUnderTest.getCurrUser().getAge(), is(78));
    }
    @Test
    public void shouldUpdateHeight() {
        App appUnderTest = new App();
        User user1 = appUnderTest.getCurrUser();
        user1.setHeight(70);
        assertThat(appUnderTest.getCurrUser().getHeight(), is(70));
    }
    @Test
    public void shouldUpdateWeight() {
        App appUnderTest = new App();
        User user1 = appUnderTest.getCurrUser();
        user1.setWeight(170);
        assertThat(appUnderTest.getCurrUser().getWeight(), is(170));
    }
    @Test
    public void shouldUpdateSex() {
        App appUnderTest = new App();
        User user1 = appUnderTest.getCurrUser();
        user1.setSex(1);
        assertThat(appUnderTest.getCurrUser().getSex(), is("male"));
    }

}