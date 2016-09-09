
public class PilhaDinamica {
	public Node top;
	
	public PilhaDinamica(){
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		int counter=0;
		Node aux = top;
		while(aux!=null) {
			counter++;
			aux = aux.reference;
		}
		return counter;
	}
	
	public void push(char value) {
		Node novo = new Node(value);
		novo.reference = top;
		top = novo;
	}
	
	public char pop() {
		if(!isEmpty()) {
			Node aux = top;
			top = top.reference;
			aux.reference = null;
			return aux.value;
		}
		return ' ';
	}
}