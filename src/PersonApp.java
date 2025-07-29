public class PersonApp {
    public static void main(String[] args) {
        // cara membuat object dengan new dan ()
        var person = new Person("Eki", "Antang");
        person.name = "Eki";
        person.address = "Antang";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Ekoo");

        Person person2 = new Person("Ekii");
        person2.name = "Ekii";
        person2.sayHello("Ekaa");

        Person person3 = new Person();
        person3.sayHello("Ekuuu");
    }

}
