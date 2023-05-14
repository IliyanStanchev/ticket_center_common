package tuvarna.ticket_center_common.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class TicketKindModel implements Serializable {

    private String name;

    private String description;

    private float price;

    private int limitPerBuyer;

    ArrayList<TicketModel> tickets;

    public TicketKindModel() {
        tickets = new ArrayList<>();
    }

    public TicketKindModel(String name, String description, float price, int limitPerBuyer) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.limitPerBuyer = limitPerBuyer;
        tickets = new ArrayList<>();
    }

    public ArrayList<TicketModel> getTickets() {
        return tickets;
    }

    public void addTicket(TicketModel ticket) {

        if( tickets.contains(ticket) )
            return;

        tickets.add(ticket);
    }

    public void removeTicket(TicketModel ticket) {
        tickets.remove(ticket);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getLimitPerBuyer() {
        return limitPerBuyer;
    }

    public void setLimitPerBuyer(int limitPerBuyer) {
        this.limitPerBuyer = limitPerBuyer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketKindModel that = (TicketKindModel) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setTickets(ArrayList<TicketModel> tickets) {
        this.tickets = tickets;
    }

    public int getRemainingTickets() {
        int remainingTickets = 0;
        for(TicketModel ticket : tickets) {
            if( ticket.getPurchased().equals("false") )
                remainingTickets++;
        }

        return remainingTickets;
    }

    public int getTotalTickets() {
        return tickets.size();
    }
}
