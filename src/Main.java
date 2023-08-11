public class Main {

    public static void main(String[] args) {
        Tree[] trees = new Tree[3];
        trees[0] = createObject("Birch");
        trees[1] = createObject("AppleTree");
        trees[2] = createObject("Cherrytree");

        Printable[] printable = {trees[0], trees[1], trees[2]};
        for (int i = 0; i < printable.length; i++) {
            printable[i].print();
        }
    }

    private static Tree createObject(String className) {

        Tree obj = null;

        switch (className) {

            case "Birch":
                obj = new Birch(10, 5, "Береза",3);
                break;
            case "AppleTree":
                obj = new AppleTree(15, 7, "Яблоня",1000);
                break;
            case "Cherrytree":
                obj = new Cherrytree(5, 3, "Вишня","Ярко красная");
                break;
        }
        return obj;




    }
    }
