
package rotas;

import java.util.ArrayList;

public class Vertice {
    private int id;
    private String nome; //Esquinas 
    private ArrayList<Aresta> entrada, saida;

    public Vertice(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.entrada = new ArrayList();
        this.saida = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aresta> getEntrada() {
        return entrada;
    }

    public ArrayList<Aresta> getSaida() {
        return saida;
    }
    
        public void adicionarArestaEntrada(Aresta e){
        entrada.add(e);
    }
    
    public void adicionarArestaSaida(Aresta s){
        saida.add(s);
    }
    
}
