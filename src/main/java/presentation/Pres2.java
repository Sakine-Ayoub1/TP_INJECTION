package presentation;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String doClasseName= scanner.nextLine();
        Class cDao = Class.forName(doClasseName);
        IDao iDao = (IDao) cDao.getConstructor().newInstance();

        String metierClassName= scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        Imetier metier = (Imetier) cMetier.getConstructor().newInstance();

        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,iDao);

        System.out.println(metier.calcul());

    }
}
