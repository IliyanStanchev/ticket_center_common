package tuvarna.ticket_center_common.enumerables;

public enum UserStatuses {

    PENDING("Pending"),
    VERIFIED("Verified"),
    CONFIRMED("Confirmed"),
    BLOCKED("Blocked");

    private String status;

    UserStatuses(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return this.getStatus();
    }
}
