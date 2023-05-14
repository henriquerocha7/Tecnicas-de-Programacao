package exe13;

public class Main {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		ControleRemoto c = new ControleRemoto(tv);
		
		Canal a = new Canal(1, "Globo");
		tv.addCanal(a);
		Canal b = new Canal(2, "TNT");
		tv.addCanal(b);
		Canal d = new Canal(3, "SBT");
		tv.addCanal(d);
		
		c.ligar();
		c.aumentarVolume();
		c.aumentarVolume();
		c.diminuirVolume();
		c.alterarCanal(b);
		System.out.println(c.info());
		
	}

}
