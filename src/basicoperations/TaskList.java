package basicoperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> listOfTasks;

    public TaskList() {
        this.listOfTasks = new ArrayList<>();
    }

    public void addTask(String description) {
        listOfTasks.add(new Task(description));

    }

    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task t : listOfTasks) {
            if (t.getDescription().equals(description)) {
                tasksToRemove.add(t);
            }
        }
        listOfTasks.removeAll(tasksToRemove);
    }

    public int getTaskCount() {
        return listOfTasks.size();
    }

    public void getDescriptionOfTask() {
        System.out.println(listOfTasks);
      
    }

}
