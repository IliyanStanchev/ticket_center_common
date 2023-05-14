package tuvarna.ticket_center_common.models;

import tuvarna.ticket_center_common.enumerables.EventTypes;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class EventModel implements Serializable {

    private Long id;

    private String name;

    private String description;

    private String startDate;

    private String endDate;

    private String startTime;

    private EventTypes eventType;

    private String location;

    private String organizerEmail;

    ArrayList<TicketKindModel> ticketKinds;

    public EventModel() {
        ticketKinds = new ArrayList<>();
        id = 0L;
        startDate = LocalDate.now().toString();
        endDate = LocalDate.now().toString();
        startTime = LocalTime.now().toString();
        eventType = EventTypes.CONCERT;
    }

    public String getOrganizerEmail() {
        return organizerEmail;
    }

    public void setOrganizerEmail(String organizerEmail) {
        this.organizerEmail = organizerEmail;
    }

    public void setTicketKinds(ArrayList<TicketKindModel> ticketKinds) {
        this.ticketKinds = ticketKinds;
    }

    public ArrayList<TicketKindModel> getTicketKinds() {
        return ticketKinds;
    }

    public void addTicketKind(TicketKindModel ticketKind) {

        if( !ticketKinds.contains(ticketKind) )
            ticketKinds.add(ticketKind);
        else {
            int index = ticketKinds.indexOf(ticketKind);
            ticketKinds.get(index).setDescription(ticketKind.getDescription());
            ticketKinds.get(index).setLimitPerBuyer(ticketKind.getLimitPerBuyer());
            ticketKinds.get(index).setPrice(ticketKind.getPrice());
        }
    }

    public void removeTicketKind(TicketKindModel ticketKind) {
        ticketKinds.remove(ticketKind);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public EventTypes getEventType() {
        return eventType;
    }

    public void setEventType(EventTypes eventType) {
        this.eventType = eventType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRemainingTickets() {
    	int remainingTickets = 0;
    	for(TicketKindModel ticketKind : ticketKinds) {
    		remainingTickets += ticketKind.getRemainingTickets();
    	}
    	return remainingTickets;
    }

    public int getTotalTickets(){
        int totalTickets = 0;
        for(TicketKindModel ticketKind : ticketKinds) {
            totalTickets += ticketKind.getTotalTickets();
        }
        return totalTickets;
    }
}
