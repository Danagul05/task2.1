public class Birch extends Tree  implements Printable {
    int barrelWidth ;

    @Override
    public String print() {
        return name + height + age + barrelWidth;
    }
}
