import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        // Example step data recordings
        Shagomer.recordingStepData("Июль 1 5100");
        Shagomer.recordingStepData("Июль 15 4800");
        Shagomer.recordingStepData("Август 3 5200");

        // Get and display step data for a specific month
        Shagomer.getDateMonth("Июль");
 */
//--------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        Shagomer shagomer = new Shagomer();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Записать данные о шагах");
            System.out.println("2. Вывести данные за месяц");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите данные о шагах в формате 'Месяц День Шаги':");
                    scanner.nextLine();
                    String stepData = scanner.nextLine();
                    shagomer.recordingStepData(stepData);
                    break;

                case 2:
                    System.out.println("Введите название месяца (первая буква заглавная):");
                    scanner.nextLine();
                    String month = scanner.nextLine();
                    shagomer.getDateMonth(month);
                    break;

                default:
                    System.out.println("Некорректный выбор. Пожалуйста, выберите действие из списка.");
            }
        }
    }

}

