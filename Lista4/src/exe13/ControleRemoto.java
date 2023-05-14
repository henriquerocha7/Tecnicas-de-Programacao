package exe13;


public class ControleRemoto {

	protected Tv tv;
	public ControleRemoto (Tv tv) {
		this.tv = tv;
	}
	
	public void ligar() {
		tv.ligado = true; 
	}
	public void desligar() {
		tv.ligado = false;
	}
	
	public void aumentarVolume() {
		if(tv.ligado && tv.volume <= 99)
			tv.volume++;
		}
	public void diminuirVolume() {
		if(tv.ligado && tv.volume >= 1)
			tv.volume--;
	}
	
	public void aumentarCanal() {
		if(tv.canal < tv.canais.size())
			tv.canal++;
	}
	public void diminuirCanal() {
		if(tv.canal < tv.canais.size()) {
			tv.canal--;
		}
	}
	public void alterarCanal(Canal canal) {
		if(tv.canais.contains(canal))
		tv.setCanal(canal);
		else {
			System.out.println("Canal não encontrado.");
		}
	}
	
	public String info() {
		return "Canal: " +tv.canal1.nome+ " Volume: " +tv.volume;
	}
	
	public void mute() {
		if(tv.mute == false) {
			tv.volume = 0;
			tv.mute = true;
		}else {
			tv.volume = 50;
		}
	}
	
}
