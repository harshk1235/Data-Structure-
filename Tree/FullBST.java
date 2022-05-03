package Tree;
import java.util.*;




/*
1/4

binary search tree by using linked list

all rules from BT are carry forwarded.

operations:

a) insertion


*/

// class BinaryNode{}  already implemented


public class FullBST {
    static BinaryNode<Integer> root;
    static int size;
    static int sum;// for replacement function
    public static void insert(int value){
        BinaryNode<Integer> n=new BinaryNode<>(value);
        if (root==null){
            root=n;
            return;
        }
    }

    public static void insertRecursion2(BinaryNode<Integer> r, int value){
        // accepts value to be inserted

        if (r.data>value && r.left==null){
            r.left=new BinaryNode<>(value);
            return;
        }else if (r.data<value && r.right==null){
            r.right=new BinaryNode<>(value);
            return;
        }
        else{
            if(r.data>value){
                insertRecursion2(r.left, value);
            }
            else if (r.data<value){
                // r.data<value
                insertRecursion2(r.right, value);
            }
            // not inserting the equal nodes
            return;

        }
    }
    public static void insertRecursion(int value){
        if (root==null){
            BinaryNode<Integer> n= new BinaryNode<>(value);
            root=n;
            return;
        }
        insertRecursion2(root, value);
    }

    // public static void insert(BinaryNode<Integer> root, BinaryNode<Integer> ne){
    //     if (root==null){
    //         root=ne;

    //     }
    //     System.out.println(root.data);
    // }
    public static void counter(BinaryNode<Integer> root){
        // size++;
        if (root==null){
            return;
        }
        // System.out.println(root.data);
        size++;
        counter(root.left);
        counter(root.right);

    }
    public static int count(BinaryNode<Integer> root){
        int c=0;
        if (root==null){
            return c;
        }
        int ans=count(root.left);
        ans+=count(root.right);
        c+=ans;
        return c;

    }
    public static LinkedList<Integer> path(BinaryNode<Integer> root, int val){
        if (root==null){
            return null;
        }
        if (val==root.data){
            LinkedList<Integer> obj= new LinkedList<>();
            obj.add(root.data);
            return obj;
        }
        if (val<root.data){
            LinkedList<Integer> left= path(root.left, val);
            if (left!=null){
                left.add(root.data);
            }
            return left;

        }
        else{
            LinkedList<Integer> right= path(root.right, val);
            if (right!=null){
                right.add(root.data);
            }
            return right;
        }
        // return null;

    }
    public static void pathcalling(){
        LinkedList<Integer> pat=path(root, 25);
        if (pat==null){
            System.out.println("Item not in the tree");
        }
        else{
            Iterator<Integer> it= pat.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }

    public static void traverse(BinaryNode<Integer> root){
        if (root==null){
            return;

        }
        System.out.print(root.data+"   ");
        traverse(root.right);
        traverse(root.left);
        // find the index of the node in the tree and sum
        // root.data=indexSum(root.data);
        //

    }

    public static void replaceWhileTraversing(BinaryNode<Integer> rt){
        // since we have to update with the sum of the greater values,
        // will be using the preorder traversel
        if (rt==null){
            return;

        }
        replaceWhileTraversing(rt.right);
        sum+=rt.data;
        rt.data=sum-rt.data;
        replaceWhileTraversing(rt.left);
        // System.out.println("reached here"+rt.data);

        return;
    }

    public static void traverseAndReplace(BinaryNode<Integer> rt){
        // will traverse in preorder format
        if (rt==null){
            return;

        }
        traverseAndReplace(rt.right);
        traverseAndReplace(rt.left);
        // find the index of the node in the tree and sum
        rt.data=indexSum(rt.data);
        //
    }

    public static int indexSum(int ind){
        // we can have sorted int[] as parameter or by other function, for now let's have it preloaded
        int[] arj={5, 10, 20, 25, 30, 35, 40, 50};
        int i, j=0;
        for (i = 0; i < arj.length; i++) {
            if (ind==arj[i]){
                break;
            }
            continue;
        }
        int sum=0;  i++;
        for (j = i; j < arj.length; j++) {
            sum+=arj[i];

        }
        return sum;


    }

    public static void ReplaceWithGreaterValuesNodes(int[] arr){
        // 6/4

        // using the array
        int[] arj= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arj[i]=arr[i];
        }
        Arrays.sort(arj);
        System.out.println(Arrays.toString(arj));



    }

    public static void main(String[] args) {
        // int arr[]={30, 20, 25, 40, 45, 35, 10};
        int arr[]= {30, 20, 50, 25, 35, 40, 10};
        for (int i = 0; i < arr.length; i++) {
            insertRecursion(arr[i]);
        }
        counter(root);
        System.out.println("size of the tree is "+ size);
        size=0;
        ReplaceWithGreaterValuesNodes(arr);
        traverse(root);
        System.out.print("\n               -----\n");
         traverseAndReplace(root);
        replaceWhileTraversing(root);
        traverse(root);
        pathcalling();



    }

}


/*
4/4
Write a method to print all the values of a binary search tree, which are between 10 and 30(both inclusive)
to be optimised based on the three conditions

balanced binary search tree, int arr is having each value in ascending order, construct the balanced binary tree,
approach-Divide & Conquer, like merge sort and binary search,
left skewed tree convert to balanced binary tree.

write a method to check the given tree, is a binary search tree or not.
signature, public static boolean checkBST(Node root)


*/


/*
5/4

30 20 25 40 45 35 10

print path of the required element(searched element)




*/


/*

6/4

int arr[]= {30, 20, 50, 25, 35, 40, 10}
values in the form of an array

create a binary search tree from this array.
now traverse the tree and check for the highest value, ( here 50),
for each element, replace the element's data value with the sum of the nodes with value greater than that element's value.
(replace with sum of greater values)

now after replacement print the tree in formatted order.


also perform deletion in BST

*/
