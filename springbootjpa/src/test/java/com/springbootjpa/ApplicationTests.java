package com.springbootjpa;

import com.springbootjpa.domain.Movie;
import com.springbootjpa.service.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Autowired
	private MovieService movieService;

	@Test
	public void save() {
		Movie movie = new Movie();
		movie.setName("头文字D");
		movie.setPrice(50d);
		movie.setActionTime(new Date());

		movieService.save(movie);
	}

	@Test
    public void findAll(){
	    for (Movie movie:movieService.findAll()){
            System.out.println(movie.getName()+" "+movie.getPrice());
        }
    }

    @Test
    public void findById(){
	    Optional<Movie> movie = movieService.fingById(1);
        System.out.println(movie.get().getName()+" "+movie.get().getPrice());
    }

    @Test
    public void deleteById(){
	    movieService.deleteById(1);
    }

}
