import java.util.ArrayList;

public class Teachers {

    ArrayList<String> listOfTeachers = new ArrayList<>();


    public void addingTeachersToList(String teacherToAdd) {
        listOfTeachers.add(listOfTeachers.size(), teacherToAdd);
    }


    public void printList() {
        System.out.println(listOfTeachers);
    }


//    one way to get item index
//    public int getItemIndex(String item) {
//        int index = 0;
//        for (int i = 0; i < listOfTeachers.size(); i++) {
//            if (listOfTeachers.get(i).equalsIgnoreCase(item)) index = i;
//        }
//        return index;
//    }


    //    second way to get item index
    public int getItemIndex(String item) {
        return listOfTeachers.indexOf(item);
    }


}
