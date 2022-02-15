//method overloading 
/*class Calc{
  
  public void add(int num1){ 
    System.out.println(num1);
  }
   public void add(int num1 , int num2){ 
     System.out.println(num1+num2);
   }
 }

class Main {
  public static void main(String[] args) {
    Calc obj = new Calc();
    obj.add(3);
    obj.add(2,9);
    
    }
}*/ 

//constructor overloading
class Calc{
  
  public Calc(int num1){ 
    System.out.println(num1);
  }
   public Calc(int num1 , int num2){ 
     System.out.println(num1+num2);
   }
 }

class Main {
  public static void main(String[] args) {
    Calc obj = new Calc(8,9);
  
    
    }
}
