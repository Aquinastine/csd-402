

public class Fan {

  final int STOPPED = 0;
  final int SLOW = 1;
  final int MEDIUM = 2;
  final int HIGH = 3;
  private int speed;
  private boolean on;
  private double radius;
  private String color;
  private String [] speedArray = {"Stopped", "Slow", "Medium", "High"};

  //constructor with no parameters
  public Fan(){
    this(0, true, 6,"white");
  }
  
  //constructor with parameters
  public Fan(int speed, boolean on, double radius, String color){
    this.speed = speed;
    this.on = on;
    this.radius = radius;
    this.color = color;
  }

  //Get speedDescription
  public String getSpeedDescription(){
    return speedArray[speed];
  }

  //Get speed
  public int getSpeed(){
    return speed;
  }

  //Set speed
  public void setSpeed(int speed){
    this.speed = speed;
  }

  //Get on
  public boolean getOn(){
    return this.on;
  }

  //Set on
  public void setOn(boolean on){
    this.on = on;
  }
  
  //Get radius
  public double getRadius(){
    return this.radius;
  }

  //Set radius
  public void setRadius(double radius){
    this.radius = radius;
  }
  
  //Get color
  public String getColor(){
    return this.color;
  }

  //Set color
  public void setColor(String color) {
    this.color = color;
  }

  //get the fan's state
  public String toString(){
    StringBuilder lineBuilder = new StringBuilder();

    lineBuilder.append("The " + this.radius + " inch wide " + 
    this.color + " fan is set to a speed of " + speedArray[speed] + ". \n" +
    "The power switch is ");
    if (this.on){
      lineBuilder.append("on.");
    }else{
      lineBuilder.append("off.");
    }
    return lineBuilder.toString();
  }

  public static void main(String[] args){
    Fan fan1 = new Fan();
    Fan fan2 = new Fan(1, false, 3.5, "black");

    System.out.println(fan1.toString());
    System.out.println(fan2.toString() + "\n");

    StringBuilder speedTest = new StringBuilder();
    speedTest.append("Original speed is " + fan1.getSpeedDescription() + "\n");
    fan1.setSpeed(2);
    speedTest.append("New speed is " + fan1.getSpeedDescription() + "\n");
    System.out.println(speedTest.toString());

    StringBuilder onTest = new StringBuilder();
    onTest.append("On is " + fan1.getOn() + "\n");
    fan1.setOn(false);
    onTest.append("New On is " + fan1.getOn() + "\n");
    System.out.println(onTest.toString());

    StringBuilder radiusTest = new StringBuilder();
    radiusTest.append("Radius is " + fan1.getRadius() + "\n");
    fan1.setRadius(1.25);    
    radiusTest.append("New radius is " + fan1.getRadius() + "\n");
    System.out.println(radiusTest.toString());

    StringBuilder colorTest = new StringBuilder();
    colorTest.append("Color is " + fan1.getColor() + "\n");
    fan1.setColor("polka-dot");
   colorTest.append("New color is " + fan1.getColor() + "\n");
    System.out.println(colorTest.toString());

  }
}
