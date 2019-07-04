package io.javabrains.RatingService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, (int) (Math.random() * 5) + 1);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        UserRating userRating = new UserRating();
        userRating.setUserRatings(
         Arrays.asList(
                new  Rating("1234",  (int) (Math.random() * 5) + 1),
                new Rating("12",  (int) (Math.random() * 5) + 1),
                new Rating("14",  (int) (Math.random() * 5) + 1),
                new Rating("Terminator",  (int) (Math.random() * 5) + 1)));
        return userRating;
    }
}



