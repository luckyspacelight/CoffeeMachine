
class Cat {

    String name;
    int age;
    static int counter;
    final int tmpNumber = 5;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (getNumberOfCats() > tmpNumber) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return Cat.counter;
    }
}