
package rotas;

import java.util.ArrayList;

public class Grafo {
    ArrayList<Vertice> vertices; 
    ArrayList<Aresta> arestas;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }
    
    
    
    public void adiconarVertices(int id, String nome){
        Vertice novaVertice = new Vertice(id, nome);
        vertices.add(novaVertice);
    }
    
    public void adicionarArestas(Double peso, Vertice origem, Vertice destino){
        int idOrigem = origem.getId();
        int idDestino = destino.getId();
        Vertice inicio = getVertice(origem.getId());
        Vertice fim = getVertice(destino.getId());
        Aresta aresta = new Aresta(peso, origem, destino);
        inicio.adicionarArestaEntrada(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    
    public Vertice getVertice(int id){
        Vertice vertice = null;
        for(int i = 0; i < vertices.size(); i++){
            if(vertices.get(i).getId() == id){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    
}
