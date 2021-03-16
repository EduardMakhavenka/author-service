package ru.nonsensemmy.storeAuthors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nonsensemmy.storeAuthors.domain.author.Author;


@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

    //@Query(value = "SELECT id, name, last_name, surname, born_year, died_year FROM authors WHERE id = ?1",
    //        nativeQuery = true)
    //Author findAuthorWithoutInformationFieldById(Long id);

}
