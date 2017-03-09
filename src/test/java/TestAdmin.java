import api.IAdmin;
import api.core.impl.Admin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vincent on 23/2/2017.
 */
public class TestAdmin {

    private IAdmin admin;

    @Before
    public void setup() {
        this.admin = new Admin();
    }

    @Test
    public void testMakeClass() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        assertTrue(this.admin.classExists("Test", 2017));
    }

    @Test
    public void testMakeClass2() {
        this.admin.createClass("Test", 2016, "Instructor", 15);
        assertFalse(this.admin.classExists("Test", 2016));
    }

    @Test
    public void testMakeClass3() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.admin.changeCapacity("Test", 2017, 0);
        assertEquals(this.admin.getClassCapacity("Test",2017),15);
    }

    @Test
    public void testMakeClass4() {
        this.admin.createClass("Test", 2017, "Instructor", 0);
        assertFalse(this.admin.classExists("Test", 2017));
    }

    @Test
    public void testMakeClass5() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.admin.changeCapacity("Test", 2017, 16);
        assertEquals(16,this.admin.getClassCapacity("Test",2017));
    }

    @Test
    public void testMakeClass6() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.admin.changeCapacity("Test", 2017, 14);
        assertEquals(15, this.admin.getClassCapacity("Test",2017));
    }

    @Test
    public void testMakeClass7() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        assertEquals("Instructor", this.admin.getClassInstructor("Test",2017));
    }

    @Test
    public void testMakeClass8() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.admin.createClass("Test2", 2017, "Instructor", 15);
        this.admin.createClass("Test3", 2017, "Instructor", 15);
        assertFalse(this.admin.classExists("Test3", 2017));
    }
}
