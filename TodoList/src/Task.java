public class Task {
    private String description;
    private TaskStatus status;

    // Constructor: "initializing the object's state."
    public Task (String description) {
        this.description = description;
        this.status = TaskStatus.NEW;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    // Getters
    public String getDescription() {
        return description;
    }
    public TaskStatus getStatus() {
        return status;
    }
}