
public class Main {
	public static void main(String[] args) {
		PilhaDinamica wcm = new PilhaDinamica();
		wcm.push('a');
		wcm.push('a');
		wcm.push('c');
		wcm.push('a');
		wcm.push('a');
		System.out.println(compare(wcm));
	}
	
	public static boolean compare(PilhaDinamica wcm) {
		PilhaDinamica aux = new PilhaDinamica();
		boolean answer = false;
		
		while(wcm.top.value != 'c' && !wcm.isEmpty()){
			aux.push(wcm.pop());
		}
		if(!wcm.isEmpty()) {
			wcm.pop();
		}
		
		while(!wcm.isEmpty() && !aux.isEmpty()){
			if(wcm.top.value == aux.top.value) {
				answer = true;
			} else {
				answer = false;
			}
			wcm.pop();
			aux.pop();
		}
		if(!wcm.isEmpty() || !aux.isEmpty()) {
			answer = false;
		}
		return answer;
	}
}
