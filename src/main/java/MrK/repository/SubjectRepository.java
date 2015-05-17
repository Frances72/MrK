package MrK.repository;

import org.springframework.data.repository.CrudRepository;
import MrK.domain.Subject;

/**
 * Created by User on 2015/05/17.
 */
public interface SubjectRepository extends CrudRepository<Subject, Long> {
}
