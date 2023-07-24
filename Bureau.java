class Bureau{
 
 static String brand ;
 static int age;
 int price;
 String color;
 
 Bureau()
 {
  System.out.println("Invoking const in Bureau");
 }
 
 Bureau(String brand, int age)
 { 
  System.out.println("Invoking const in Bureau");
  this.brand=brand;
  this.age=age;
  }
  
 Bureau(String brand, int age, int price, String color)
 {
  System.out.println("Invoking const in Bureau");
  this.brand=brand;
  this.age=age;
  this.price=price;
  this.color=color;
  }
  
  static void printstatic()
  {
   System.out.println("Invoking main in Bureau");
   System.out.println(brand);
   System.out.println(age);
  }
void printInstance()
  {
   System.out.println("Invoking main in Bureau");
   System.out.println(price);
   System.out.println(color);
  }
public static void main(String[] args)
 {
  Bureau bureau = new Bureau("abc", 500, 50000, "pink");
  Bureau.printstatic();
  bureau.printInstance();
  
  Bureau bureau1 = new Bureau("xyz", 100, 500, "Blue");
  Bureau.printstatic();
  bureau1.printInstance();
  }

 }