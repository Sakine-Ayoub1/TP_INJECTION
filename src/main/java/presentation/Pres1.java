package presentation;

import dao.DaoImpl;
import dao.DaoImplV2;
import metier.MetierImpl;

public class Pres1 {

    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        metier.setDao(new DaoImpl());
        System.out.println(metier.calcul());
    }
}
