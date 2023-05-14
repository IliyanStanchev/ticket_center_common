package tuvarna.ticket_center_common.models;

import java.io.Serializable;
import java.util.List;

public class DistributorsWrapper implements Serializable {

    private List<DistributorModel> distributors;

    public DistributorsWrapper() {
    }

    public DistributorsWrapper(List<DistributorModel> distributors) {
        this.distributors = distributors;
    }

    public List<DistributorModel> getDistributors() {
        return distributors;
    }

    public void setDistributors(List<DistributorModel> distributors) {
        this.distributors = distributors;
    }
}
