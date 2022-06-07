public class FilaComLimite<S> {
    private Node<S> head;
    private Node<S> tail;
    private int size;

    public FilaComLimite(int i) {
    }

    public boolean isEmpty() {
        if (this.head == null && this.tail == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (this.size >= 20) {
            return true;
        } else {
            return false;
        }
    }

    public S head() {
        if (isEmpty()) {
            return null;
        } else {
            return this.head.getData();
        }
    }

    public void enqueue(S senha) {
        if (isFull()) {
            System.out.println("Fila está cheia, Tente novamente mais tarde!");
        } else {
            Node<S> newNode = new Node<S>(senha);
            if (isEmpty()) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.setNext(newNode);
                this.tail = newNode;
            }
            this.size++;
        }
    }

    public S dequeue() {
        Node<S> aux = this.head;
        S senha;
        this.head = this.head.getNext();
        if (this.head == null) {
            this.tail = null;
        }
        senha = aux.getData();
        this.size--;
        return senha;
    }

    public int size() {
        return this.size;
    }
}
