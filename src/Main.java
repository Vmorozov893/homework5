//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1\n");

        for(int i = 1; i <= 10; i++){
                System.out.println(i);
        }

        System.out.println("\nЗадание 2\n");

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("\nЗадание 3\n");

        for (int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }

        System.out.println("\nЗадание 4\n");

        for(int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        System.out.println("\nЗадание 5\n");

        for(int i = 1904; i <= 2096; i += 4){
            if(i % 100 != 0 || i % 400 == 0){
                System.out.println(i + " год является високосным.");
            }
        }

        System.out.println("\nЗадание 6\n");

        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }

        System.out.println("\nЗадание 7\n");

        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }

        System.out.println("\nЗадание 8\n");

        int sum = 0;
        for (int i = 1; i<=12; i++){
            sum += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
        }

        System.out.println("\nЗадание 9\n");

        sum = 0;
        for (int i = 1; i<=12; i++){
            sum += 29000;
            sum += sum / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
        }

        System.out.println("\nЗадание 10\n");

        for(int i = 1; i <= 10; i++){
            System.out.println("2*" + i + "=" + i*2);
        }

    }

}
