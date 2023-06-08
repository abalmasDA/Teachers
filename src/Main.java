/**
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити class Main, у ньому створити список, додати вчителів,
 * яких ви зможете згадати зі школи. І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
 */

public class Main {

    public static void main(String[] args) {
        String teacher1 = "Ivanova A.";
        String teacher2 = "Petrenko P.";
        String teacher3 = "Nazarenko E.";
        String teacher4 = "Glushakova I.";

        Teachers teachers = new Teachers();
        teachers.addingTeachersToList(teacher1);
        teachers.addingTeachersToList(teacher2);
        teachers.addingTeachersToList(teacher3);
        teachers.addingTeachersToList(teacher4);

        System.out.println("Index of the best teacher is " + teachers.getItemIndex(teacher3));
        System.out.println("Index of the worst teacher is " + teachers.getItemIndex(teacher1));
        teachers.printList();


    }


}
