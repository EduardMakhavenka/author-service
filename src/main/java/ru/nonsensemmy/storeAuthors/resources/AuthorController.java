package ru.nonsensemmy.storeAuthors.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nonsensemmy.storeAuthors.domain.author.Author;
import ru.nonsensemmy.storeAuthors.services.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAll(){
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author getById(@PathVariable Long id){
        return authorService.findById(id);
    }

    @PostMapping("/all-by-ids")
    public List<Author> getAllByIds(@RequestBody List<Long> ids){
        return authorService.findAllByIds(ids);
    }

    @PostMapping
    public Author save(@RequestBody Author author){
        return authorService.save(author);
    }

    @PutMapping
    public Author update(@RequestBody Author author){
        return authorService.update(author);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        authorService.delete(id);
    }

}
