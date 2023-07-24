class Helmet{

 static String name;
 static String brand;
 String color;
 float price;

Helmet()
{
 super();
 System.out.println("Invoking const of Helmet");
}

Helmet(String name, String brand)
{
 System.out.println("Invoking String, String const of Helmet");
 this.name=name;
 this.brand=brand;
}

Helmet(String name, String brand, String color, float price)
{
 System.out.println("Invoking string, float const of Helmet");
 this.name=name;
 this.brand=brand;
 this.color=color;
 this.price=price;
}		 

static void printstatic()
{
 System.out.println("Invoking main in helmet");
System.out.println(name);
 System.out.println(brand);
}

void printInstance()
{
 System.out.println("Invoking main in helmet");
 System.out.println(color);
 System.out.println(price);
 }
 public static void main(String[] args)
 {
  System.out.println("Invoking main in HelmetRunner");
  
  Helmet helmet = new Helmet("Helmet" ,"Hero", "Yellow", 2200);
  Helmet.printstatic();
  helmet.printInstance();
  
  Helmet helmet1 = new Helmet("Helmet", "Honda", "pink", 1888);
  Helmet.printstatic();
  helmet1.printInstance();
  
 }

 }