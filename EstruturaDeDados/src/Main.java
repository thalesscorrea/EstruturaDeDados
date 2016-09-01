
public class Main {
	public static void main(String[] args) {
		TipoAbstratoDeDado dado = new TipoAbstratoDeDado(10, 2);
		dado.apresenta();
		dado.soma(10, 3);
		dado.multiplica(10, 2);
		dado.compara(11, 2);
		dado.compara(9, 2);
	}
}