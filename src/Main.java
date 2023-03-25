import napoje.Napoje;
import napoje.impl.Cola;
import napoje.impl.Sok;
import napoje.impl.Woda;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    private static final ArrayList<Napoje> napojeArrayList = new ArrayList<>();
    public static void main(String[] args) {
        dodajElementy();
        iterowanie();
        sortPoNazwie();
        sortPoNazwieKlasy();
        zad7();
        zad8("abc");
        zad9(4);
        zad10(10, 10);
    }

    private static void dodajElementy(){
        napojeArrayList.add(new Woda("Żywiec Zdrój", "truskawkowy"));
        napojeArrayList.add(new Sok("Tymbark", "jabłko-mięta"));
        napojeArrayList.add(new Cola("Coca-Cola Zero", "zwykła"));
    }

    private static void iterowanie(){
        napojeArrayList.forEach(napoj -> napoj.pij());
    }

    private static void sortPoNazwie(){
        napojeArrayList.sort((o1, o2) -> o1.getNazwa().compareTo(o2.getNazwa()));
        napojeArrayList.forEach(napoj -> System.out.println(napoj.getNazwa()));
    }

    private static void sortPoNazwieKlasy(){
        napojeArrayList.sort((o1, o2) -> o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName()));
        napojeArrayList.forEach(napoj -> System.out.println(napoj.getClass().getSimpleName()));
    }

    private static void zad7(){
        KochajacyProgramowac kochajacyProgramowac = new KochajacyProgramowac() {
            @Override
            public void programuj() {
                System.out.println("programuje w Javie");
            }
        };
        kochajacyProgramowac.programuj();
    }

    private static void zad8(String napis){
        Function<String,Integer> dlugosc = (a) -> a.length();
        System.out.println(dlugosc.apply(napis));
    }

    private static void zad9(int ocena){
        Consumer<Integer> wynik = (ocena1) -> System.out.println("Dostanę ocenę: " + ocena1);
        wynik.accept(ocena);
    }

    private static void zad10(int a, int b){
        BiFunction<Integer, Integer, Integer> iloczyn = (a1, b2) -> a1*b2;
        System.out.println(iloczyn.apply(a, b));
    }

}