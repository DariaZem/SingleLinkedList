
public class Node {
    private int value;
    private Node next;
    private Node tail;

    public Node() {
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;

    }

    public Node add(int element, Node tail) {
        if (tail.next == null) {
            tail.next = new Node(element, tail.next);
        } else {
            add(element, tail.next);
        }
        return tail;
    }


    public void insertInPosition(int element, int index, Node tail) {
        int count = 0;
        while (tail != null) {
            if (index == 0) {
                this.tail = new Node(element, tail);
                break;
            }
            if (index == count + 1) {
                tail.next = new Node(element, tail.next);
                count++;
            } else {
                tail = tail.next;
                count++;
            }
        }
    }

    public Node removeLast(Node tail) {
        while (tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;
        return tail;

    }

    public void removeByPosition(int index, Node tail) {
        Node curr = tail;
        int count = 1;
        if (index == 0) {
            this.tail = tail.getNext();
        }

        while (count < index) {
            curr = curr.getNext();
            count++;
        }
        curr.setNext(curr.getNext().getNext());
    }

    public boolean isEqual(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            return (tailA.value == tailB.value) && isEqual(tailA.next, tailB.next);
        } else {
            return tailA == tailB;
        }
    }

    public Node view(int... values) {
        for (int i = values.length - 1; i >= 0; i--) {
            tail = new Node(values[i], tail);
        }
        return tail;
    }

    public int size(Node tail) {
        return (tail == null) ? 0 : 1 + size(tail.next);
    }

    //Copying tailA in tailB
    public Node copy(Node tail) {
        return tail == null ? null : new Node(tail.value, copy(tail.next));
    }

    public String isGrowing(Node tail, int size) {
        int count = 0;
        while (count < size - 1) {
            if (tail.value < tail.next.value) {
                tail = tail.next;
                count++;
            } else {
                return "List isn't growing";
            }
        }
        return "List is growing";
    }

    public String toString(Node tail) {
        return (tail == null) ? "*" : tail.value + "->" + toString(tail.next);
    }


    public Node getNext() {
        return next;
    }

    public Node getTail() {
        return tail;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
