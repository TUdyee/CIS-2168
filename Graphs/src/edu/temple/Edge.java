package edu.temple;

import java.util.Objects;

/**
 * An Edge represents a relationship between two
 * vertices.
 */
public class Edge {
	private int source;
	private int dest;
	private double weight;

	public Edge(int source, int dest) {
		this.source = source;
		this.dest = dest;
		weight = 1.0;
	}

	public Edge(int source, int dest, double weight) {
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}

	public int getSource() {
		return source;
	}

	public int getDest() {
		return dest;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Edge{");
		sb.append("source=").append(source);
		sb.append(", dest=").append(dest);
		sb.append(", weight=").append(weight);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Edge) {
			Edge edge = (Edge) obj;
			return source == edge.source && dest == edge.dest;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(source, dest);
	}
}
