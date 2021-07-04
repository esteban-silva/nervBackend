package com.nervbo.nervbo.Class;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Ticket")

public class Ticket {

    public Ticket(){

    }

    @Id
    @Column(unique = true, nullable = false)
    private String ticketId;
    private String subject;
    private Date date;
    private String fromWho;
    private String status;
    private String body;


    public Ticket(String ticketId, String subject, Date date, String fromWho, String status, String body) {
        this.ticketId = ticketId;
        this.subject = subject;
        this.date = date;
        this.fromWho = fromWho;
        this.status = status;
        this.body = body;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setfromWho(String fromWho) {
        this.fromWho = fromWho;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    public String getfromWho() {
        return fromWho;
    }

    public String getStatus() {
        return status;
    }

    public String getBody() {
        return body;
    }
}
