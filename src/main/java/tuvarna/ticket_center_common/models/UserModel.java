package tuvarna.ticket_center_common.models;
import tuvarna.ticket_center_common.enumerables.RoleTypes;
import tuvarna.ticket_center_common.enumerables.UserStatuses;

import java.io.Serializable;

public class UserModel implements Serializable {

    private String email;

    private String name;

    private RoleTypes role;

    private UserStatuses status;

    private float honorarium;

    private String phoneNumber;

    public UserModel() {
    }

    public float getHonorarium() {
        return honorarium;
    }

    public void setHonorarium(float honorarium) {
        this.honorarium = honorarium;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserStatuses getStatus() {
        return status;
    }

    public void setStatus(UserStatuses status) {
        this.status = status;
    }

    public RoleTypes getRole() {
        return role;
    }

    public void setRole(RoleTypes role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
