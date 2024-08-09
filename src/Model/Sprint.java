package Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Sprint {

    private String name;
    private LocalDate start_date;
    private LocalDate end_date;

    private List<WorkItem>Items = new ArrayList<>();

    public Sprint(String name , LocalDate start_date, LocalDate end_date) {
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public void addItem(WorkItem item){
        this.Items.add(item);
    }
    public void removeItem(WorkItem item){
        this.Items.remove(item);
    }

}