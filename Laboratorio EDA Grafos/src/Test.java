
public class Test {

	public static void main(String[] args) {
		GraphLink<String> g = new GraphLink<String>();
		
		g.insertVertex("Lima");
		g.insertVertex("Aqp");
		g.insertVertex("Cusco");
		g.insertVertex("Piura");
		g.insertVertex("Tarapoto");
		
		g.insertEdge("Lima", "Aqp");
		g.insertEdge("Cusco", "Aqp");
		g.insertEdge("Piura", "Lima");
		g.insertEdge("Cusco", "Lima");
		g.insertEdge("Piura", "Tarapoto");
		
		System.out.println("Grafo ciudades: /n"+g);
			

	}

}
