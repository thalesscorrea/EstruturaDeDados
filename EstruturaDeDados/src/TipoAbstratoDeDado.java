
public class TipoAbstratoDeDado {
	private int dividendo;
	private int divisor;
	
	public TipoAbstratoDeDado(int dividendo, int divisor) {
		this.dividendo = dividendo/this.mdc(dividendo, divisor);
		this.divisor = divisor/this.mdc(dividendo, divisor);
	}
	
	public void apresenta(){
		System.out.println(this.dividendo + "/" + this.divisor);
	}
	
	public void soma(int dividendo, int divisor){
		int dividendo2 = this.dividendo*divisor + this.divisor*dividendo/this.mdc(this.dividendo*divisor + this.divisor*dividendo, this.divisor*divisor);
		int divisor2 = this.divisor*divisor/this.mdc(this.dividendo*divisor + this.divisor*dividendo, this.divisor*divisor);
		int dividendo3 = dividendo2/this.mdc(dividendo2, divisor2);
		int divisor3 = divisor2/this.mdc(dividendo2, divisor2);
		System.out.println(dividendo3 + "/" + divisor3);
	}
	
	public void multiplica(int dividendo, int divisor){
		dividendo = this.dividendo*dividendo;
		divisor = this.divisor*divisor;
		int mdc = this.mdc(dividendo, divisor);
		dividendo = dividendo/mdc;
		divisor = divisor/mdc;
		System.out.println(dividendo + "/" + divisor);
	}
	
	public void compara(int dividendo, int divisor){
		double valor1 = (double)this.dividendo/this.divisor;
		double valor2 = (double)dividendo/divisor;
		if(valor1>valor2){
			System.out.println("0");
		}
		if(valor1<valor2){
			System.out.println("1");
		}
	}
	
	private int mdc(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return mdc(y, x % y);
		}
	}
}
