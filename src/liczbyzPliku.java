import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class liczbyzPliku {

    public static void main(String[] args) throws IOException {

        TreeSet<Integer> set = new TreeSet<>();

        File file = new File("C:\\IdeaProjects\\zadanie-java-43\\src\\plik_liczbowy.txt");
        Scanner scanner = new Scanner(file);

        int licznik = 0;
        int liczba = 0;
        while (scanner.hasNextInt()) {
            set.add(scanner.nextInt());
            licznik++;
        }

        int x = 0;
        int size = set.size();
        int temp = 0;
        boolean isAdded = set.contains(set.first());
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if((isAdded) == iterator.hasNext()){
                temp++;
            }
        } System.out.println("Liczba " + set.first() + " powtarza się w pliku " + temp + " razy");


        boolean isAddedLast = set.contains(set.last());
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if((isAddedLast) == iterator.hasNext()){
                temp++;
            }
        } System.out.println("Liczba " + set.last() + " powtarza się w pliku " + temp + " razy");

        System.out.print("\nIlosc wszystkich liczb w pliku: ");
        System.out.print(licznik);
        System.out.println();

        System.out.print("Ilość różnych liczb: ");
        System.out.print(size);
        System.out.println();
    }
}