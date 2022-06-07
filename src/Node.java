class Node <S> {
    private S data;
    private Node<S> next;

    public Node(S data) {
        this.data = data;
    }

    public S getData() {
        return data;
    }

    public void setData(S data) {
        this.data = data;
    }

    public Node<S> getNext() {
        return next;
    }

    public void setNext(Node<S> next) {
        this.next = next;
    }
}
