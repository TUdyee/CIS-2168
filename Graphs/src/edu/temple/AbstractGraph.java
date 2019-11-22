package edu.temple;

/**
 * Abstract base class for graphs.
 * A graph is a set of vertices and a set of edges.
 * Vertices are represented by integers from 0 to n -1.
 * Edges are ordered pairs of vertices.
 */
public abstract class AbstractGraph implements Graph {
	private int numberOfVertices;
	private boolean directed;

	public AbstractGraph(int numberOfVertices, boolean directed) {
		this.numberOfVertices = numberOfVertices;
		this.directed = directed;
	}

	@Override
	public int getNumberOfVertices() {
		return numberOfVertices;
	}

	@Override
	public boolean isDirected() {
		return directed;
	}


}
