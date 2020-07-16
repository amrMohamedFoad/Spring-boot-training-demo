package guru.springframework.spring5webapp.Repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

// spring data jpa repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
