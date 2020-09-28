package Proyecto1;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator; 

// Clase que modela un grafo dirigido no pesado.

public class Graph {
	
	private Map<Integer, Integer> nodos; 
	private Map<String, Edge> arcos; 

	private static Logger logger; 	
	
	public Graph() {
		
		nodos = new HashMap<Integer, Integer>(); 
		arcos = new HashMap<String, Edge>(); 		
		
		if(logger == null) {
		
			logger = Logger.getLogger(Graph.class.getName());	
			
			Handler hnd = new ConsoleHandler(); 			
			hnd.setLevel(Level.FINE);			
			logger.addHandler(hnd); 	
			
			logger.setLevel(Level.WARNING);		
			
			Logger rootLogger = logger.getParent();			
			for (Handler h : rootLogger.getHandlers()) {
				
				h.setLevel(Level.OFF);
				
			}
		}		
	}
	
	
	// Agrega el nodo “node” al grafo, si aún no pertenecía a la estructura. 
	
	public void addNode(int node) {

		if(this.nodos.containsKey(node)) 			
			logger.warning("El nodo ya está en el grafo");
		else {
		
			nodos.put(node, node);
			logger.info("El nodo se ha agregado correctamente");
			
		}		
	}
	
	
	// Remueve el nodo “node” del grafo, si el parámetro es un nodo de la estructura.
	
	public void removeNode(int node) {
		
		if(this.nodos.containsKey(node)) {
			
			Object[] values = arcos.values().toArray(); 
			Edge arco = null; 
			for(int i= 0; i<values.length; i++) {
				
				arco = (Edge) values[i];
				if (arco != null) {
				
					if(arco.getVerticePredecesor() == node){
						
						String key =arco.getVerticeSucesor()+" - "+node;
						arcos.remove(key);
	
					}			
					else if(arco.getVerticeSucesor() == node) {
						
						String key =node+" - "+arco.getVerticePredecesor();
						arcos.remove(key);
						
					}	
				}	
			}
			nodos.remove(node); 
			logger.info("El nodo se ha eliminado correctamente."); 		
		}
		else
			logger.warning("El nodo no pertenece al grafo.");			
	} 
	
	
	
	// Agrega un arco entre el nodo “node1” y el nodo “node2”, si aún no existía el arco y ambos parámetros son nodos pertenecientes a la estructura.
	
	public void addEdge(int node1, int node2){
		
		
		boolean estaN1 = this.nodos.containsKey(node1); 
		boolean estaN2 = this.nodos.containsKey(node2); 	
		
		if(!estaN1) {
				
			logger.warning("El grafo no contiene al nodo1.");
			logger.info("Agregue el nodo al grafo, para luego poder crear el arco.");
		}		
		else if(!estaN2) {
				
			logger.warning("El grafo no contiene al nodo2.");
			logger.info("Agregue el nodo al grafo, para luego poder crear el arco.");
			
		}
		else {
			
			Edge arco = new Edge(node1, node2);
			String key = node1 + " - " + node2; 
			Edge value = this.arcos.put(key, arco);  
				
			if(value != null)			
				logger.warning("El grafo ya tenía un arco para unir los nodos.");				
					
			else
				logger.info("Se ha agregado correctamente el arco."); 		
		}		
	}
	
	
	// Remueve el arco entre el nodo “node1” y el nodo “node2”, si el arco formado por los parámetros pertenecen a la estructura. 
	
	public void removeEdge(int node1, int node2) {
		
		boolean estaN1 = this.nodos.containsKey(node1); 
		boolean estaN2 = this.nodos.containsKey(node2); 
		
		if(!estaN1) {		
			
			logger.warning("El grafo no contiene al nodo1.");	
			logger.info("Agregue el nodo al grafo para continuar operando.");		
		}	
		else if(!estaN2) { 			
			logger.warning("El grafo no contiene al nodo2."); 
			logger.info("Agregue el nodo al grafo para continuar operando.");	
		}
		else {
			
			String key = node1 + " - " + node2;  
			if(this.arcos.containsKey(key)){
				
				arcos.remove(key);
				logger.info("Se ha eliminado el arco correctamente."); 	
				
			}		
			else 
				logger.warning("No se ha encontrado el arco que une los vértices.");
			
		}
	}
	

	
}
