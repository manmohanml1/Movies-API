package com.movies.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //built in method is there for finding with object id
    //automatic queries that let us form that is directly from properties name to make our filter from imdbID
    Optional<Movie> findMovieByImdbId(String imdbId);
}
