package dave.org.dave.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dave.org.dave.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}