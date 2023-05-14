package tuvarna.ticket_center_common.models;

import java.io.Serializable;

public class PurchaseTicketModel implements Serializable {

    private Long ticketId;

    private String userMail;

    private float price;

    private String purchaserMail;

    private String purchaserName;

    private String purchaserPhoneNumber;

    public PurchaseTicketModel() {
    }
    public PurchaseTicketModel(Long ticketId, String userMail, float price, String purchaserMail, String purchaserName, String purchaserPhoneNumber) {
        this.ticketId = ticketId;
        this.userMail = userMail;
        this.price = price;
        this.purchaserMail = purchaserMail;
        this.purchaserName = purchaserName;
        this.purchaserPhoneNumber = purchaserPhoneNumber;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPurchaserMail() {
        return purchaserMail;
    }

    public void setPurchaserMail(String purchaserMail) {
        this.purchaserMail = purchaserMail;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public String getPurchaserPhoneNumber() {
        return purchaserPhoneNumber;
    }

    public void setPurchaserPhoneNumber(String purchaserPhoneNumber) {
        this.purchaserPhoneNumber = purchaserPhoneNumber;
    }
}
