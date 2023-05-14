package tuvarna.ticket_center_common.models;

import java.io.Serializable;
import java.util.List;

public class UsersWrapper implements Serializable {

    private List<UserModel> users;

    public UsersWrapper() {
    }

    public UsersWrapper(List<UserModel> users) {
        this.users = users;
    }

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }
}
