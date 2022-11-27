package adapter.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.LinkedList;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private LocalDate lastActiveTime;
}
