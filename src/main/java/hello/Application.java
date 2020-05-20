package hello;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.Model.Poll;
import hello.Repository.basicRepository;

/* 
Spring boot webapp 
Data Transfer Model : REST
Created by: Sumukh Ballal
*/
@CrossOrigin
@SpringBootApplication
@RestController
public class Application {

	@Autowired // don't forget the setter
	private basicRepository repo;

	@CrossOrigin
	@RequestMapping("/api/access")
	public String home() throws Exception {
		Poll updateidObject = repo.findById(1L).orElseThrow(
			() -> new Exception());
		Long count=updateidObject.getCount();
		count++;
		updateidObject.setCount(count);
		repo.save(updateidObject);
		return "Working fine using Cors - Server Response Accessed this many times "+count;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
