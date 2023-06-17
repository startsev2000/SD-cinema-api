package hse.startsev.cinema.repository;

import hse.startsev.cinema.model.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTimeRepository extends JpaRepository<ShowTime, Long> {
}