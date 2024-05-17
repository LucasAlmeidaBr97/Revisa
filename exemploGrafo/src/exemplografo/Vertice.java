
package exemplografo;

import java.util.ArrayList;


public class Vertice<TIPO> {
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> aretasSaida;

    public Vertice(TIPO dado) {
        this.dado = dado;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.aretasSaida = new ArrayList<Aresta<TIPO>>();
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Aresta<TIPO>> getAretasSaida() {
        return aretasSaida;
    }

    public void setAretasSaida(ArrayList<Aresta<TIPO>> aretasSaida) {
        this.aretasSaida = aretasSaida;
    }
    
    public void adicionarArestaEntrada(Aresta<TIPO> aresta){
        this.arestasEntrada.add(aresta);
    }
    
    public void adicionarArestasSaida(Aresta<TIPO> aresta){
        this.aretasSaida.add(aresta);
    }

}
