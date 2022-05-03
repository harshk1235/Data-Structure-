package Tree;

class AVLNode{
    int value;
    AVLNode Left;
    AVLNode Right;
    int height;
    int balance;
    public AVLNode(int value){
        this.value=value;
    }


}

public class AVL {
    public static AVLNode leftrotation(AVLNode A){
        AVLNode B = A.Right;
        AVLNode Bleft = B.Left;
        B.Left = A;
        A.Right = Bleft;
        updateheightandbalance(A);
        updateheightandbalance(B);
        return B;
    }



    public static AVLNode rightrotation(AVLNode A){
        AVLNode B = A.Left;
        AVLNode Bright = B.Right;
        B.Right = A;
        A.Left = Bright;
        updateheightandbalance(A);
        updateheightandbalance(B);
        return B;
    }

    public static AVLNode getrotation(AVLNode node){
        updateheightandbalance(node);
        if(node.balance==2){
            if(node.Left.balance==1){
                return rightrotation(node);
            }
            else{
                node.Left = leftrotation(node.Left);
                return rightrotation(node);
            }
        }
        else if(node.balance==-2){
            if(node.Right.balance==-1){
                return leftrotation(node);
            }
            else{
                node.Right=rightrotation(node.Right);
                return leftrotation(node);
            }
        }
        return node;
    }

    public static void updateheightandbalance(AVLNode troot) {
        int lh=-1;
        int rh=-1;
        if(troot.Left!=null){
            lh=troot.Left.height;
        }
        if(troot.Right!=null){
            rh=troot.Right.height;
        }
        troot.balance=lh-rh;
        troot.height=Math.max(lh,rh)+1;
    }

    public static void Display(AVLNode node){
        if(node==null){
            return;
        }
        String str ="";
        str += node.Left!= null?node.Left.value+" " : ".";
        str+="<- "+ node.value+" ->";
        str+=  node.Right!= null?node.Right.value+" " : ".";
        System.out.println(str);
        Display(node.Left);
        Display(node.Right);
    }

    public static AVLNode insert(AVLNode root,AVLNode newnode){
        if(root==null){
            root=newnode;
            return root;
        }
        else if(newnode.value<root.value){
            if(root.Left==null){
                root.Left=newnode;
            }
            else{
                root.Left=insert(root.Left,newnode);
            }
        }
        else if (newnode.value > root.value) {
            if (root.Right == null) {
                root.Right = newnode;
            } else {
                root.Right= insert(root.Right, newnode);

            }
        }
        root= getrotation(root);
        return root;
    }

    public static void main(String[] args) {
        AVLNode n1 = new AVLNode(30);
        AVLNode n2 = new AVLNode(20);
        AVLNode n3 = new AVLNode(10);

        insert(null,n1);
        AVLNode root = insert(n1,n2);
        root = insert(root,new AVLNode(25));
        root = insert(root,n3);
        root = insert(root,new AVLNode(11));
        root= insert(root,new AVLNode(5));
        System.out.println("display data");
        Display(root);

    }



}
