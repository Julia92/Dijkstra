import static org.junit.Assert.assertEquals;


public class Test {

	public void test(Graph grafo) {
		 assertEquals("[H, F, B]", grafo.getShortestPath('A', 'H').toString());
		 assertEquals("[H, A, B]", grafo.getShortestPath('A', 'H').toString());
	}

}
