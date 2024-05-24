
package rotas;

public class Aresta {
    private Double peso; //Distancia 
    private Vertice origem, destino;// Vertices(Esquinas)

    public Aresta(Double peso, Vertice origem, Vertice destino) {
        this.peso = peso;
        this.origem = origem;
        this.destino = destino;
    }
    
    public Double getPeso() {
        return peso;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Vertice getDestino() {
        return destino;
    }
   
}
