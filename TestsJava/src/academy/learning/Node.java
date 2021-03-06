/*
package academy.learning;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {
    public static boolean contains(Node root, int value) {
        Node currentNode = root;
        boolean test = false;
        while(currentNode.left != null || currentNode.right != null) {
            if (currentNode.left.value == value || currentNode.right.value == value) {
                test = true;
                break;
            }

            if (value >= currentNode.left.value) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return test;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}*/
