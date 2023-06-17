package hse.startsev.cinema.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "tickets")
@Getter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "showtime_id", nullable = false)
    private ShowTime showtime;

    private Integer quantity;
}
