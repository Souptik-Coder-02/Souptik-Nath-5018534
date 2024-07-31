public class TaskManagementSystem {

    public static class Task {
        private String taskId;
        private String taskName;
        private String status;

        public Task(String taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
        }

        public String getTaskId() {
            return taskId;
        }

        public String getTaskName() {
            return taskName;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "Task{id='" + taskId + "', name='" + taskName + "', status='" + status + "'}";
        }
    }

    public static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public static class TaskLinkedList {
        private Node head;

        public TaskLinkedList() {
            head = null;
        }

        public void addTask(Task task) {
            Node newNode = new Node(task);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public Task searchTaskById(String taskId) {
            Node current = head;
            while (current != null) {
                if (current.task.getTaskId().equals(taskId)) {
                    return current.task;
                }
                current = current.next;
            }
            return null;
        }

        public void traverseTasks() {
            Node current = head;
            while (current != null) {
                System.out.println(current.task);
                current = current.next;
            }
        }

        public void deleteTaskById(String taskId) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            if (head.task.getTaskId().equals(taskId)) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            } else {
                System.out.println("Task not found.");
            }
        }
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task task1 = new Task("T001", "Design Database", "In Progress");
        Task task2 = new Task("T002", "Develop API", "Not Started");
        Task task3 = new Task("T003", "Test Application", "Completed");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for task with ID T002:");
        Task searchedTask = taskList.searchTaskById("T002");
        System.out.println(searchedTask != null ? searchedTask : "Task not found");

        System.out.println("\nDeleting task with ID T002:");
        taskList.deleteTaskById("T002");

        System.out.println("\nAll Tasks after deletion:");
        taskList.traverseTasks();
    }
}
