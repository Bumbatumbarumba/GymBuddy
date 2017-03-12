package gym.buddy.main;

/* Created by Bartosz Kosakowski
 * 15/02/17
 * Used to create instances of Exercise; each exercise has information on the name of the
 * exercise, the category (eg, chest, legs, etc), the amount of weight lifted, and the number
 * of reps and sets.
 * NOTE: maybe make the exerciseName and category immutable (ie, no setters) since that seems 
 * fairly pointless; why would you want to change the name and/or category?
 */
public class Exercise {
	private String exerciseName;
	private String category;
	private double weights;
	private int reps, sets;

	//constructor for MyExercise
	public Exercise(String exerciseName, String category, double weights, int reps, int sets){
		this.exerciseName = exerciseName;
		this.category = category;
		this.weights = weights;
		this.reps = reps;
		this.sets = sets;
	}//end of MyExercise constructor

	//start of getters
	public String getName(){
		return this.exerciseName;
	}
	public String getCategory(){
		return this.category;
	}
	public double getWeights(){
		return this.weights;
	}
	public int getReps(){
		return this.reps;
	}
	public int getSets(){
		return this.sets;
	}//end of getters

	//start of setters
	//setName may or may not be necessary
	public void setName(String name){
		this.exerciseName = name;
	}
	//setCategory may or may not be necessary
	public void setCategory(String category){
		this.category = category;
	}
	public void setWeights(double weights){
		this.weights = weights;
	}
	public void setReps(int reps){
		this.reps = reps;
	}
	public void setSets(int sets){
		this.sets = sets;
	}//end of setters
}//end of MyExercise class
