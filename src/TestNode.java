
public class TestNode {
    public static void main(String[] args) {
        Node object = new Node();
        Node tailA = object.view(45, 46, 47, 48);
        Node tail = object.getTail();
        object.add(100, tail);
        object.add(200, tail);
        object.insertInPosition(40, 0, tail);
        object.removeLast(tail);
        object.removeByPosition(1, tail);
        System.out.println(object.toString(tail));
        System.out.println("Size = " + object.size(tail));
        //Creating new list(copy tailA);
        Node tailB = object.copy(tailA);
        System.out.println(object.isEqual(tail, tailB));
        System.out.println(object.isGrowing(tail, object.size(tail)));
    }
    }
