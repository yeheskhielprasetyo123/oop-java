class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor method yang pertama kali dipanggil ketika method pertama kali dibuat
    Person(String paramName, String paramAddress) {
        name  = paramName;
        address = paramAddress;
    }

    Person(String paramName) {
        name  = paramName;
    }

    Person() {

    }

    // pake void karna tidak mengembalikan data
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
