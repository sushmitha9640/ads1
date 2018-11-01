import java.util.Scanner;

public final class Solution {
        
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTreeDemo<String, Integer> bst
        = new BinarySearchTreeDemo<String, Integer>();
        String[] tokens = sc.nextLine().split(" ");
        for (int i = 0; i < tokens.length; i++) {
            bst.put(tokens[i], i);
        }
        while (sc.hasNextLine()) {
            String[] choice = sc.nextLine().split(" ");
            switch (choice[0]) {
            case "max":
                System.out.println(bst.max());
                break;
            case "floor":
                System.out.println(bst.floor(choice[1]));
                break;
            case "rank":
                System.out.println(bst.rank(choice[1]));
                break;
            case "deleteMin":
                bst.deleteMin();
                break;
            case "contains":
                System.out.println(bst.contains(choice[1]));
                break;
            case "keys":
                System.out.println(bst);
                break;
            case "get":
                System.out.println(bst.get(choice[1]));
                break;
            default:
                break;

            }
        }


    }
}
