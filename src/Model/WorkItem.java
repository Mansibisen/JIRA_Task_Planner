package Model;

import java.time.LocalDate;
import java.util.Date;

public class WorkItem
{


    private String title;
    private String description;
    private Status status;

    private User created_by;

    private User assigned_to;

    private LocalDate created_date;

    private LocalDate planned_start_Date;

    private LocalDate Planned_end_Date;

    public WorkItem(User created_by, String title , String description) {
        this.created_by = created_by;
        this.title = title;
        this.description = description;
        this.status = Status.OPEN;
        this.created_date = LocalDate.now();


    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public void setAssigned_to(User user){
        this.assigned_to = user;
    }
}