public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest(new Tree(new Animal()));
        System.out.println(forest);
    }
}