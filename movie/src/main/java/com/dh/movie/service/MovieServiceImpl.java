package com.dh.movie.service;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;
import com.dh.movie.repository.MovieRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository repository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${queue.movie.name}")
    private String movieQueue;

    @Override
    public MovieDTO save(MovieDTO movieDTO) {
        var savedMovie = new MovieDTO(repository.save(new Movie(movieDTO)));
        rabbitTemplate.convertAndSend(movieQueue,savedMovie);
        return savedMovie;
    }

    @Override
    public List<MovieDTO> findByGenre(String genre) {
        return repository.findAllByGenre(genre).stream()
                .map(MovieDTO::new)
                .collect(Collectors.toList());
    }
}
