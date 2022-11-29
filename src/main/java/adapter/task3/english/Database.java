package adapter.task3.english;

import adapter.task3.ukrainian.БазаДаних;

public class Database extends БазаДаних {

    public БазаДаних database;

    public Database(БазаДаних database){
        this.database = database;
    }
    public String retrieveUserData(){
        return отриматиДаніКористувача();
    }
    public String retrieveStatic(){
        return отриматиСтатистичніДані();
    }
}
