// 7 Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons

import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
    
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
      
        for (int i = 0; i < number; i++) {
            double weight, height;
            
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive, please re-enter.");
                }
            } while (weight <= 0);
            do {
                System.out.print("Enter height (meters) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive, please re-enter.");
                }
            } while (height <= 0);
            
 
            personData[i][0] = weight;
            personData[i][1] = height;
            
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            
          
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        
        System.out.println("\nPerson\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        
        sc.close();
    }
}