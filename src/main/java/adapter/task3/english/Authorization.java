package adapter.task3.english;

import adapter.task3.ukrainian.Авторизація;
import adapter.task3.ukrainian.БазаДаних;

public class Authorization {
    public Авторизація authorization;

    public Authorization(Авторизація authorization){
        this.authorization = authorization;
    }

    public boolean authorize(БазаДаних database){
        return authorization.авторизуватися(database);
    }
}
