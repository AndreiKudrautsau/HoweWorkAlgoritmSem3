public class Main {
	public static void main(String[] args) {
		LinkList<Example> linkList1 = new LinkList();
		linkList1.addFirst(new Example("a", 1));
		linkList1.addFirst(new Example("b", 2));
		linkList1.addFirst(new Example("c", 3));
		linkList1.addFirst(new Example("d", 4));
		System.out.println(linkList1);
		System.out.println("-".repeat(10) + "\n" + "Reversed list:");
		linkList1.reverse();
		System.out.println(linkList1);
	}
}