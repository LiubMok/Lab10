package singleton.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private String id;
    private String email;
    private String name;

    public void save() {
        Connection connection = Connection.getConnection();
        String query = "insert into user (email, name) values (" + email +", 'Yaroslav')";
        connection.executeQuery(query);
    }
}
