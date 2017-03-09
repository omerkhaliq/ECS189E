import api.IAdmin;
import api.IInstructor;
import api.IStudent;
import api.core.impl.Admin;
import api.core.impl.Instructor;
import api.core.impl.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vincent on 23/2/2017.
 */
public class TestInstructor {

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
    public void testIClass() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.student.registerForClass("omer","Test",2017);
        this.instructor.addHomework("Instructor","Test",2017,"QUEST", "Big project, study hard");
        assertTrue(this.instructor.homeworkExists("Test",2017,"QUEST"));
    }

    @Test
    public void testIClass2() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.student.registerForClass("omer","Test",2017);
        this.instructor.addHomework("Instructor","Test",2017,"QUEST", "Big project, study hard");
        this.instructor.assignGrade("Instructor","Test",2017,"QUEST", "omer", 100);
        int Pgrade = 100;
        assertFalse(this.instructor.getGrade("Test",2017,"QUEST","omer") == 100);
    }

    @Test
    public void testIClass3() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.student.registerForClass("omer","Test",2017);
        this.instructor.addHomework("Instructor2","Test",2017,"QUEST", "Big project, study hard");
        assertFalse(this.instructor.homeworkExists("Test",2017,"QUEST"));
    }

    @Test
    public void testIClass4() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.student.registerForClass("omer","Test",2017);
        this.instructor.addHomework("Instructor","Test",2017,"QUEST", "Big project, study hard");
        this.student.submitHomework("omer","QUEST","this is answer","Test",2017);
        this.instructor.assignGrade("Instructor","Test",2017,"QUEST", "omer", 100);
        int Pgrade = 100;
        assertTrue(this.instructor.getGrade("Test",2017,"QUEST","omer") == 100);
    }

    @Test
    public void testIClass5() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.student.registerForClass("omer","Test",2017);
        this.instructor.addHomework("Instructor","Test",2017,"QUEST", "Big project, study hard");
        this.student.submitHomework("omer","QUEST","this is answer","Test",2017);
        this.instructor.assignGrade("Instructor2","Test",2017,"QUEST", "omer", 100);
        int Pgrade = 100;
        assertFalse(this.instructor.getGrade("Test",2017,"QUEST","omer") == 100);
    }






}

