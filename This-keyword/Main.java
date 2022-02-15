 class Calc{
   int num1,num2,result;
  public Calc(){ //not taking any parameter
    num1 =9;
    num2 =10;
  }
   public Calc(int num1 , int num2){  //Taking the parameter
     this.num1= num1;//this keyword is used to it is not a local var ,it is a instant var   
     this.num2 =num2; // current object
   }
 }

class Main {
  public static void main(String[] args) {
    Calc obj = new Calc(8,9);
    System.out.println(obj.num1);
    System.out.println(obj.num2);
    
    }
