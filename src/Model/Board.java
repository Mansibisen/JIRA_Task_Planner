package Model;

import java.time.LocalDate;
import java.util.Objects;

public class Board {

    private Sprint sprint;

    public void createSprintAtTheStartOfWeek(){

        LocalDate oneWeekLater = LocalDate.now().plusDays(7);

        LocalDate today = LocalDate.now();
        this.sprint = new Sprint("sprint 1" ,today , oneWeekLater );

    }
    public void createWorkItem(String type , String title , String description , User user ){

        // create a work item either feature bug or story;
        WorkItem workItem;
        if(Objects.equals(type, "BUG")){
             workItem = new Bug(user , title , description);

        }else if(Objects.equals(type, "Feature")){
             workItem = new Feature(user , title , description);

        }else{
             workItem = new Story(user , title , description);

        }
        assignWorkItemToSprint(workItem);



    }
    public void AssignWorkItem(WorkItem workItem , User user){
        WorkItem newWorkItem = workItem;
        newWorkItem.setAssigned_to(user);
        updateWorkItemFromList(workItem , newWorkItem);

    }
    public void deleteWorkItem(WorkItem workItem){
        this.sprint.removeItem(workItem);

    }


    public void updateWorkItemStatus(WorkItem workItem , Status status){
        WorkItem newWorkItem = workItem;
        newWorkItem.setStatus(status);
        updateWorkItemFromList(workItem , newWorkItem);



    }

    private void assignWorkItemToSprint(WorkItem workItem){
            this.sprint.addItem(workItem);
    }
    private void updateWorkItemFromList(WorkItem workItem , WorkItem newWorkItem){

        this.sprint.removeItem(workItem);
        this.sprint.addItem(newWorkItem);

    }
}
