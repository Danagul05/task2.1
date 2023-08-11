public class AppleTree extends Tree implements Printable {
    int numberOfFruits;

    @Override
    public String print() {
        return name + age+ height + numberOfFruits ;
    }
}
