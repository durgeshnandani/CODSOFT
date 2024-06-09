import java.util.*;

public class StudentGradeCalculator {
    public static void main(String args[]){
    System.out.println("HELLO STUDENT!");
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your marks in Science");
    float Science_marks=sc.nextFloat();
    System.out.println("Enter your  marks in mathematics");
    float Mathematics_marks=sc.nextFloat();
    System.out.println("Enter your marks in english");
    float English_marks=sc.nextFloat();
    System.out.println("Enter your marks in hindi");
    float Hindi_marks=sc.nextFloat();
    System.out.println("Enter your marks in SocialSScience");
    float SocialScience_marks=sc.nextFloat();
    float Total_marks=Science_marks+Mathematics_marks+English_marks+Hindi_marks+SocialScience_marks;
    System.out.println("The total marks obtained is: "+Total_marks);

    float avg_marks=(Total_marks)/5;
    System.out.println("The average percentage is: "+avg_marks);
    if(avg_marks<=100 && avg_marks>=90){
        System.out.println("Your gade is A+" );
    }
   else if(avg_marks<=89 && avg_marks>=80){
      System.out.println("Your grade is A");
   } 
   else if(avg_marks<=79 && avg_marks>=70){
    System.out.println("Your grade is B+");
   }
   else if(avg_marks<=69 && avg_marks>=60){
    System.out.println("Your grade is B");
   }
   else if(avg_marks<=59 && avg_marks>=50){
    System.out.println("Your grade is C+");

   }
   else if(avg_marks<=49 && avg_marks>=40){
    System.out.println("Your grade is C");
   }
   else{
    System.out.println("Your grade is D");
   }
}
}