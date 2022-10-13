import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        Cat cat = new Cat("Васька", "Иванов Иван Иванович", "13.10.2022", 1);
        Cat anotherCat = new Cat("Кузька", "Петров Петр Петрович", "13.10.2022", 2);
        Cat anotherCat1 = new Cat("Кузька", "Петров Петр Петрович", "13.10.2022", 2);
        cats.add(cat);
        cats.add(anotherCat);
        cats.add(anotherCat1);
//        getParticipants(cats, "13.10.2022");
        System.out.println(cats);
    }

    public static Set<Cat> getParticipants(Set<Cat> cats, String date){
        Set<Cat> participants = new HashSet<>();
        for (Cat cat : cats) {
            if(cat.getDateOfPresentation().equals(date)) {
                participants.add(cat);
            }
        }
        System.out.println(participants);
        return participants;
    }
}
