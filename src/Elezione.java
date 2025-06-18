
public class Elezione {
	private Coalizione coalizioni[];
	private int size;
	private int capacity;
	
    private void enlarge() {
        capacity *= 2;
        Coalizione[] newCol = new Coalizione[capacity];
        for (int i = 0; i < size; i++) {
        	newCol[i] = coalizioni[i];
        }
        coalizioni = newCol;
    }
	
	public Elezione() {
		this.size = 0;
		this.capacity = 10;
		this.coalizioni = new Coalizione[size];
	}
	
	public void add(Coalizione col) {
		for (int i = 0; i < size; i++) {
			if(col==coalizioni[i])
				throw new RuntimeException("Coalizione già iscritta all'elezione.");
		}
		if(size==capacity)
			enlarge();
		coalizioni[size++] = col;
	}
	
	public Coalizione winner() {
		if(size == 0)
			return null;
		Coalizione vincitore = this.coalizioni[0];
		for (int i = 0; i < size; i++) {
			if(vincitore.getnVoti() < coalizioni[i].getnVoti())
				vincitore = coalizioni[i];
		}
		return vincitore;
	}
	
}
