import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<String> toDos = new ArrayList<>();

    public static void main(String[] args) {

        toDos.add("купить молока!");
        toDos.add("купить жлеба!");
        toDos.add("купить сыра!");
        toDos.add("выпить молока!");
        toDos.add("сварить молока!");
        toDos.add("купить гвозди!");
        toDos.add("купить молоток!");
        toDos.add("лечь спать!");
        toDos.add("курить кальян!");



        toDos.add(5, "а посмотри ка сегодня что то");
        toDos.
        add("купить еще что-то");
        printAll();




//        List <Integer> list = new ArrayList();
//        for (int i = 1; i <= 100; i++) {
//            list.add(i);
//        }
//        list.forEach(System.out::println);

    }
    public static void add (String todo){
        if (toDos.contains(todo)){
            System.out.println("дело " + todo + " уже есть в списке!");
            return;
        }
        toDos.add(todo);
        System.out.println("дело " + todo + " успешно добавлено в список!");
    }
    public static void delete (Integer index) {
        if (checkIndex(index)) {
            String todo = toDos.get(index);
            toDos.remove(index);
            System.out.println("дело " + todo + " успешно удалено из списка!");
        }
    }

    private static boolean checkIndex(Integer index) {
        if (toDos.size() <= index) {
            System.out.println("Нет такого дела");
            return false;
        }
        return true;
    }

    public static void printAll(){
        for (int i = 0; i < toDos.size(); i++) {
            System.out.println(toDos.get(i));

        }
    }
    public static void printByIndex(Integer index) {
        if (checkIndex(index)) {
            System.out.println("Нет такого дела");
            return;
        }
        System.out.println("Дело под индексом " + index + ": " + toDos.get(index));
    }
}
