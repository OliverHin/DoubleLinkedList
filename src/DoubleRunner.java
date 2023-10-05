public class DoubleRunner {
    public static void main(String[] args) {
        DoubleLinky dll = new DoubleLinky();
        dll.insertFirst(1);
        dll.insertFirst(6);
        dll.insertFirst(8);
        dll.insertFirst(3);
        dll.print();

        System.out.println();

        dll.insertLast(99);
        dll.print();

        System.out.println();

        dll.insertAt(2,66);
        dll.print();

        System.out.println();

        dll.findValue(8);

        System.out.println();

        dll.insertAfterValue(66,77);
        dll.print();
        System.out.println();
        dll.get(4);
        System.out.println();
        dll.remove(3);
        dll.print();
    }
}
