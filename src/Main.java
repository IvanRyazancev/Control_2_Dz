import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                ToyStore store = new ToyStore();
                store.addToy(001, "Мишка", 10, 20);
                store.addToy(002, "Машинка", 5, 10);
                store.addToy(003, "Кукла", 20, 70);


                System.out.println("Добро пожаловать в магазин игрушек!");
                Menu();
                Scanner console = new Scanner(System.in);
                System.out.println("Введите номер пункта меню: ");

                int digMenu = console.nextInt();

                while (true){
                    if (digMenu == 1) {
                        store.play();
                    } else if (digMenu == 2) {
                        System.out.printf(" Вы выиграли игрушку: " + store.toString());
                    } else if (digMenu == 3) {
                        store.setToyWeight(2,30);
                    } else if (digMenu == 4) {
                        try {
                            store.getPrizeToy();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } else if (digMenu == 0) {
                        System.out.println("Спасибо, что пришли! До новых встреч!");
                        System.exit(0);
                    }
                    System.out.println("Введите номер пункта меню: ");
                    digMenu = console.nextInt();
                }

            }

    private static String queueOfUnplayed() {
        return null;
    }

    public static void Menu(){

        System.out.println("Меню:\n" +
                "1. Розыграть игрушку.\n" +
                "2. Выдать игрушку.\n" +
                "3. Добавить игрушку.\n" +
                "4. Посмотреть статистику выпадения игрушек.\n" +
                "0. Выход.");
    }


}