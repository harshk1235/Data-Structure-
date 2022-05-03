package Tree;

class BinaryNode<T extends Number>{
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;
    BinaryNode(T data){
        this.data=data;
    }

}

public class FirstTree {
    public static void main(String[] args) {
        int[] arr = {10,20,-1,-1,30,-1,-1,40,-1,-1,50,-1,-1};
        BinaryNode<Integer> root = new BinaryNode<>(10);
        BinaryNode<Integer> leftroot = new BinaryNode<>(20);
        BinaryNode<Integer> rightroot = new BinaryNode<>(30);
        root.left=leftroot;
        root.right=rightroot;
        FirstTree t1 = new FirstTree();
//        t1.preorder(root);
//        t1.inorder(root);
//        t1.postorder(root);
//        System.out.println(t1.countNodes(root));
//        myNode1 ans = t1.problem(arr);
//        System.out.println(ans.data);

    }
    public void preorder(BinaryNode x){
        if(x==null)
        {
            return;
        }
        System.out.println(x.data);
        preorder(x.left);
        preorder(x.right);
    }

    public void inorder(BinaryNode x){
        if(x==null)
        {
            return;
        }
        inorder(x.left);
        System.out.println(x.data);
        inorder(x.right);
    }
    public int countNodes(BinaryNode x){

        if(x==null){
            return 0;
        }
        return 1+ countNodes(x.left)+countNodes(x.right);
    }

    public BinaryNode problem(int[] arr){
        int val=1;
        val++;

        if(arr[val]==-1){
            return null;
        }
        BinaryNode<Integer> n1 = new BinaryNode<>(arr[val]);
        n1.left=problem(arr);
        n1.right= problem(arr);
        return n1;
    }

    public void postorder(BinaryNode x){
        if(x==null)
        {
            return;
        }
        postorder(x.left);
        postorder(x.right);
        System.out.println(x.data);
    }

    



    public void display(BinaryNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }
}
