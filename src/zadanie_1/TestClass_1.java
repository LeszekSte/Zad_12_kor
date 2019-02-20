package zadanie_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TestClass_1 {


    public static void main(String[] args) throws IOException {
        List<Product> list = new ArrayList<>(100);
        readData(list);
        printList(list);
        sumPrice(list);
    }

    private static double sumPrice(List<Product> list) {
        int sum= 0;

        

        return sum;
    }

    private static void printList(List<Product> list) {
        for (Product product : list) {
            System.out.println(product.toString());
        }

    }

    private static List<Product> readData(List<Product> listInput) throws IOException {
        FileReader fileReader = new FileReader("produkty.csv");
        BufferedReader bfr = new BufferedReader(fileReader);
        String line = null;
        int ithm = 0;

        while ((line = bfr.readLine()) != null) {
            System.out.println(line);
            String[] position = line.split(";");
            Product product = new Product(position[0], position[1], Double.valueOf(position[2]));
            listInput.add(product);
        }
        bfr.close();
        return listInput;
    }

}

