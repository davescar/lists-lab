import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean remove(int index) {
        if (size == 0) {
            return false;
        }
        if (index > size - 1) {
            return false;
        }
        if (index == 0) {
            head = head.getNext();
            return true;
        }
        Node prevNode = null;
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        prevNode.setNext(currentNode.getNext());
        return true;
    }


    public T get(int index) {
        if (size == 0) {
            return null;
        }
        if (index > size - 1) {
            return null;
        }
        Node refNode = head;
        for (int i = 0; i < index; i++) {
            refNode = refNode.getNext();
        }
        return (T) refNode.getData();
    }
    //to-do


    public void add(T obj) {
        if (head == null) {
            head = new Node<>(obj);
        } else {
            Node refNode = head;
            while (refNode.getNext() != null) {
                refNode = refNode.getNext();
            }
            refNode.setNext(new Node<>(obj));
        }
        size++;
    }


    //The methods below are bonus

    public void add(int index, T obj) {
        //to-do
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new MyIterator<T>(head);
    }

    private class MyIterator<T> implements Iterator<T> {

        private Node<T> node;

        public MyIterator(Node<T> node) {
            //to-do
        }

        @Override
        public boolean hasNext() {
            //to-do
        }

        @Override
        public T next() {
            //to-do
        }

        @Override
        public void remove() {
            // to-do

        }

    }
}
