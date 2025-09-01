package MyLib;

public class Task {
    private int taskNo;
    private String taskName;
    private dueDate taskDueDate;
    private String taskDesc;
    private String isCompleted;

    public Task(int taskNo, String taskName, dueDate taskDueDate, String taskDesc, String isCompleted) {
        this.taskNo = taskNo;
        this.taskName = taskName;
        this.taskDueDate = taskDueDate;
        this.taskDesc = taskDesc;
        this.isCompleted = isCompleted;
    }

    public int getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(int taskNo) {
        this.taskNo = taskNo;
    }
    
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public dueDate getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(dueDate taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }
}
