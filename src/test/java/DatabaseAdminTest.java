import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jeff", "JEF12345", 20000.00);

    }

    @Test
    public void canGetName(){
        assertEquals("Jeff", databaseAdmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JEF12345", databaseAdmin.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(500.00);
        assertEquals(20500.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canReceiveBonus(){
        assertEquals(200.00, databaseAdmin.payBonus(), 0.0);
    }


}
