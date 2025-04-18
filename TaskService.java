package Tasks;


import java.util.ArrayList;



public class TaskService {

	//start with an ArrayList of contacts

	public ArrayList<Task> taskList = new ArrayList<>();

// Display List of Contacts to check for errors
	public void displayTaskList() {

		for (Task element : taskList) {
			System.out.println("Task Id: " + element.gettaskID());
			System.out.println("Task Name: " + element.gettaskName());
			System.out.println("Task Descritption: " + element.gettaskDescription());
		}
	}

	// By using the Task Constructor we can create a new task.
	public void addTask(String taskName, String taskDescription) {

		Task task = new Task(taskName, taskDescription);
		taskList.add(task);
	}
	public Task addTask(String taskID) {
		Task task = new Task(null,null);
		for (Task element : taskList) {
			if (element.gettaskID().contentEquals(taskID)) {
				task = element;
			}
		}

		return task;

	}

	public Task getTask(String taskID) {
		Task task = new Task(null,null);
		for (Task element : taskList) {
			if (element.gettaskID().contentEquals(taskID)) {
				task = element;
			}
		}
		return task;
	}

	//Delete Task
	public void deleteTask(String taskID) {
		for (int count = 0; count < taskList.size(); count++) {
			if (taskList.get(count).gettaskID().equals(taskID)) {
				taskList.remove(count);
				break;
			}
			if (count == taskList.size() - 1) {
				System.out.println("Task ID: " + taskID + " Invalid ID.");
			}
		}
	}

	// Update the task name.
		public void updateTaskName(String updatedString, String taskID) {
			for (int count = 0; count < taskList.size(); count++) {
				if (taskList.get(count).gettaskID().equals(taskID)) {
					taskList.get(count).SettaskName(updatedString);
					break;
				}
				if (count == taskList.size() - 1) {
					System.out.println("Task ID: " + taskID + " Invalid ID.");
				}
			}
		}

	// Update description.
		public void updateTaskDescription(String updatedString, String taskID) {
			for (int count = 0; count < taskList.size(); count++) {
				if (taskList.get(count).gettaskID().equals(taskID)) {
					taskList.get(count).SettaskDescription(updatedString);
					break;
				}
				if (count == taskList.size() - 1) {
					System.out.println("Task ID: " + taskID + " not found.");
				}
			}
		}
}
