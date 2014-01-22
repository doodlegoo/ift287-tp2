
public class Carte implements Comparable<Carte>{

	private String ClefId;
	public String getClefId() {
		return ClefId;
	}
	public void setClefId(String clefId) {
		ClefId = clefId;
	}
	
	@Override
	public int compareTo(Carte n) {
		return n.ClefId.compareTo(this.ClefId) ;
	}

}
