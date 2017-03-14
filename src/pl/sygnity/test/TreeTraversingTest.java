package pl.sygnity.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeTraversingTest {

    private static Integer rLevel = 0;
    private static Integer lLevel = 0;
    private static Integer dLevel = 0;
    private static List<Node> nodes = new ArrayList<>();

    // przejście poprzeczne (od lewej do prawej)
    // prawidłowy wynik: 5 3 9 2 4 7 1 6 8
    private static void levelOrder(Node<?> tree){
        recLevelOrder(tree);        
        nodes.stream().sorted((Node e1, Node e2) -> (e1.dLevel - e2.dLevel)).forEach(e -> System.out.print(e.data));
        
    }
    private static void recLevelOrder(Node<?> tree) {
        if (tree.getLeft() != null) {   
            dLevel++;          
            recLevelOrder(tree.getLeft());
            dLevel--;
   
        }
        if (tree.getRight() != null) {          
            dLevel++;
            recLevelOrder(tree.getRight());
            dLevel--;
            
        }
        tree.dLevel = TreeTraversingTest.dLevel;
        nodes.add(tree);
    }

    // przejście pionowe (od góry do doły)
    // prawidłowy wynik:1 2 3 4 5 6 7 8 9
    private static void inOrder(Node<?> tree) {
        if (tree.left != null) {
            inOrder(tree.left);
        }
        System.out.print(tree.data);
        if (tree.right != null) {
            inOrder(tree.right);
        }
    }

    
    public static void wydrukujWynikZadania(Node<Integer> tree) {
		System.out.println("--- TreeTraversingTest - wynik zadania ---");
		inOrder(tree);
		System.out.println();
		levelOrder(tree);
		System.out.println();
	}

    
    
    /*
     * Proszę nie modyfikować tej metody!
     */
    public static void wydrukujWynikZadania2(Node<Integer> tree) {
        System.out.println("--- TreeTraversingTest - wynik zadania ---");
        levelOrder(tree);        
        Comparator<Node> byDeep = (Node e1, Node e2) -> (e1.dLevel - e2.dLevel);
        System.out.println("inOrder:");
        inOrder(tree);
        System.out.println();

        System.out.println("level Order:");
        nodes.stream().sorted(byDeep).forEach(e -> System.out.print(e.data));
        System.out.println();
       

        
     
    }

    public static class Node<T extends Comparable> {

        public Node<T> left;
        public Node<T> right;
       
        public T data;
        public Integer rLevel;
        public Integer lLevel;
        public Integer dLevel;

        public Node(T data) {
            this.data = data;
        }

        public Node<T> getLeft() {
            return this.left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
            
        }

        public Node<T> getRight() {
            return this.right;

        }

        public void setRight(Node<T> right) {
            this.right = right;
            
        }

       
    }

    /* 
     * Metoda tworzy drzewo takie jak na obrazku poniżej: 
		 
     5
     / \
     /   \
     /     \
     3       9
     / \     /
     2   4   7
     /       / \
     1       6   8
     */
    public static Node<Integer> buildTree() {
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        five.setLeft(three);
        five.setRight(nine);
        three.setLeft(two);
        three.setRight(four);
        two.setLeft(one);
        nine.setLeft(seven);
        seven.setLeft(six);
        seven.setRight(eight);

        return five;
    }
}
