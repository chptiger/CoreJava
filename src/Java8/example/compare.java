package Java8.example;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class compare {

    @Test
    public void test_Comaprator() {
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort desc");

        //lambda here!
        listDevs.sort((Developer o1, Developer o2)->o2.getAge()-o1.getAge());
        //java 8 only, lambda also, to print the List
        listDevs.forEach((developer)->System.out.println(developer));

        System.out.println("After Sort asc");

        listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
        //java 8 only, lambda also, to print the List
        listDevs.forEach((developer)->System.out.println(developer));

        System.out.println("After Sort by Comparator.comparing");

        listDevs.sort(Comparator.comparing(Developer::getAge));
        //java 8 only, lambda also, to print the List
        listDevs.forEach((developer)->System.out.println(developer));

        System.out.println("After Sort age then salary: by Comparator.comparing thenComparing ");

        listDevs.sort(Comparator.comparing(Developer::getAge).thenComparing(Developer::getSalary));
        //java 8 only, lambda also, to print the List
        listDevs.forEach((developer)->System.out.println(developer));


    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>()

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 33));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }
}

class Developer {
    private String name;
    private int Age;
    private BigDecimal salary;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        Age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", salary=" + salary +
                '}';
    }
}
