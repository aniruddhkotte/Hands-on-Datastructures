//PostOrder traversal

class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        data = val;
    }
}

class TreeFunctinalities{
    void traversal(Node startNode){
        //System.out.println(startNode.data);
        if(startNode.left != null){
            traversal(startNode.left);
            System.out.println(startNode.left.data);
        }
        if(startNode.right != null){
            traversal(startNode.right);
            System.out.println(startNode.right.data);
        }
        
        
    }

    void addNode(Node startNode, int data){
        if(startNode.data > data){
            if(startNode.left == null){
                startNode.left = new Node(data);
            }else{
                addNode(startNode.left, data);
            }
        }else{
            if(startNode.right == null){
                startNode.right = new Node(data);
            }else{
                addNode(startNode.right, data);
            }
        }
    }
}

class CustomTree{
    public static void main(String[] args) {
        Node rootNode = new Node(10);
        TreeFunctinalities treeFunctinalities = new TreeFunctinalities();

        treeFunctinalities.addNode(rootNode, 20);
        treeFunctinalities.addNode(rootNode, 1);
        treeFunctinalities.addNode(rootNode, 54);
        treeFunctinalities.addNode(rootNode, 3);
        treeFunctinalities.addNode(rootNode, 5);
        treeFunctinalities.addNode(rootNode, 9);
        treeFunctinalities.addNode(rootNode, 2);

        treeFunctinalities.traversal(rootNode);
        System.out.println(rootNode.data);
    }
}
