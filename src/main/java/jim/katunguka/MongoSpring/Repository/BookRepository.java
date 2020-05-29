package jim.katunguka.MongoSpring.Repository;

import jim.katunguka.MongoSpring.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {
}
