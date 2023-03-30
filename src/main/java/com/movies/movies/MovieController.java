package com.movies.movies;
//Rest API controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController//this is the rest controller annotation
@RequestMapping("/api/v1/movies")//so using this any requests to the location at endpoints
// will be handaled by this annotaion

public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
        public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }
    @GetMapping("/{imdbId}")//You can form dynamic queries in a similar way using different properties
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){//pathvariable lets the framework know we are passing the
        // information as a path variable
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);

    }

}
