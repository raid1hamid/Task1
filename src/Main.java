import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//number Q1:



        List<Employee> employees = new ArrayList<>();


        employees.add(new Employee(101,"ahmad","ali",new Date(2026), Employee.PositionEnum.FE));
        employees.add(new Employee(102,"rami","mustaf",new Date(2025), Employee.PositionEnum.HR));
        employees.add(new Employee(103,"ala","omar",new Date(2024), Employee.PositionEnum.FE));


        StringBuilder result = new StringBuilder();


        employees.stream().forEach(employee -> {

            if (result.length() > 0) {
                result.append(",");
            }

            result.append(employee.getId());
        });
        System.out.println("Sol q1 A 1 : ");
        System.out.println(result);




        //q1 a 2  :
        Map<Long, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(
                        employee -> (long) employee.getId(),  //key
                        employee -> employee   //value
                ));
        System.out.println("Sol q1 A 2 :");
        System.out.println(employeeMap);


       // q1 a 3 :

        Map<Employee.PositionEnum , List<Employee>> employeeByPosition =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getPosition
                        ));
        System.out.println("sol q1 a 3 : ");
        System.out.println(employeeByPosition);



//Q1  B :
        List<Card> cards = Arrays.asList(
                new Card(1L, "ABC", LocalDate.of(2025, 10, 1)),
                new Card(2L, "ABC", LocalDate.of(2027, 5, 1)),
                new Card(3L, "XYZ", LocalDate.of(2026, 8, 1)),
                new Card(4L, "XYZ", LocalDate.of(2028, 3, 1)),
                new Card(5L, "DEF", LocalDate.of(2024, 12, 1))
        );

        List<Card> results = cards.stream()
                .collect(Collectors.groupingBy(Card::getFingerprint))
                .values()
                .stream()
                .map(cardList -> cardList.stream()
                        .max(Comparator.comparing(Card::getExpiryDate))
                        .get())
                .collect(Collectors.toList());
        System.out.println("sol Q1 B : ");
        results.forEach(System.out::println);



    }
}
