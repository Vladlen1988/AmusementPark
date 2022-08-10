import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Иван", "Семенов", 1));
        list.add(new Person("Дмитрий", "Петров", 1));
        list.add(new Person("Степан", "Алексеев", 3));
        list.add(new Person("Ольга", "Коровкина", 2));
        list.add(new Person("Елена", "Березкина", 1));
        return list;
    }

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < generateClients().size(); i++) {
            queue.offer(generateClients().get(i));
        }

        while (!queue.isEmpty()) {
            Person element = queue.poll();
            if (element.getTicket() != 0) {
                element.setTicket(element.getTicket() - 1);
                queue.offer(element);
                System.out.println(element.getName() + " " + element.getSurname() + " прокатился на аттракционе");
            }
        }

    }
}
