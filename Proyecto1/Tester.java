package Proyecto1;

public class Tester {
	
	public static void main (String args[]) {
				
		Graph grafo = new Graph();
		
		
		// Agregamos los nodos
		
		System.out.println("Agregamos el 1: ");
		grafo.addNode(1);
		System.out.println("Agregamos el 2: ");
		grafo.addNode(2);
		System.out.println("Agregamos el 3: ");
		grafo.addNode(3);
		System.out.println("Agregamos el 4: ");
		grafo.addNode(4);
		System.out.println("Agregamos el 1: ");
		grafo.addNode(1);
		System.out.println("Agregamos el 5: ");
		grafo.addNode(5);
		System.out.println("Agregamos el 6: ");
		grafo.addNode(6);
		System.out.println("Agregamos el 7: ");
		grafo.addNode(7);
		
		
		//Agregamos los arcos 
		
		System.out.println("Agregamos el arco 0 - 1 : ");
		grafo.addEdge(0, 1);
		System.out.println("Agregamos el arco 1 - 3 : ");
		grafo.addEdge(1, 3);
		System.out.println("Agregamos el arco 1 - 2 : ");
		grafo.addEdge(1,2);
		System.out.println("Agregamos el arco 2 - 4 : ");
		grafo.addEdge(2,4);
		System.out.println("Agregamos el arco 2 - 6 : ");
		grafo.addEdge(2, 6);
		System.out.println("Agregamos el arco 3 - 6 : ");
		grafo.addEdge(3, 6);		
		System.out.println("Agregamos el arco 25 - 2 : ");
		grafo.addEdge(25, 2);
		System.out.println("Agregamos el arco 5 - 5 : ");
		grafo.addEdge(5, 5);
		
		// Eliminamos algunos nodos
		
		System.out.println("Eliminamos el 4:");
		grafo.removeNode(4);
		System.out.println("Eliminamos el 6:");
		grafo.removeNode(6);
		System.out.println("Eliminamos el 8:");
		grafo.removeNode(8);
		
		// Eliminamos algunos arcos
		
		System.out.println("Eliminamos el arco 1 - 3:");
		grafo.removeEdge(1,3);
		System.out.println("Eliminamos el arco 2 - 4:");
		grafo.removeEdge(2,4);
		System.out.println("Eliminamos el arco 3 - 6:");
		grafo.removeEdge(3,6); 
		System.out.println("Eliminamos el arco 8 - 4:");
		grafo.removeEdge(8,4);
		
	
	}

}
