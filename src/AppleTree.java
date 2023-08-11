public class AppleTree extends Tree implements Printable {
    int numberOfFruits;

    public AppleTree(int height, int age, String name, int numberOfFruits) {
        super(height, age, name);
        this.numberOfFruits=numberOfFruits;
    }

    @Override
    public String print() {
        System.out.println( name + height + age + numberOfFruits);
        return null;
    }
}
