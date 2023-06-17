package hse.startsev.cinema.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "movies")
@Getter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String genre;
    private Integer duration;
    private Float rating;
}
