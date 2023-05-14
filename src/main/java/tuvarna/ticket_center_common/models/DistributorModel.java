package tuvarna.ticket_center_common.models;

import java.io.Serializable;
import java.util.List;

public class DistributorModel implements Serializable {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private float honorarium;

    private String email;

    private List<RatingModel> ratings;

    public DistributorModel() {
    }

    public DistributorModel(String firstName, String lastName, String phoneNumber, float honorarium, String email, List<RatingModel> ratings) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.honorarium = honorarium;
        this.email = email;
        this.ratings = ratings;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public float getHonorarium() {
        return honorarium;
    }

    public String getEmail() {
        return email;
    }

    public List<RatingModel> getRatings() {
        return ratings;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setHonorarium(float honorarium) {
        this.honorarium = honorarium;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRatings(List<RatingModel> ratings) {
        this.ratings = ratings;
    }

    public float getRating() {
        float rating = 0;
        for (RatingModel ratingModel : ratings) {
            rating += ratingModel.getRating();
        }
        return rating / ratings.size();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
