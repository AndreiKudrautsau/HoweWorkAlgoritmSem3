public class LinkList<T>{
	public Node head;
	public class Node{
		public Node next;
		public T value;

	}
	public void addFirst(T value){
		Node node = new Node();
		node.value = value;
		if(head != null){
			node.next = head;
		}
		head = node;
	}

	public void removeFirst(T value){
		if(head != null){
			head = head.next;
		}
	}

	public String toString() {
		StringBuilder build = new StringBuilder();
		Node node = head;
		while ( node != null){
			build.append(node.value);
			build.append("\n");
			node = node.next;
		}
	return  build.toString();
	}

	public void reverse() {
		Node previous = null;
		Node current = head;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}


	public void setHead(Node head) {
		this.head = head;
	}
}

