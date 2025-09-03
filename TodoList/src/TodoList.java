enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}

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

public class TodoList {
    private Task[] tasks;  // — an array to store your tasks.
    private int capacity;  // — the max allowed tasks.
    private int size;  // — tracks how many tasks are currently added.

    // Constructor that creates the array with the specified capacity.
    public TodoList (int capacity) {
        this.capacity = capacity;
        this.tasks = new Task[capacity];
        this.size = 0;
    }

    public void addTask(String description) {
        if (size < capacity) {
            tasks[size] = new Task(description);
            size++;
        }
    }

    public void setStatus(int index, TaskStatus status);

    public void setDescription(int index, String newDescription);

    public void displayTasks();
}