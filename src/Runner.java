public class Runner {
     public static void main(String[] args) {
         Car myCar = new Car(2001, "Honda", "Civic");
         System.out.println(myCar.toString());
         System.out.println(myCar.drive(4));

         Rect myrect = new Rect(3,4);
         System.out.println(myrect.getArea());
         System.out.println(myrect.getDiagonal());
         System.out.println(myrect.isSquare());

     }
}
