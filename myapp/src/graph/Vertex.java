package graph;

public class Vertex {
	// Attributs
	static int counterId = 0;
	public int id;
	private Object info;
	private Color color;


	public Vertex(Color color, Object info) {
		this.id = counterId++;
		this.info = info;
		this.color = color;
	}
}