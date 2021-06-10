/*
import groovy.transform.ToString

@ToString
class Node<T> {
    T value
    Node next = null
    Node previous = null
}

class DoubleLinkedList<T> {
    private Node head = null
    private Node tail = null
    // push/insert to tail
    void push(T value) {
        Node pTail = tail
        if (!tail) { // empty list
            head = tail = new Node(value: value)
        } else { // new node at end
            tail = pTail.next = new Node(value: value, previous: pTail)
        }
    }
    // pop/remove from tail
    T pop() {
        if (head == tail) {
            head = null
        } else {
            tail?.previous?.next = null
        }
        T value = tail?.value
        tail = tail?.previous
        value
    }
    // remove from head
    T shift() {
        if (head == tail) {
            tail = null
        } else { // remove from head
            head?.next?.previous = null
        }
        T value = head?.value
        head = head?.next
        value
    }

    // push/insert to head
    void unshift(T value) {
        Node pHead = head
        if (!head) { // empty list
            head = tail = new Node(value: value)
        } else {
            head = head.previous = new Node(value: value, next: pHead)
        }
    }

}



*/


class DoubleLinkedList<T> {
    Node back, front

    void push(T value) {
        back = back ? back >> value : (front = new Node(value: value))
    }

    void unshift(T value) {
        front = front ? front << value : (back = new Node(value: value))
    }

    T pop() {
        if (back.next == null) front = null
        (back++).value
    }

    T shift() {
        if (front.prev == null) back = null
        (front--).value
    }

     class Node<T> {
        T value
        Node prev, next

        Node rightShift(T value) {
            prev = new Node(next: this, value: value)
        }

        Node leftShift(T value) {
            next = new Node(prev: this, value: value)
        }

        Node next() {
            next?.prev = null
            next
        }

        Node previous() {
            prev?.next = null
            prev
        }
    }
}