package com.library.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.library.modelpkg.Book;

@Repository
public interface LibraryRepository extends CrudRepository<Book, Long> {

}
