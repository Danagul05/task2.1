public class Cherrytree extends Tree implements Printable {
    String colorCherry;

    @Override
    public String print() {
        return name+ age+ height + colorCherry;
    }
}
