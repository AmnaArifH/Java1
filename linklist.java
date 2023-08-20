class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }
}

class Node {
    Square square;
    Node next;

    public Node(Square square) {
        this.square = square;
        this.next = null;
    }
}

class LinkedListOfSquares {
    Node head;

    public LinkedListOfSquares() {
        head = null;
    }

    public void insert(Square square) {
        Node newNode = new Node(square);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println("Square with side length: " + current.square.getSideLength());
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListOfSquares squareList = new LinkedListOfSquares();

        Square square1 = new Square(4.0);
        Square square2 = new Square(6.0);
        Square square3 = new Square(8.0);

        squareList.insert(square1);
        squareList.insert(square2);
        squareList.insert(square3);

        squareList.display();
    }
}

