package hse.startsev.cinema.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.security.Timestamp;

@Entity
@Table(name = "showtimes")
@Getter
public class ShowTime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    private Timestamp start_time;
}
