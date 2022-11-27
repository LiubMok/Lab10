import singleton.task1.User;

public class Main {
    public static void main(String[] args) {
        User newUser = new User("2", "liubomyr.mokrutskyi@ucu.edu.ua", "Liubomyr");
        newUser.save();
    }
}