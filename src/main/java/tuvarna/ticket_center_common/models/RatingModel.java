package tuvarna.ticket_center_common.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class RatingModel implements Serializable {

    public int rating;

    public String comment;

    public String distributorEmail;

    public String ratingUserEmail;

    public String ratingUserName;

    public String date;

    public RatingModel() {
    }

    public RatingModel(int rating, String comment, String distributorEmail, String ratingUserEmail, String ratingUserName, LocalDateTime date) {
        this.rating = rating;
        this.comment = comment;
        this.distributorEmail = distributorEmail;
        this.ratingUserEmail = ratingUserEmail;
        this.ratingUserName = ratingUserName;
        this.date = date.toString();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRatingUserName() {
        return ratingUserName;
    }

    public void setRatingUserName(String ratingUserName) {
        this.ratingUserName = ratingUserName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDistributorEmail() {
        return distributorEmail;
    }

    public void setDistributorEmail(String distributorEmail) {
        this.distributorEmail = distributorEmail;
    }

    public String getRatingUserEmail() {
        return ratingUserEmail;
    }

    public void setRatingUserEmail(String ratingUserEmail) {
        this.ratingUserEmail = ratingUserEmail;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingModel that = (RatingModel) o;
        return rating == that.rating && Objects.equals(comment, that.comment) && Objects.equals(distributorEmail, that.distributorEmail) && Objects.equals(ratingUserEmail, that.ratingUserEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, comment, distributorEmail, ratingUserEmail);
    }
}
