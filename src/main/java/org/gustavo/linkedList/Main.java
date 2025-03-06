package org.gustavo.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(1);
        linkedList.append(2);

        // (2) Items in list
        System.out.println("Removed Node: " + linkedList.removeLast().getValue());
        // (1) Item in list
        System.out.println("Removed Node: " + linkedList.removeLast().getValue());
        // (0) Items in list
        System.out.println("Removed Node: " + linkedList.removeLast());

        System.out.println("\nPrepend:");
        LinkedList<Integer> linkedList2 = new LinkedList<>(2);
        linkedList2.append(3);

        linkedList2.printLinkedList();

        linkedList2.prepend(4);
        linkedList2.printLinkedList();

        System.out.println("\nRemoving First Item:");

        LinkedList<Integer> linkedList3 = new LinkedList<>(1);
        linkedList3.append(2);

        System.out.println("Before remove: \n");
        linkedList3.printLinkedList();

        System.out.println("After remove: \n");
        // (2) Items in list
        System.out.println("Removed Node: " + linkedList3.removeFirst());
        // (1) Item in list
        System.out.println("Removed Node: " + linkedList3.removeFirst());
        // (0) Items in list
        System.out.println("Removed Node: " + linkedList3.removeLast());

        System.out.println("\nGet By Index:");
        LinkedList<Integer> linkedList4 = new LinkedList<>(1);
        linkedList4.append(2);
        linkedList4.append(3);
        linkedList4.append(4);

        linkedList4.printLinkedList();
        System.out.println("\nElement: " + linkedList4.get(2).getValue());


        System.out.println("\nUpdate element: ");
        LinkedList<Integer> linkedList5 = new LinkedList<>(1);
        linkedList5.append(2);
        linkedList5.append(3);

        linkedList5.update(1, 10);
        linkedList5.printLinkedList();

        System.out.println("\nInsert element: ");
        LinkedList<String> names = new LinkedList<>("Gustavo");
        names.append("José");
        names.append("Maria");

        names.printLinkedList();

        names.insert(3, "Lurdes");

        names.printLinkedList();

        System.out.println("\nRemove element: ");

        names.remove(3);
        names.printLinkedList();

        System.out.println("\nReverse Linked List");
        names.reverse();
        names.printLinkedList();
    }
}
