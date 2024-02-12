// Given a binary tree, return the inorder traversal of its nodes' values.

package Trees;

public class InorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node2.left = node3;

        inorder(root);
    }

    private static void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.val);
        inorder(node.right);
    }
    
}
