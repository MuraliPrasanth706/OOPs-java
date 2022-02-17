class Outer{
  int a;
  public static void show(){ //method
    System.out.println("morning");
  }
  static class Inner{ //Outer -> inner class
    int b;
    public  void display(){
      System.out.println("Night");
    }
  }
}
class Main {
  public static void main(String[] args) {
    Outer obj =new Outer();
    obj.show();
    // Outer.Inner obj2 =obj.new Inner(); //non Static
    
    Outer.Inner obj2 =new Outer.Inner(); // Static
    obj2.display();
  }
}
