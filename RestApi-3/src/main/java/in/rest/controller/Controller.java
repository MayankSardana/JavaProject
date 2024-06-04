package in.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.rest.entity.Book;
import in.rest.entity.Person;
import in.rest.repository.ServiceRepository;

@RestController
public class Controller 
{
	@Autowired
    private ServiceRepository repo;
    
    @GetMapping("/start")
    public String start() {
    	return "getting started";
    }
    
    @GetMapping(value = "/book/{id}" , produces = {"application/json"})
    public Book getBook(@PathVariable("id") Integer id) {
    	 return ((ServiceRepository) repo).getTicket(id);
    }
    
    @PostMapping(value = "/save" , produces = {"application/json"} , consumes = {"application/json"})
    public ResponseEntity<Book> saveTicket(@RequestBody Person p)
    {
    	Book gt = ((ServiceRepository) repo).saveticket(p);
    	return new ResponseEntity<>(gt , HttpStatus.CREATED);
    }
}
