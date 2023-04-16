package holidays;

import holidays.calculator.Vacation;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of rest days: ");
            int days = scanner.nextInt();
            System.out.print("Enter the number of people: ");
            int people = scanner.nextInt();
            int answer = Vacation.calculate(days, people);
            System.out.println("Total vacation days " + answer);
        }
        catch (InputMismatchException e) {
            throw new NoSuchElementException("Failure. Integer is required.", e);
        }
    }
}
