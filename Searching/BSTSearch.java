import java.util.*;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BSTSearch {
    public static Node insert(Node root, int value) {
        // normal bst insert
        if (root == null)
            return new Node(value);

        if (value < root.value)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

    public static Node search(Node root, int target) {
        // bst search - goes left or right based on value
        if (root == null)
            return null;

        if (root.value == target)
            return root;

        if (target < root.value)
            return search(root.left, target);
        else
            return search(root.right, target);
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 57, 12, 97, 36, 45, 2, 27, 79};
        Node root = null;

        for (int n : nums)
            root = insert(root, n);

        System.out.println("BST created with values: " + Arrays.toString(nums));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find: ");
        int x = sc.nextInt();

        Node res = search(root, x);
        if (res != null)
            System.out.println("Found " + x + " in tree");
        else
            System.out.println("Not found :(");
    }
}
