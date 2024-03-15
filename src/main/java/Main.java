import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNum = (int) (Math.random() *1000 +1);
//        System.out.println(randomNum);
        int userNum = 0;
        int attempt = 0;
        System.out.print("Угадай целое число от 1 до 1000: ");

        while (userNum != randomNum) {
            attempt++;
            userNum = scanner.nextInt();
            if (userNum > 1000 || userNum < 0)
                System.out.print("Дурак? Число от 1 до 1000\nУгадай целое число от 1 до 1000: ");
            else {
                if (userNum < randomNum)
                    System.out.print("Введи число больше " + userNum + ": ");
                else if (userNum > randomNum)
                    System.out.print("Введи число меньше " + userNum + ": ");
                else {
                    System.out.println("Молодчина загаданное число " + randomNum);
                    System.out.println("Количество попыток: " + attempt);
                }
            }
        }
    }
}