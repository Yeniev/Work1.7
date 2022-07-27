public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+lastName + firstName +middleName);
        String expectedName = "Ivanov Ivan Ivanovich";
        if (fullName.equals(expectedName)) {
            System.out.println("Правильно");
        }else {
            System.out.println("Не правильно");
        }
        System.out.println("Задание 2");

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);

        System.out.println("Задание 3");

        String newName = fullName.replace("Ivanov Ivan Ivanovich", "Иванов Семён Семёнович");
        System.out.println("Новое имя - " + newName);
        String newFullName = newName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — "+newFullName);
    }
}