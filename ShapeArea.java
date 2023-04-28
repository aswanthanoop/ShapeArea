package shapearea;

import java.util.Scanner; //global scanner


public class ShapeArea {     
    public static void main(String[] args) {
       int menuOption;
       double area;

   menuOption = showMenu();
   area = processShapeOption(menuOption); 
   displayArea(area, menuOption);


}//end main

public static void displayArea(double area, int menuOption) {
   switch (menuOption) {
       case 1: System.out.printf("The area of the circle is: %.3f\n ", area);
          break; 
       case 2: System.out.printf("The area of the rectangle is: ", area);
           break;
       case 3: System.out.printf("The area of the triangle is: ", area);
           break;
   }//end switch



   }//end displayArea
   public static int showMenu() {
       Scanner scan = new Scanner(System.in);
       int menuOption;

       System.out.println("1. circle");
       System.out.println("2. rectangle");
       System.out.println("3. triangle");
       System.out.print("enter choice:");
       menuOption = scan.nextInt();

       return menuOption;
   }//end showMenu

   public static double processShapeOption(int menuOption) {
       double area = 0;
       switch(menuOption){
           case 1: double radius = getDimension("radius");
                   area = calculateCircleArea(radius);

              break;

           case 2: double length = getDimension("length"),
                      width = getDimension("width");
                   area = areaOfRectangle(length, width);
           break;

           case 3: double base = getDimension("base"),
                      height = getDimension("height");
                   area = areaOfTriangle(base, height);

           break;


   }//end switch

   return area;     
}//end processShapeOption

public static double getDimension(String dimensionType) {
   double dimension;
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter the " + dimensionType + ":");
   dimension = scan.nextDouble();

   return dimension;

   }//end getDimension

   public static double calculateCircleArea(double radius) {
   double area;

   area = Math.PI * Math.pow(radius, 2);

   return area;
}//end calculateCircleArea

public static double areaOfRectangle(double width, double length) {
   double area;

   area = width * length;

   return area;
}//end areaOfRectangle

public static double areaOfTriangle(double height, double base) {
   double area;

   area = .5 * base * height;

   return area;
}

}//end class