package MrK.conf.factory;

import MrK.domain.Subject;

/**
 * Created by User on 2015/05/17.
 */
public class SubjectFactory {
    public static Subject createSubject(String code, String name){
        Subject subject = new Subject.Builder(code).name(name).build();
        return subject;
    }
}
