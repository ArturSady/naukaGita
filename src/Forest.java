public class Forest {
  public Tree tree;

    public Forest(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return "Forest{" +
                "tree=" + tree +
                '}';
    }
}
