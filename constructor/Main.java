 class Calc{
   int num1,num2,result;
  public Calc(){ //not taking any parameter
    num1 =9;
    num2 =10;
  }
   public Calc(int k){  //Taking the parameter
     num1= k;
     num2 =k;
   }
 }

class Main {
  public static void main(String[] args) {
    Calc obj = new Calc(8);
    System.out.println(obj.num1);
    }
}
