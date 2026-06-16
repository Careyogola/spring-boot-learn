class Person {
    String name;
    int age;

    void speak() {
        System.out.print("My name is:" + name);
    }

    int calculateYears() {
        int yearsLeft = 65 + age;
        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class getters {
        public static void main(String[] args) {
            Person person1 = new Person();

            person1.name = "Francis";
            person1.age = 24;

            int years = person1.calculateYears();
            System.out.println(years);

            int age = person1.getAge();
            String name = person1.getName();

            System.out.println(name);
            System.out.println(age);
        }
    }