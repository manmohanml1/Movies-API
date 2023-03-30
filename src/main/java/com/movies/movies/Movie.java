package com.movies.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")//used to get the collection of movies data from database
@Data//it comes from lombook method and takes care of strings, getters and setters
@AllArgsConstructor//this for creating constructor for all the arguments contained
@NoArgsConstructor//this another which takes no parameters
public class Movie
{
    @Id//this will let the framework that it should be treated as unique identifier
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference//this will cause database to store only the ids of reviews
    // and reviews will be in seperate collection. It is called manual reference relationships
    private List<Review> reviewIds;
}
