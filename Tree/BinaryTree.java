package Tree;
import Tree.myNode;

import java.util.LinkedList;
import java.util.Queue;

class myNode {
    int data;
    myNode left;
    myNode right;
    public myNode(int data){
        this.data=data;
    }
}


public class BinaryTree {
    public static void main(String[] args) {
        myNode root = new myNode(10);
        myNode rleft = new myNode(20);
        myNode rright = new myNode(30);
        myNode rlleft = new myNode(40);
        myNode rlright = new myNode(50);

        root.left=rleft;
        root.right=rright;
        rleft.left=rlleft;
        rleft.right=rlright;
        preorder(root);


    }
    static void preorder(myNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(myNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);

    }
    static void inorder(myNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    static void levelorder(myNode root){
        if(root==null){
            return;
        }
        Queue<myNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            myNode curr = q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }


    }



}
