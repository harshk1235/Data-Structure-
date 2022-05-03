package Tree;

import java.util.*;

import java.util.LinkedList;

public class PracticeBT {
    static class pNode{
        pNode left;
        pNode right;
        int data;
        pNode(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        pNode res = buildTree(arr);
//        System.out.println(res.data);
//        preorder(res);
//        inorder(res);
//        postorder(res);
//        levelOrder(res);
//        System.out.println(countOfNodes(res));
//        System.out.println(sumOfNodes(res));
//        System.out.println(heightOfTree(res));
        System.out.println(diameter(res));
    }
    static int index=-1;
    public static pNode buildTree(int[] arr){
        index++;
        pNode n = new pNode(arr[index]);
        if(arr[index]==-1){
            return null;
        }

        n.left=buildTree(arr);
        n.right=buildTree(arr);

        return n;
    }

    public static void preorder(pNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(pNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void postorder(pNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public static void levelOrder(pNode root){
        if(root==null){
            return;
        }
        Queue<pNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            pNode currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
        }
    }

    public static int countOfNodes(pNode root){
        if(root==null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes+rightNodes+1;

    }

    public static int sumOfNodes(pNode root){
        if(root==null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }

    public static int heightOfTree(pNode root){
        if(root==null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static int diameter(pNode root){
        if(root==null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }
}
