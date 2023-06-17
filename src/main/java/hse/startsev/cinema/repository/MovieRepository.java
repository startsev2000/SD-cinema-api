package hse.startsev.cinema.repository;

import hse.startsev.cinema.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}