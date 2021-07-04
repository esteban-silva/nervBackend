package com.nervbo.nervbo.Controller;

import com.nervbo.nervbo.Class.Ticket;
import com.nervbo.nervbo.Service.TicketService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class TicketController {

    @Autowired
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @RequestMapping(value="/getTickets" , method= RequestMethod.GET)
    public ResponseEntity<List<Ticket>> getTickets() { // Para futuro uso ---> @PathVariable("id") Long id donde @GetMapping("/{id}"
        List<Ticket> getTickets = ticketService.findAll();
        return new ResponseEntity<>(getTickets, HttpStatus.OK);
    }

    @RequestMapping(value="/setTicket",method= RequestMethod.POST)
    public ResponseEntity<Ticket> setTicket(@RequestBody Ticket ticket) throws NotFoundException {
        Ticket newTicket = ticketService.setTickets(ticket);
        return new ResponseEntity<>(newTicket, HttpStatus.CREATED);
    }

//    @RequestMapping(value="/json" , method= RequestMethod.GET)
//    public ResponseEntity<Object> sayHello() throws JSONException {
//        //Get data from service layer into entityList.
//
//        List<JSONObject> tickets = new ArrayList<JSONObject>();
//        List<Ticket> ticketsList= ticketService.findAll();
//        for (Ticket t : ticketsList) {
//            JSONObject ticket = new JSONObject();
//            ticket.put("aa", "bb");
//            tickets.add(ticket);
//        }
//        return new ResponseEntity<Object>(tickets, HttpStatus.OK);
//    }

}
