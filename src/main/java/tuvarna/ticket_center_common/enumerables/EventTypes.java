package tuvarna.ticket_center_common.enumerables;

public enum EventTypes {

    CONCERT("Concert"),
    THEATER("Theater"),
    SPORTS("Sports"),
    FESTIVAL("Festival"),
    WEBINAR("Webinar"),
    EDUCATION("Education"),
    PRESENTATION("Presentation"),
    OTHER("Other");

    private String name;

    EventTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public static EventTypes fromString(String text) {
        for (EventTypes b : EventTypes.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

}
