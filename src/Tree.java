public class Tree {
 public Animal animal;

    public Tree(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "animal=" + animal +
                '}';
    }
}
