
import Model.Board;
import Model.Sprint;
import Model.User;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {



    public static  void main(String[] args) {
        // create the users

        User user1 = new User(1 ,"mansi");
        User user2 = new User(2 ,"nehal");



        System.out.println("Hello world!");
        // create the sprint
        Board  board = new Board();

        board.createSprintAtTheStartOfWeek();

        // create the work items and assign them to sprint

        board.createWorkItem("Story","orcid-sail", "this is a big desccccc" , user1);

        board.createWorkItem("Bug","orcid-sail", "this is a big desccccc" , user1);

        board.createWorkItem("Feature","orcid-sail", "this is a big desccccc" , user1);

        board.createWorkItem("Bug","orcid-sail", "this is a big desccccc" , user2);

        board.createWorkItem("Story","orcid-sail", "this is a big desccccc" , user2);

        board.createWorkItem("Feature","orcid-sail", "this is a big desccccc" , user2);




    }
}