package exe13;
import java.util.ArrayList;

public class Tv {

	protected boolean mute = false;
	protected boolean ligado = false;
	protected Canal canal1;
	protected int canal;
	protected ArrayList<Canal> canais;
	protected int volume = 45;
	
	public Tv () {
		canais = new ArrayList<Canal>();
	}
	
	public boolean isMute() {
		return mute;
	}
	public void setMute(boolean mute) {
		this.mute = mute;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(Canal canal) {
		this.canal1 = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void addCanal(Canal a) {
		canais.add(a);
	}
	
}
