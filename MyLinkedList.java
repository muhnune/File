package LinkedList;

import algodatb2023.hewan.*;

//push test github restuss

public class MyLinkedList {
    private MyNode head = null;
    private MyNode tail = null;
    private Mynode current = null;

    public void add(MyNode node) {
        // jika linkedList masih kosong
        if (head == null) {
            head = node;
            tail = node;
            current = node;+
        } else {
            tail.setNext(node);
            tail = node;
            node.setNext(null);
        }
    }

    public MyNode getHead() {
        return this.head;
    }

    public void cetak() {
        MyNode p = this.head;
        while (p.getNext() != null) {
            Hewan x = p.getElemen();
            System.out.println(x.getNama());
            p = p.getNext();
        }
        Hewan x = p.getElemen();
        System.out.println(x.getNama());
        //hahahaa mampus
    }
}