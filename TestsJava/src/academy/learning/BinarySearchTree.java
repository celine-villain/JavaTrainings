package academy.learning;

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;

        Node cur = root;
        return value < cur.value ? contains(cur.left, value) : contains(cur.right, value);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        //Node f = new Node(11, null, null);
        Node e = new Node(11, null, null);
        Node d = new Node(8, null, null);
        Node c = new Node(9, d, e);
        Node b = new Node(4, null, null);
        Node a = new Node(7, b, c);


        System.out.println(contains(a, 11));
    }
}

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}