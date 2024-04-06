package dev.karthikbunny2000.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //-> getter setter and  totring method
@AllArgsConstructor //->basically annotation for constructor that takes all the private classes as arguments
@NoArgsConstructor //->doesnt take any constructor whats so ever
public class Movie {

    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference //-> This will cause the database to store only ids of rviews and reviews will be given seperate collection
    private List<Review> reviewIds;

}
