package demo.example.blogspring.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data


public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private String interseted;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Author(String name, LocalDate dateOfBirth, String interseted, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.interseted = interseted;
        this.gender = gender;
    }

    public Author(){

    }
}
