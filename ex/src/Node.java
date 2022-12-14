class Node {
    Node left, right;
    String data;
    int weight;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.weight = data.length();
    }

    public Node() {
        this.data = null;
        this.left = null;
        this.right = null;
        this.weight = 0;
    }

    public static void printNode(Node node) {
        if (node != null) {
            printNode(node.left);
            if (node.data != null) {
                System.out.print(node.data);
            }
            printNode(node.right);
        }
    }

}

