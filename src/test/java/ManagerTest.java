import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Paul", "PAU12345", 25000.00, "sales");
    }

    @Test
    public void canGetName(){
        assertEquals("Paul", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("PAU12345", manager.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(26000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canReceiveBonus(){
        assertEquals(250.00, manager.payBonus(), 0.0);
    }

    @Test
    public void canChangeName(){
        manager.changeName("Sarah");
        assertEquals("Sarah", manager.getName());
    }

    @Test
    public void cantChangeNameIfPassedEmptyString(){
        manager.changeName("");
        assertEquals("Paul", manager.getName());
    }

    @Test
    public void cantChangeNameIfPassedNull(){
        manager.changeName(null);
        assertEquals("Paul", manager.getName());
    }

    @Test
    public void cantRaiseSalary__Negative(){
        manager.raiseSalary(-1000.00);
        assertEquals(25000.00, manager.getSalary(), 0.0);
    }

}
