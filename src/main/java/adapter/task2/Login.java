package adapter.task2;

import java.time.LocalDate;

public class Login {
    public  Client login(String loginMethod){
        if (loginMethod.equals("twitter")){
            return new TwitterClientWrapper(new TwitterUser("liub@ucu.edu.ua", "Ukraine", LocalDate.of(2021,11,11)));
        } else if (loginMethod.equals("facebook")){
            return  new FacebookClientWrapper(new FacebookUser("liub@ucu.edu.ua", Country.Ukraine, LocalDate.of(2022, 1, 12)));
        }
        throw new IllegalArgumentException("No such loginMethod");
    }
}
