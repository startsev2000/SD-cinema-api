package hse.startsev.cinema.controller;

import hse.startsev.cinema.model.Movie;
import hse.startsev.cinema.model.ShowTime;
import hse.startsev.cinema.model.Ticket;
import hse.startsev.cinema.repository.MovieRepository;
import hse.startsev.cinema.repository.ShowTimeRepository;
import hse.startsev.cinema.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ShowTimeRepository showtimeRepository;
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/showtimes")
    public List<ShowTime> getAllShowTimes() {
        return showtimeRepository.findAll();
    }

    @PostMapping("/tickets")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}

