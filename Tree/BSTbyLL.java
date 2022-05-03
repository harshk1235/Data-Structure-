package Tree;

//public class BSTbyLL {
////    private static Node root;
//    myNode1 root = null;
//    public static void main(String[] args) {
//        BSTbyLL n = new BSTbyLL();
////        n.insertrecursion(n.root, 10);
////        n.insertrecursion(n.root, 20);
////        n.insert(30);
//        n.display(n.root);
//
//
//    }
//
////    public static void insertrecursion(Node root,int value){
////        if(root==null){
////            Node n1 = new Node(value);
////            root=n1;
////            return;
////        }
////        if(root.data>value&&root.left==null){
////            root.left = new Node(value);
////        }
////        else if(root.data<value&&root.right==null){
////            root.right = new Node(value);
////        }
////        else{
    ////        if(root.data>value){
    ////            insertrecursion(root.left,value);
    ////        }
    ////        else if(root.data<value){
    ////            insertrecursion(root.right,value);
    ////        }
////            return; //not inserting same nodes;
////        }
////    }
//    public void insert(int value){
//        myNode1 newnode= new myNode1(value);
//        if(root == null){
//            root = newnode;
//            return;
//        }
//        else{
//            myNode1 current = root;
//            myNode1 parent = null;
////            while(true){
////                parent = current;
////                if(value<current.data){
////                    current = current.left;
////                    if(parent == null){
////                        parent.left = newnode;
////                        return;
////                    }
////                }
////            }
//            while(current!=null){
//                if(current.data<value){
//                    parent=current;
//                    current=current.left;
//                }
//                else if (current.data>value){
//                    parent=current;
//                    current=current.right;
//                }
//            }
//            if(parent.data>value){
//                    parent.left=root;
//            }
//            else{
//                parent.right=root;
//            }
//        }
//    }
//    public void display(myNode1 root){
//        if(root==null){
//            return;
//        }
//        System.out.println(root.data);
//        display(root.left);
//        display(root.right);
//    }
//}
//
