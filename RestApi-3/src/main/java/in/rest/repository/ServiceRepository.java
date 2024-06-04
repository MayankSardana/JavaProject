package in.rest.repository;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import in.rest.entity.Book;
import in.rest.entity.Person;

@Component
public class ServiceRepository implements Service 
{
	HashMap<Integer , Book> map = new HashMap<>();
	
	int count = 4567;
	@Override
	public Book saveticket(Person p) {
	    Book b = new Book();
	    b.setMoive(p.getMoive());
	    b.setName(p.getName());
	    b.setTicketid(count);
	    map.put(count, b);
	    count = count + 1111;
	    return b;
	}

	@Override
	public Book getTicket(Integer id) {
		if(map.containsKey(id)) {
			 return map.get(id);
		}
		return null;
	}
}
