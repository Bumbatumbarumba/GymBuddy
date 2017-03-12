package gym.buddy.main;

//Thrown when an exercise is not found
public class ExerciseNotFoundError extends Throwable{
	private String kind;
	public ExerciseNotFoundError(String kind) {
		this.kind = kind;
	}
}//end of ExerciseNotFoundError
