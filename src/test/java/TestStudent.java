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
        this.student.registerForClass("omer","Test",2017);
        this.student.registerForClass("farjad","Test",2017);
        this.student.registerForClass("waleed","Test",2017);
        this.student.registerForClass("imran","Test",2017);
        this.student.registerForClass("zeeruk","Test",2017);
        this.student.registerForClass("Haaris","Test",2017);
        this.student.registerForClass("dikshya","Test",2017);
        this.student.registerForClass("sanye","Test",2017);
        this.student.registerForClass("tav","Test",2017);
        this.student.registerForClass("sarah","Test",2017);
        this.student.registerForClass("RH","Test",2017);
        this.student.registerForClass("omer12","Test",2017);
        this.student.registerForClass("omer13","Test",2017);
        this.student.registerForClass("omer14","Test",2017);
        this.student.registerForClass("omer15","Test",2017);
        this.student.registerForClass("omer16","Test",2017);
        assertFalse(this.student.isRegisteredFor("omer16","Test",2017));
    }

    @Test
    public void testSClass2() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.student.registerForClass("omer","Test",2017);
        this.student.registerForClass("farjad","Test",2017);
        this.student.registerForClass("waleed","Test",2017);
        this.student.registerForClass("imran","Test",2017);
        this.student.registerForClass("zeeruk","Test",2017);
        this.student.registerForClass("Haaris","Test",2017);
        this.student.registerForClass("dikshya","Test",2017);
        this.student.registerForClass("sanye","Test",2017);
        this.student.registerForClass("tav","Test",2017);
        this.student.registerForClass("sarah","Test",2017);
        this.student.registerForClass("RH","Test",2017);
        this.student.registerForClass("omer12","Test",2017);
        this.student.registerForClass("omer13","Test",2017);
        this.student.registerForClass("omer14","Test",2017);
        this.student.registerForClass("omer15","Test",2017);
        this.student.registerForClass("omer16","Test",2017);
        assertTrue(this.student.isRegisteredFor("omer15","Test",2017));
    }

    @Test
    public void testSClass3() {
        this.admin.createClass("Test", 2016, "Instructor", 15);
        this.student.registerForClass("omer","Test",2016);
        this.student.dropClass("omer","Test", 2016);
        assertTrue(this.student.isRegisteredFor("omer","Test",2016));
    }

    @Test
    public void testSClass4() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.student.registerForClass("omer","Test",2017);
        this.student.dropClass("omer","Test", 2017);
        assertFalse(this.student.isRegisteredFor("omer","Test",2017));
    }

    @Test
    public void testSClass5() {
        this.admin.createClass("Test", 2017, "Instructor", 15);
        this.student.registerForClass("omer", "Test", 2017);
        this.instructor.addHomework("Instructor", "Test", 2017, "QUEST", "Big project, study hard");
        this.student.submitHomework("omer", "QUEST", "this is answer", "Test", 2017);
        assertTrue(this.student.hasSubmitted("omer","QUEST","Test",2017));
    }

    @Test
    public void testSClass6() {
        assertFalse(this.student.isRegisteredFor("jsjjsjsjsjs","Test",2017));
    }

    @Test
    public void testSClass7() {
        assertTrue(this.student.hasSubmitted("someguy","jjjjj","TTTTTT",2017));
    }



}

