package Tasks;


import java.util.concurrent.atomic.AtomicLong;


public class Task {

private final  String taskID;
private static AtomicLong idGenerator = new AtomicLong();
private String taskName;
private String taskDescription;

//constructor with IllegalArgumentExceptions
public Task(String taskName, String taskDescription, String taskID) {


	// the Id generator is static to prevent duplicates
	this.taskID = taskID = String.valueOf(idGenerator.getAndIncrement());


	if (taskID == null || taskID.length() > 10) {
		throw new IllegalArgumentException("Invalid ID");
	}
		if (taskName == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		}

		if (taskDescription == null || taskDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
}


		//Getters

		public Task(String taskName2, String taskDescription2) {
			this.taskID = String.valueOf(idGenerator.getAndIncrement());

}
		public String gettaskID() {
			return taskID;
		}

		public String gettaskName() {
			return taskName;
		}

		public String gettaskDescription() {
			return taskDescription;
		}

		//Setters with error checking

		public void SettaskName(String taskName) {
			if (taskName == null || taskName.length() >20) {
				throw new IllegalArgumentException("Invalid Name");
				}
			this.taskName = taskName;
		}

		public void SettaskDescription(String taskDescription) {
			if (taskDescription == null || taskDescription.length() > 50) {
				throw new IllegalArgumentException("Invalid Description");
			}
			this.taskDescription = taskDescription;

			}
		}









