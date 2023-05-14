package tuvarna.ticket_center_common.models;
import java.io.Serializable;

public class TicketModel implements Serializable {

    private Long id;

    private String note;

    private String purchased;

    public TicketModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPurchased() {
        return purchased;
    }

    public void setPurchased(String purchased) {
        this.purchased = purchased;
    }
}
