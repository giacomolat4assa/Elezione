import java.util.Iterator;
public class Coalizione extends Eleggibile implements Iterable<Partito>{
	
	private Partito partiti[];
	
	public Coalizione(String nome, Partito partiti[]){
		super(nome, sommaVoti(partiti));
		this.partiti = partiti;
	}
	
	private static int sommaVoti(Partito partiti[]) {
		int somma = 0;
		for (Partito p : partiti) {
			somma += p.getnVoti();
		}
		return somma;
	}
	@Override
	public int getnVoti() {
		return sommaVoti(this.partiti);
	}
	
	  @Override
	    public Iterator<Partito> iterator() {
	        return new Iterator<Partito>() {
	            private int index = 0;

	            @Override
	            public boolean hasNext() {
	                return index < partiti.length;
	            }

	            @Override
	            public Partito next() {
	                return partiti[index++];
	            }
	        };
	    }
	  
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Coalizione) {
			Coalizione other = (Coalizione) obj;
			if(this.getNome().equals(other.getNome())) {
				if (this.partiti.length == other.partiti.length) {
					  for (int i = 0; i < this.partiti.length; i++) {
					        if (!this.partiti[i].equals(other.partiti[i]))
					            return false;
					    }
					  return true;
				}   
			}
		}
		return false;
	}
}
