package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MoviesRepository moviesRepository;
    public List<Movie> allMovies() {
        return moviesRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdb) {
        return moviesRepository.findMovieByimdbId(imdb);
    }
}
