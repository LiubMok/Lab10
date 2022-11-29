package adapter.task3;

import adapter.task3.english.Authorization;
import adapter.task3.english.Database;
import adapter.task3.ukrainian.Авторизація;
import adapter.task3.ukrainian.БазаДаних;

public class Main {
    public static void main(String[] args) {
        БазаДаних db = new БазаДаних();
        Database database = new Database(db);
        Авторизація авторизація = new Авторизація();
        Authorization authorization = new Authorization(авторизація);
        if (authorization.authorize(database)) {
            ReportBuilder br = new ReportBuilder(database);
        }
    }
}

