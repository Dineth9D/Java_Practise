public class Main {
  int x;

  // Constructor with a parameter
  public Main(int x) { 
    this.x = x+1; // this.x = 6, x = 5
    System.out.println("This is from constructor = " + x);
  }

  // Call the constructor
  public static void main(String[] args) {
    Main myObj = new Main(5); // 
    System.out.println("Value of x = " + myObj.x);
  }
}