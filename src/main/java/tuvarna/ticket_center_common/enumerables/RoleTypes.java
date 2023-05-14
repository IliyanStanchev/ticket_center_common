package tuvarna.ticket_center_common.enumerables;

public enum RoleTypes {

    ADMIN("Administrator")
    , ORGANIZER("Organizer")
    , DISTRIBUTOR("Distributor");

    private final String name;

    RoleTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public static RoleTypes fromString(String text) {
        for (RoleTypes b : RoleTypes.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}

