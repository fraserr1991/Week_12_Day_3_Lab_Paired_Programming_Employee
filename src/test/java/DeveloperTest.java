import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;
    @Before
    public void before(){
        developer = new Developer("Dave", "DAV12345", 22000.00);

    }

    @Test
    public void canGetName(){
        assertEquals("Dave", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("DAV12345", developer.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(22000, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000.00);
        assertEquals(24000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canReceiveBonus(){
        assertEquals(220.00, developer.payBonus(), 0.0);
    }



}
