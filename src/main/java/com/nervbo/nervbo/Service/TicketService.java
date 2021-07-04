package com.nervbo.nervbo.Service;
import com.nervbo.nervbo.Class.Ticket;
import com.nervbo.nervbo.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;

    public Ticket setTickets(Ticket ticket)  {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> findAll(){
        return (List<Ticket>) ticketRepository.findAll();
    }

}
