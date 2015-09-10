import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
  private static ArrayList<Human> humans;
  
  public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
    humans = new ArrayList<Human>(); // Initialize!!!
    int keepGoing; // used to exit main loop
   
    System.out.print("How many humans?\n  >>> ");
    int numHuman = sc.nextInt();
    
    // Don't hate! Instantiate! 
    for (int i = 0; i < numHuman; i++) {
      createHuman(sc); // Create human
      
      int numDogs = (int)(Math.random() * 4) + 1; // Random between 1-4
      
      System.out.println("\n" + humans.get(i).getName() + " has " + numDogs + 
    		             " dogs."); // Inform user how many dogs said human has
 
      createDogs(humans.get(i), numDogs, sc); // Create dogs for specific human
    }
    
    // Main program loop
	do {
	  for (int i = 0; i < humans.size(); i++)
	    humans.get(i).passTheTime();
	  
      iteration(sc); // Basic function of operation
      System.out.print("Continue playing? [0 to quit; any other number to" +
        " continue]\n  >>> " );
      keepGoing = sc.nextInt();
    } while(keepGoing != 0);
	
	System.out.println("Thank you!!! Good bye!!!");
    sc.close();
  }
  
  public static void createHuman(Scanner sc) {

	// Get name
    System.out.print("\nEnter human name\n  >>> ");
    String name = sc.next();
    
    // Get a random weight 
    double weight = (Math.random() * 200) + 50;
      
    // Random gender
    int testVal =  (int)(Math.random() * 10) + 1;
    char gender;
	if ( testVal >= 5) 
      gender = 'f';
    else
      gender = 'm';
      
    humans.add(new Human(name, weight, gender));
  }
  
  public static void createDogs(Human person, int numDogs, Scanner sc) {
     
	  for (int i = 0; i < numDogs; i++) {
        System.out.print("Enter dog name\n  >>> ");
        String name = sc.next();
        
        // Get a random weight 
        double weight = (Math.random() * 80) + 10;
        
        // Random gender
        int testVal =  (int)(Math.random() * 10) + 1;
        char gender;
  	    if ( testVal >= 6) 
          gender = 'f';
        else
          gender = 'm';
  	    
  	    // Create Dog
  	    Dog newDog = new Dog(name, weight, gender);
  	    
  	    // Dog's owner
        person.addDog(newDog);
      }
  }
  
  public static void iteration(Scanner sc) {
	// Call toString() for each human
    for (int i = 0; i < humans.size(); i++) 
      System.out.println(humans.get(i).toString() + "\n\n");
   
    // List each Human name
    for (int i = 0; i < humans.size(); i++) {
      System.out.println(i + ") " + humans.get(i).getName());
    }
    
    System.out.print("Select human to control [Enter number]\n  >>> ");
    int human = sc.nextInt(); // Human that will be controlled this iteration
    
    System.out.println("\n--------------------------------------------------");
    System.out.println("  What will " + humans.get(human).getName() + 
      " do with his/her dogs?");
    System.out.println("--------------------------------------------------");
    // Menu of valid decisions
    System.out.println("1) Walk");
    System.out.println("2) Feed");
    System.out.println("3) Bathe");
    System.out.println("4) Buy Food");
    System.out.println("5) Pass Time");
    System.out.println("6) Do Nothing");
    
    System.out.print("  >>> ");
    int choice = sc.nextInt();
    
    switch (choice) {
    case 1:
    	humans.get(human).walks();
    	break;
    case 2:
    	humans.get(human).feeds();
        break;
    case 3:
    	humans.get(human).bathes();
    	break;
    case 4:
    	humans.get(human).buyFood();
    	break;
    case 5:
    	humans.get(human).passTheTime();
    	break;
    case 6:
    	break;
    default:
      System.out.print("Please enter 1-5\n\n");		
    }
    
  	// Call toString() for each human
    for (int i = 0; i < humans.size(); i++) 
      System.out.println(humans.get(i).toString() + "\n\n");
  }
  
}
