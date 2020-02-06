package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "5 7 3";
        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }

//        ListItem root = tree.getRoot();
//        tree.traverse(root);

        tree.traverse(tree.getRoot());
    }
}
