
public class Partito extends Eleggibile{
	
	public Partito(String nome) {
		super(nome, 0);
	}
	public void vota() {
		setnVoti(getnVoti()+1);
	} 
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Partito) {
			Partito other = (Partito) obj;
			return this.getNome().equals(other.getNome()) && this.getnVoti() == other.getnVoti();
		}
		return false;
	}
}
