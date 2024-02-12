// You are given the root node of a binary tree A. You have to find the height of the given tree.
// A binary tree's height is the number of nodes along the longest path from the root node down to the farthest leaf node.

package Trees;

public class TreeHeight {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node2.left = node3;

        System.out.println(height(root));
    }

    private static int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
    
}
