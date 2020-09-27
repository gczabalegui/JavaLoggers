package Proyecto1;

public class Edge { 
	
	private int verticeSucesor; 
	private int verticePredecesor; 
	

	public Edge(int verticeSucesor, int verticePredecesor) {
		
		this.verticeSucesor = verticeSucesor;
		this.verticePredecesor = verticePredecesor;
	}


	public void setVerticeSucesor(int verticeSucesor) {
		this.verticeSucesor = verticeSucesor;
	}
	
	public void setVerticePredecesor(int verticePredecesor) {
		this.verticePredecesor = verticePredecesor;
	}	
	
	public int getVerticeSucesor() {
		return verticeSucesor;
	}
	
	public int getVerticePredecesor() {
		return verticePredecesor;
	}
	

}
