import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в консольную игру \"Угадай число\"!\n");
        for (int i = 10; i <= 30; i += 10) playlevel1(i);
        System.out.println("Спасибо за игру!");
            //System.out.println(i);
            //int range = 100;
            //int number = (int) (Math.random() * i); // (int) изменяем значение float(По умолч.) на integer.

        scanner.close();
    }
    private static void playlevel1(int range){
        int number = (int) (Math.random() * range);
        while(true){
            System.out.println("Угадайте число от 0 до " + range);
            int number_input = scanner.nextInt();
            if(number_input == number){
                System.out.println("Поздравляем! ПОБЕДА!\nВы угадали число!");
                break;
            }
            else if(number_input > number){
                System.out.println("Загаданное число меньше!\nПопробуй ещё раз!\n");
            }
            else{
                System.out.println("Загаданное число больше!\nПопробуй ещё раз!\n");
            }
        }
    }
}