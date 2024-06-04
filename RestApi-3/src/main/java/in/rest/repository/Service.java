package in.rest.repository;

import in.rest.entity.Book;
import in.rest.entity.Person;

public interface Service 
{
     public Book saveticket(Person p);
     
     public Book getTicket(Integer id);
}
