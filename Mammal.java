public abstract class Mammal { // Not intended to be instantiated as is
  protected String name; // Subclass can access directly
  private double weight;
  private char gender; // 'f' is female; 'm' is male or 'M' 
  
  public Mammal (String n, double w, char g) {
    name = n;
    weight = w;
    gender = g;
  }
  
  @Override 
  public String toString() {
    return super.toString() + " name: " + name + " weight: " + weight +
      " gender: " + gender;
  }
}
