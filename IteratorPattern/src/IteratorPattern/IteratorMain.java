/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;


public class IteratorMain {          
    public static void main(String[] args) {           
        
        
        SimpleList list=new SimpleList();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));
        list.add(new Node(6));
        list.add(new Node(7));
        
        ArrayListClass arrayList = new ArrayListClass();
        arrayList.arrayList.add(10);
        arrayList.arrayList.add(11);
        arrayList.arrayList.add(12);
        arrayList.arrayList.add(13);
        arrayList.arrayList.add(14);
        arrayList.arrayList.add(15);
        arrayList.arrayList.add(16);
        
        
        BinarySearchTree tree = new BinarySearchTree(); 
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 

        
        IIterator<Integer> SLIterator = list.createIterator();
        
        IIterator<Integer> ALIterator = arrayList.createIterator();
        
        IIterator<Integer> BTIterator = tree.createIterator();
        
        
        System.out.println("");
        
        while (SLIterator.hasNext()) {
            Integer num = SLIterator.next();
            System.out.println("List num > " + num.toString());
        }
        
        System.out.println("");
        
        while (ALIterator.hasNext()) {
            Integer num = ALIterator.next();
            System.out.println("ArrayList num > " + num.toString());
        }
        
        System.out.println("");
        
        while (BTIterator.hasNext()) {
            Integer num = BTIterator.next();
            System.out.println("Tree num > " + num.toString());
        }
        
        System.out.println("");
    }
}



