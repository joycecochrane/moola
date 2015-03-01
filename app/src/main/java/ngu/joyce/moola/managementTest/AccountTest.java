package ngu.joyce.moola.managementTest;

import org.junit.Before;
import org.junit.Test;

import ngu.joyce.moola.management.Account;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Joyce on 2015-02-28.
 */
public class AccountTest {

    String name = "First";
    String description = "Last";
    Account a;

    @Before
    public void newTest() {
        a = new Account(name, description);
    }

    @Test
    public void testGetName() {
        assertEquals("First", a.getName());
        a.setName("Hi");
        assertEquals("Hi", a.getName());
    }
}
