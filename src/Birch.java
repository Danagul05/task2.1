public class Birch extends Tree  implements Printable {
    int barrelWidth;

    public Birch(int height, int age, String name,int barrelWidth) {
        super(height, age, name);
        this.barrelWidth=barrelWidth;
    }

    @Override
    public String print() {
        System.out.println( name + height + age + barrelWidth);
        return null;
    }
}
