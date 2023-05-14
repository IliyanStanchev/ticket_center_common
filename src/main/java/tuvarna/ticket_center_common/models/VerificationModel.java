package tuvarna.ticket_center_common.models;

import java.io.Serializable;

public class VerificationModel implements Serializable {

    private String email;

    private String verificationCode;

    public VerificationModel() {
    }

    public VerificationModel(String email, String verificationCode) {
        this.email = email;
        this.verificationCode = verificationCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
