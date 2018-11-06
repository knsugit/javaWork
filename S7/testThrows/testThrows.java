import java.util.Scanner;
class IllegalInputException extends Exception {
    private int grade;
    IllegalInputException() {
        System.out.println("Grade can not be a negative number.");
    }
} 
class gradeInfo {
    private int grade;
    void setGrade(int grade) throws IllegalInputException {
        if(grade < 0)
            throw new IllegalInputException();
        else
            this.grade = grade;
    }
    int getGrade() {
        return this.grade;
    }
}

public class testThrows {
    public static void main(String[] args) {
        System.out.println("Input the grade:");
        Scanner input = new Scanner(System.in);
        gradeInfo g = new gradeInfo();
        int grade = input.nextInt();
        try {
            g.setGrade(grade);
        }
        catch(IllegalInputException e) {
            
        }
        finally {
            System.out.println("The grade is: " + g.getGrade());
        }
        
    }
}