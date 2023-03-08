import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        int number;
        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();
            if (number >= 0) {
                numbers.add(number);
            }
        } while (number >= 0);
        if (numbers.size() != 0) {
            printReveredList(numbers);
            sumAndPrint(numbers);
            printTheLowestNumber(numbers);
            printTheHighestNumber(numbers);
        }
    }

    private void printReveredList(List<Integer> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            int index = list.size() - 1 - counter;
            if (index != 0) {
                System.out.print(list.get(index) + ", ");
                counter++;
            } else {
                System.out.print(list.get(index));
            }
        }
    }

    private void sumAndPrint(List<Integer> list) {
        int sum = 0;
        StringBuilder equation = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int index = list.size() - 1;
            sum += list.get(i);
            if (i != index) {
                equation.append(list.get(i)).append(" + ");
            } else {
                equation.append(list.get(i)).append(" = ");
            }
        }
        System.out.println("\n" + equation + sum);
    }

    private void printTheLowestNumber(List<Integer> list) {
        int theLowestNumber = list.get(0);
        for (Integer integer : list) {
            if (integer < theLowestNumber) {
                theLowestNumber = integer;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + theLowestNumber);
    }

    private void printTheHighestNumber(List<Integer> list) {
        int theHighestNumber = list.get(0);
        for (Integer integer : list) {
            if (integer > theHighestNumber) {
                theHighestNumber = integer;
            }
        }
        System.out.println("Największa liczba w liście to " + theHighestNumber);
    }
}
