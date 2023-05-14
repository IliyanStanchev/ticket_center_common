package tuvarna.ticket_center_common.models;

import java.io.Serializable;

public class AssignDistributorModel implements Serializable {

    private String distributorEmail;

    private Long eventId;

    public AssignDistributorModel() {
    }

    public AssignDistributorModel(String distributorEmail, Long eventId) {
        this.distributorEmail = distributorEmail;
        this.eventId = eventId;
    }

    public String getDistributorEmail() {
        return distributorEmail;
    }

    public void setDistributorEmail(String distributorEmail) {
        this.distributorEmail = distributorEmail;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
}
