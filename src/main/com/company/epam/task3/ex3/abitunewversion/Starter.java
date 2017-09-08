package main.com.company.epam.task3.ex3.abitunewversion;

import main.com.company.epam.task3.ex3.abitunewversion.model.Abiturient;
import main.com.company.epam.task3.ex3.abitunewversion.service.Service;
import main.com.company.epam.task3.ex3.abitunewversion.stock.Stock;

/**
 * Created by Владислав on 31.07.2017.
 */
public class Starter {
    public static void main(String[] args) {
        Service<Abiturient> service = new Service<>();
        Stock stock = new Stock();

        Abiturient[] abiturients = stock.getStudents();

        for (Abiturient abiturient:abiturients){
            System.out.println(abiturient );
        }



        System.out.println();

        service.doJob(abiturients);
    }
}
