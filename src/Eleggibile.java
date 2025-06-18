
public abstract class Eleggibile extends Object{
	private String nome;
	private int nVoti;
	
	public Eleggibile(String nome, int nVoti) {
		this.nome=nome;
		this.nVoti=nVoti;
	}
	public String getNome() {
		return this.nome;
	}
	public int getnVoti() {
		return this.nVoti;
	}
	public void setnVoti(int nVoti) {
		this.nVoti=nVoti;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Eleggibile) {
			Eleggibile other = (Eleggibile) obj;
			return this.nome.equals(other.nome) && this.nVoti == other.nVoti;
		}
		return false;
	}
	@Override
	public int hashCode() {
	    return nome.hashCode() + 31 * nVoti;
	}
}
