package jim.katunguka.MongoSpring.resource;

import jim.katunguka.MongoSpring.Repository.BookRepository;
import jim.katunguka.MongoSpring.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping("/")
    public String welcome(){
        return "Most welcome to my book store";
    }

    @PostMapping("/book")
    public String saveBook(@RequestBody Book book){
        repository.save(book);
        return "Added book with id : " + book.getId();
    }
    @GetMapping("/books")
    public List<Book> getBook(){
        return repository.findAll();

    }
    @GetMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable int id){
        repository.deleteById(id);
        return "book deleted with id : " + id;
    }


}
