import java.util.Scanner;
class IllegalInputException extends Exception {
    private int grade;
    IllegalInputException(int grade) {
        this.grade = -1 * grade;
    }

    int getGrade() {
        return grade;
    }
} 

public class testThrow {
    public static void main(String[] args) {
        System.out.println("Input the grade:");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        try {
            if(grade >= 0) {
                System.out.println("Grade is " + grade);
            }
            else {
                throw new IllegalInputException(grade);
            }
        }
        catch(IllegalInputException e) {
            System.out.println("Grade can not be a negative number.");
            System.out.println("You maybe input this grade: " + e.getGrade());
        }
    }
}