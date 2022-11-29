package singleton.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private String id;
    private String email;
    private String name;

    public void save() {
        Connection connection = Connection.getConnection();
//        String query = "insert into user (email, name) values (" + email +", 'Yaroslav')";
        String query = String.format("insert into user (email, name) values ('%s', '%s');", email, name);
//        String query = "insert into user (email, name) values ('2', 'liubik04@gmail.com',  'Yaroslav')";
        connection.executeQuery(query);
    }
}
