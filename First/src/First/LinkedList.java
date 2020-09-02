package First;

public class LinkedList {
	Node head;
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		if(head == null) {
			head = node;
			}
		else {
			Node n = head;
		
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = node;
		
	}}
	public void addat(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;}
	public void show() {
		// TODO Auto-generated method stub
Node node = head;
while(node.next != null  ) {
	System.out.println(node.data);
	node = node.next;
}
System.out.println(node.data);
	}

}
