package graph;

public class Vertex {
	// Attributs
	static int counterId = -1;
	private int id;
	private Object info;
	private Color color;


	public Vertex(Color color, Object info) {
		this.id = counterId++;
		this.info = info;
		this.color = color;
	}

	public int id() {
		return this.id;
	}
}