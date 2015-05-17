package MrK.domain;

import MrK.conf.factory.CourseFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/05/17.
 */
public class CourseTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreateCourse() throws Exception {
        List<Subject> lecturers = new ArrayList<Subject>();
        Map<String,String> values = new HashMap<String,String>();

        values.put("code", "NDP2015");
        values.put("name", "National Diploma");

        course Course = CourseFactory.createCourse(25, values, lecturers);
        Assert.assertEquals(course.getCode(), "NDP2017");

    }
}