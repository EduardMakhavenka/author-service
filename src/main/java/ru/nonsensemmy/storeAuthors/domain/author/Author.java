package ru.nonsensemmy.storeAuthors.domain.author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.nonsensemmy.storeAuthors.domain.authorInformation.AuthorInformation;

import javax.persistence.*;

@Data
@Entity
@Table(name = "authors")
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;
    private String lastName;
    private String surname;
    private String bornYear;
    private String diedYear;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "information_id", referencedColumnName = "id")
    private AuthorInformation information;

}
