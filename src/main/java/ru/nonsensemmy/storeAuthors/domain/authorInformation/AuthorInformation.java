package ru.nonsensemmy.storeAuthors.domain.authorInformation;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "authorInformation")
@NoArgsConstructor
public class AuthorInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String nationality;

    @ElementCollection(targetClass = Long.class)
    private List<Long> listBooksAuthor;

    private String birthdayDate;
    private String description;

    private String photo;

    @ElementCollection(targetClass = String.class)
    private List<String> gallery;

}
