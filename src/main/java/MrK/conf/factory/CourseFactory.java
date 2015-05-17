package MrK.conf.factory;


import MrK.domain.course;
import MrK.domain.Subject;

import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/05/17.
 */
public class CourseFactory {
    public static course createCourse(int offering, Map<String,String> values, List<Subject> subjects){
        course course = new course.Builder(values.get("code")).name(values.get("name")).offering(offering).subjects(subjects).build();
        return course;
    }
}
