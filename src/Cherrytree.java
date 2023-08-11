public class Cherrytree extends Tree implements Printable {
    String colorCherry;

    public Cherrytree(int height, int age, String name, String colorCherry) {
        super(height, age, name);
        this.colorCherry= colorCherry;
    }

    @Override
    public String print() {
        System.out.println( name + height + age + colorCherry);
        return null;
    }
}
