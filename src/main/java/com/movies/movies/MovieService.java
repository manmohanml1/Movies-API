package com.movies.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired//it will let the framework know that we want it to instantiate the class for us
    private MovieRepository movieRepository;
    public List<Movie>  allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imbdId){
        return movieRepository.findMovieByImdbId(imbdId);
    }
}
