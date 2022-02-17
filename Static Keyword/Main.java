class Emp{
  int emp;
  int salary;
  static String ceo;
  static{
    ceo = "Murali";
  }
  public Emp(){
    emp=9;
    salary = 9000;
  
  }
  public void show(){
    System.out.println(emp+":"+salary+":"+ceo);
  }
}
class Main {
  public static void main(String[] args) {
    Emp Ram = new Emp();
    Emp Nav = new Emp();
    Ram.show();
    Nav.show();
  } 
}
