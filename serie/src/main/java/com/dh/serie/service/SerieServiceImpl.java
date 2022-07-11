package com.dh.serie.service;

import com.dh.serie.dto.SerieDTO;
import com.dh.serie.entity.Serie;
import com.dh.serie.repository.SerieRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieServiceImpl implements SerieService {

    @Autowired
    private SerieRepository repository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${queue.serie.name}")
    private String serieQueue;

    @Override
    public SerieDTO save(SerieDTO serieDTO) {
        var savedSerie = new SerieDTO(repository.save(new Serie(serieDTO)));
        rabbitTemplate.convertAndSend(serieQueue, savedSerie);
        return savedSerie;
    }

    @Override
    public List<SerieDTO> findByGenre(String genre) {
        return repository.findAllByGenre(genre).stream()
                .map(SerieDTO::new)
                .collect(Collectors.toList());
    }
}
