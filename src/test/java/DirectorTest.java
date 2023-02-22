import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Harry", "HAR12345", 35000.00, "HR", 100000.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Harry", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("HAR12345", director.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.00);
        assertEquals(40000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canReceiveBonus(){
        assertEquals(700.00, director.payBonus(), 0.0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000.00, director.getBudget(), 0.0);
    }


}
