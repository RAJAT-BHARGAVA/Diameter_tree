public class Diameter_of_tree {
    static class Node {
        int data;
        Node left ;
        Node right ;
        Node (int data){
            this.data= data;
            this.left = null;
            this.right = null;   
        }
    }
    public static int hight(Node root){
        if(root == null){
            return 0;
        }
        int lh = hight(root.left);
        int rh = hight(root.right);
        return Math.max(lh,rh)+1;

    }
    public static int dia (Node root){
        if(root==null){
            return 0;
        }
        int ld = dia(root.left);
        int lh = hight(root.left);
        int rd = dia(root.right);
        int rh = hight(root.right);
        int d = lh+rh+1;
        return Math.max(d,Math.max(ld,rd));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
        System.out.println(dia(root));
    }
}
