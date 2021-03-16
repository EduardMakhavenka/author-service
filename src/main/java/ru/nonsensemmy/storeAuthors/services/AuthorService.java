package ru.nonsensemmy.storeAuthors.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nonsensemmy.storeAuthors.domain.author.Author;
import ru.nonsensemmy.storeAuthors.repository.AuthorRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public List<Author> findAll(){ return authorRepo.findAll(); }

    public Author findById(Long id){ return authorRepo.getOne(id); }

    public List<Author> findAllByIds(List<Long> ids){
        List<Author> authors = ids
          .stream()
          .map( id -> authorRepo.getOne(id))
          .collect(Collectors.toList());
        return authors;
    }

    public Author save(Author author){ return authorRepo.save(author); }

    public Author update(Author author){ return authorRepo.save(author); }

    public void delete(Long id){ authorRepo.findById(id); }
}
