package tuvarna.ticket_center_common.models;

import java.io.Serializable;
import java.util.List;

public class EventsWrapper implements Serializable {

    private List<EventModel> events;

    public EventsWrapper() {
    }

    public EventsWrapper(List<EventModel> events) {
        this.events = events;
    }

    public List<EventModel> getEvents() {
        return events;
    }

    public void setEvents(List<EventModel> events) {
        this.events = events;
    }
}
