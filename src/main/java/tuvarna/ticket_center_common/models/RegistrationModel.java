package tuvarna.ticket_center_common.models;

import tuvarna.ticket_center_common.enumerables.RoleTypes;

import java.io.Serializable;

public class RegistrationModel implements Serializable {

    private RoleTypes roleType;
    private String email;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private float honorarium;

    public RegistrationModel() {
    }

    public RegistrationModel(RoleTypes roleType, String email, String firstName, String lastName, String phoneNumber, float honorarium) {
        this.roleType = roleType;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.honorarium = honorarium;
    }

    public RoleTypes getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleTypes roleType) {
        this.roleType = roleType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getHonorarium() {
        return honorarium;
    }

    public void setHonorarium(float honorarium) {
        this.honorarium = honorarium;
    }
}
