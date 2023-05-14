package tuvarna.ticket_center_common.models;

import java.io.Serializable;
import java.util.List;

public class RatingsWrapper implements Serializable {

    private List<RatingModel> ratings;

    public RatingsWrapper() {
    }

    public RatingsWrapper(List<RatingModel> ratings) {
        this.ratings = ratings;
    }

    public List<RatingModel> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingModel> ratings) {
        this.ratings = ratings;
    }
}
