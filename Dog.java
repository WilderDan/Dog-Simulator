public class Dog extends Mammal {
    // Attributes will range from 0-100
  private int hunger;
  private int fun;
  private int cleanliness;
  private int loyalty; // should always stay at 100 -> Dogs are loyal
  
  public Dog (String name, double weight, char gender) {
    super(name,weight,gender); // Call super class constructor
	  
	  // Some default values
    hunger = 50;
	fun = 50;
    cleanliness = 50;
	loyalty = 100;
  }
  
  // Provide setters:
  public void setHunger(int h) { 
	if (h >= 0 && h <= 100)
      hunger = h;
  }
  
  public void setFun(int f) {
  if (f >= 0 && f <= 100)
    fun = f;	 
  }
  
  public void setCleanliness(int c) {
  if (c >= 0 && c <= 100)
    cleanliness = c;
  }
  
  // Thou cannot change a dog's loyalty
  
  // Provide getters:
  public int getHunger() {
    return hunger;
  }
  
  public int getFun() {
    return fun;
  }
  
  public int getCleanliness() {
    return cleanliness;
  }
  
  public int getLoyalty() {
    return loyalty;
  }
  
  @Override
  public String toString() {
    return super.toString() + " hunger: " + hunger + " fun: " + fun + 
      " cleanliness: " + cleanliness + " loyalty: " + loyalty;
  }
}
