package gym.buddy.main;

import java.util.ArrayList;

/* Day is an object that contains only one field: an ArrayList of Exercise
 * objects. Since one can perform any number of exercises in a day, this
 * list should be dynamic in size. Exercises can be added, removed, or accessed.
 */
public class Day {
	private ArrayList<Exercise> day = new ArrayList<Exercise>();

	// adds an exercise to the day
	public void addExercise(Exercise ex) {
		this.day.add(ex);
	}// end of addExercise

	// gets the exercise of a specified element
	public Exercise getExercise(String exerciseName) throws ExerciseNotFoundError {
		return this.day.get(this.day.indexOf(findExercise(exerciseName)));
	}// end of get exercise

	// removes an exercise of a specified name
	public void removeExercise(String exerciseName) {
		this.day.remove(findExercise(exerciseName));
	}// end of removeExercise

	// Private method used by removeExercise and getExercise
	// to find an exercise in this.day with a specified exerciseName
	// If the Exercise instance is not found, it returns null
	private Exercise findExercise(String exerciseName) {
		int index = 0;
		for (int i = 0; i < this.day.size(); i++) {
			if (this.day.get(i).getName().equals(exerciseName)) {
				return this.day.get(i);
			}
		}
		return null;
	}
}// end of Day class
