
package exemplografo;

public class ExemploGrafo {

    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleuza");
        grafo.adicionarVertice("Kleber");
        grafo.adicionarVertice("Claudio");
        
        grafo.adicionarAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionarAresta(2.0, "Lorenzo", "Kleber");
        grafo.adicionarAresta(2.0, "Kleber", "Cleuza");
        grafo.adicionarAresta(2.0, "Paulo", "Cleuza");
        grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
        grafo.adicionarAresta(2.0, "Claudio", "Paulo");
    
        grafo.BuscaEmLargura();
    }
    
}
