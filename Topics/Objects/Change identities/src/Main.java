class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {

        String tmpName = p1.name;
        int tmpAge = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = tmpName;
        p2.age = tmpAge;

    }
}