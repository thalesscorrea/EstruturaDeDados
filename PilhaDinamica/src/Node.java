
public class Node {
	public char value;
	public Node reference;
	
	public Node(char value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
