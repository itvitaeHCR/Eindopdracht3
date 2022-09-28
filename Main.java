/**
 * Eindopdracht 3
 * @author (
 *      name = "HCR"
 *      date = "sept19" )
 *
 *      make a Lucas number sequence generator.
 *      ask for a number and print that many numbers of the sequence.
 *
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner newNumber = new Scanner(System.in);
        System.out.print("Please provide a whole, positive number: ");
        int n = newNumber.nextInt();
        System.out.println(Lucas.LucasSeq(n));
    }
}
