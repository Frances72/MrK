package MrK.repository;

import MrK.domain.course;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by User on 2015/05/17.
 */
public interface CourseRepository extends CrudRepository<course, Long> {
    public course findByCode(String code);
}
