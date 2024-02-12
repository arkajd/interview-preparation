package Trees;

public class PostorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node2.left = node3;

        postorder(root);
    }

    private static void postorder(TreeNode node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val);
    }
}
