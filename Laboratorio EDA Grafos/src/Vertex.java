
public class Vertex <E>{
	protected E data;
	protected ListLinked<Edge<E>> listAdj;
	public Vertex(E data1) {
		this.data = data1;
		listAdj = new ListLinked<Edge<E>>();
	}
	public boolean equals(Object o) {
		if (o instanceof Vertex<?>) {
			Vertex<E> v = (Vertex<E>)o;
			return this.data.equals(v.data);
		}
		return false;
	}
	public String toString() {
		return this.data+" -->"+this.listAdj.toString()+"\n";
	}
}
