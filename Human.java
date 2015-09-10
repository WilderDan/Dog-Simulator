import java.util.ArrayList;

public class Human extends Mammal {
  private double money;
  private double dogFood;
  private ArrayList<Dog> dogs;
  
  public Human(String name, double weight, char gender) {
	super(name, weight, gender);
	
	// 50 units of money and dog food are assigned to each new human...
	money = 50;    
	dogFood = 50;
	
	dogs = new ArrayList<Dog>();
  }
  
  public void addDog(Dog companion) {
    dogs.add(companion); // (Wo)man's best friend!
  }
  
  public String getName() {
    return name;
  }
  
  public void walks() {
	// Increase dog's fun, but makes dog more hungry and dirty
    for (int i = 0; i < dogs.size(); i++) {
      dogs.get(i).setFun(dogs.get(i).getFun() + 5);
      dogs.get(i).setHunger(dogs.get(i).getHunger() + 3);
	  dogs.get(i).setCleanliness(dogs.get(i).getCleanliness() - 2);
    }
  }
  
  public void feeds() {
	// Use dog food to lower dogs' hunger
    for (int i = 0; i < dogs.size(); i++) {
	  dogFood--;
	  dogs.get(i).setHunger(dogs.get(i).getHunger() - 4);
	  dogs.get(i).setCleanliness(dogs.get(i).getCleanliness() - 7);
	}
  }
  
  public void bathes() {
	// Cleaner dog, but dog isn't having fun
    for (int i = 0; i < dogs.size(); i++) {
      dogs.get(i).setCleanliness(100);
      dogs.get(i).setFun(dogs.get(i).getFun() - 5);
    }
  }

public void buyFood() {
  money -= 10;
  dogFood += 30;
}

public void passTheTime() {
  // Make money, dog has less fun, dog more hungry
  
  money += 50;
  
  for (int i = 0; i < dogs.size(); i++) {
    dogs.get(i).setFun(dogs.get(i).getFun() - 8);
	dogs.get(i).setHunger(dogs.get(i).getHunger() +6);
  }
}
  
  @Override
  public String toString() {
	String dogsString = ""; // store toString() return for each dog 
	
	for (int i = 0; i < dogs.size(); i++) 
		dogsString += dogs.get(i).toString() + " ";
	
    return super.toString() + " money: " + money + " dog food: " + dogFood +
      " dogs: " + dogsString;
  }
  
}
