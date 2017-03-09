import api.IAdmin;
import api.IInstructor;
import api.IStudent;
import api.core.impl.Admin;
import api.core.impl.Instructor;
import api.core.impl.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Vincent on 23/2/2017.
 */
public class TestStudent {

    private IAdmin admin;
    private IInstructor instructor;
    private IStudent student;


    @Before
    public void setup() {
        this.admin = new Admin();
        this.instructor = new Instructor();
        this.student = new Student();
    }

    @Test
    public void testSClass() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.instructor.addHomework("Instructor","Test",2017,"QUEST", "Big project, study hard");
        assertTrue(this.instructor.homeworkExists("Test",2017,"QUEST"));
    }


}

