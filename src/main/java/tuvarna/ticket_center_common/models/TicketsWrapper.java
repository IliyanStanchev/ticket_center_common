package tuvarna.ticket_center_common.models;

import java.io.Serializable;
import java.util.List;

public class TicketsWrapper implements Serializable {

    private List<TicketModel> tickets;

    public TicketsWrapper() {
    }

    public TicketsWrapper(List<TicketModel> tickets) {
        this.tickets = tickets;
    }

    public List<TicketModel> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketModel> tickets) {
        this.tickets = tickets;
    }
}
