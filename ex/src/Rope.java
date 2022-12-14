
class Rope {
    Node root;

    public Rope() {
        root = new Node();
    }

    public void makeEmpty() {
        root = new Node();
    }

    public void append(String str) {
        Node newNode = new Node(str);
        Node newRoot = new Node();

        newRoot.left = root;
        newRoot.right = newNode;

        if (newRoot.left.right == null) {
            newRoot.weight = newRoot.left.weight;
        } else {
            newRoot.weight = newRoot.left.weight + newRoot.left.right.weight;
        }


        root = newRoot;
    }

    public char findByIndex(int index) {
        Node node = root;
        if (index > node.weight) {
            index -= node.weight;
            return node.right.data.charAt(index);
        }

        while (index < node.weight) {
            node = node.left;
        }

        index -= node.weight;
        return node.right.data.charAt(index);
    }

    public void concatenation(Rope rope) {
        Rope newRoot = new Rope();
        newRoot.root.left = this.root;
        newRoot.root.right = rope.root;
        newRoot.root.weight = newRoot.root.left.weight;
        newRoot.root.weight += newRoot.root.left.right.weight;
        this.root = newRoot.root;
    }

    public String substring(int start, int end) {
        String str = "";
        boolean found = false;
        Node tmp = this.root;
        if (end > tmp.weight) {
            found = true;
            end -= tmp.weight;
            if (start > tmp.weight) {
                start -= tmp.weight;
                str = tmp.right.data.substring(start, end);
                return str;
            }
            else
                str = tmp.right.data.substring(0, end);
        }
        if (!found) {
            while (end <= tmp.weight)
                tmp = tmp.left;
            end -= tmp.weight;
            if (start >= tmp.weight) {
                start -= tmp.weight;
                str = tmp.right.data.substring(start, end) + str;
                return str;
            }
            str = tmp.right.data.substring(0, end);
        }
        tmp = tmp.left;
        while (start < tmp.weight) {
            str = tmp.right.data + str;
            tmp = tmp.left;
        }
        start -= tmp.weight;
        str = tmp.right.data.substring(start) + str;

        return str;
    }


    public void printRoot() {
        Node.printNode(root);
    }
}
