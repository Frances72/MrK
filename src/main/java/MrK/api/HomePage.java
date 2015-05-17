package MrK.api;

import MrK.domain.course;
import MrK.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by User on 2015/05/17.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private CourseServices service;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String Index(){
        return "This is the Home Page";
    }

    @RequestMapping (value ="/course", method = RequestMethod.GET)
    public course getCourse(){
        course Course = new course.Builder("12345").name("National Diploma IT").offering(2015).build();
        return Course;
    }

    @RequestMapping(value="/Course", method = RequestMethod.GET)
    public List<course> getCourses(){
        return service.getCourses();
    }

}