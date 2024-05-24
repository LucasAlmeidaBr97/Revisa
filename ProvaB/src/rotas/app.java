
package rotas;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(); //instancia classe grafo
        
        String[] nomeVertices ={"A","B","C","D","E", //nome de todos os vertices
            "F","G","H","I","J","K","L","M","N",
            "O","P","Q","R","S","T","U","V","X"};
                                  //20   21    22                          
        List<Vertice> vertices = new ArrayList<>();
        
        for(int i = 0; i < nomeVertices.length; i++){ //adiciona vertices com id e nomes no grafo
            grafo.adiconarVertices(i, nomeVertices[i]);
            vertices.add(grafo.getVertice(i));
        } 
       
       grafo.adicionarArestas(300.0, vertices.get(0), vertices.get(1));//A e B
       grafo.adicionarArestas(370.0, vertices.get(0), vertices.get(21));//A e V
       grafo.adicionarArestas(317.0, vertices.get(0), vertices.get(22));//A e X
       
       grafo.adicionarArestas(300.0, vertices.get(1), vertices.get(0));//B e A
       grafo.adicionarArestas(47.0, vertices.get(1), vertices.get(2));//B e C
       
       grafo.adicionarArestas(47.0, vertices.get(2), vertices.get(1));//C e B 
       grafo.adicionarArestas(62.00, vertices.get(2), vertices.get(3));//C e D
       grafo.adicionarArestas(141.0, vertices.get(2), vertices.get(7));//C e H
       
       grafo.adicionarArestas(62.0, vertices.get(3), vertices.get(2));//D e C
       grafo.adicionarArestas(8.0, vertices.get(3), vertices.get(4));//D e E 
       
       grafo.adicionarArestas(8.0, vertices.get(4), vertices.get(3));//E e D
       grafo.adicionarArestas(13.0, vertices.get(4), vertices.get(5));//E e F 
       grafo.adicionarArestas(230.0, vertices.get(4), vertices.get(6));//E e G

       grafo.adicionarArestas(13.0, vertices.get(5), vertices.get(4));//F e E
       
       grafo.adicionarArestas(230.0, vertices.get(6), vertices.get(4));//G e E
       
       grafo.adicionarArestas(141.0, vertices.get(7), vertices.get(2));//H e C
       grafo.adicionarArestas(138.0, vertices.get(7), vertices.get(8));//H e I
       
       grafo.adicionarArestas(138.0, vertices.get(8), vertices.get(7));//I e H
       grafo.adicionarArestas(153.0, vertices.get(8), vertices.get(9));//I e J  
       
       grafo.adicionarArestas(153.0, vertices.get(9), vertices.get(8));//J e I 
       grafo.adicionarArestas(512.0, vertices.get(9), vertices.get(10));//J e K 
       
       grafo.adicionarArestas(512.0, vertices.get(10), vertices.get(9));//K e J
       grafo.adicionarArestas(135.0, vertices.get(10), vertices.get(11));//K e L 
       
       
       grafo.adicionarArestas(135.0, vertices.get(11), vertices.get(10));//L e K 
       grafo.adicionarArestas(15.0, vertices.get(11), vertices.get(12));//L e M 
       grafo.adicionarArestas(187.0, vertices.get(11), vertices.get(13));//L e N
       
       grafo.adicionarArestas(15.0, vertices.get(12), vertices.get(11));//M e L 
       
       grafo.adicionarArestas(187.0, vertices.get(13), vertices.get(11));//N e L
       grafo.adicionarArestas(108.0, vertices.get(13), vertices.get(14));//N e O 
       
       grafo.adicionarArestas(108.0, vertices.get(14), vertices.get(13));//O e N 
       grafo.adicionarArestas(82.0, vertices.get(14), vertices.get(15));//O e P 

       grafo.adicionarArestas(82.0, vertices.get(15), vertices.get(14));//P e O
       grafo.adicionarArestas(215.0, vertices.get(15), vertices.get(16));//P e Q 
       
       grafo.adicionarArestas(215.0, vertices.get(16), vertices.get(15));//Q e P
       grafo.adicionarArestas(97.0, vertices.get(16), vertices.get(17));//Q e R
       
       grafo.adicionarArestas(97.0, vertices.get(17), vertices.get(16));//R e Q 
       grafo.adicionarArestas(33.0, vertices.get(17), vertices.get(18));//R e S 
       grafo.adicionarArestas(43.0, vertices.get(17), vertices.get(19));//R e T 
       
       grafo.adicionarArestas(33.0, vertices.get(18), vertices.get(17));//S e R 
       grafo.adicionarArestas(207.0, vertices.get(18), vertices.get(19));//S e T
       grafo.adicionarArestas(38.0, vertices.get(18), vertices.get(21));//S e V
       
       grafo.adicionarArestas(207.0, vertices.get(19), vertices.get(18));//T e S
       grafo.adicionarArestas(43.0, vertices.get(19), vertices.get(17));//T e R
       grafo.adicionarArestas(22.0, vertices.get(19), vertices.get(20));//T e U 
       
       grafo.adicionarArestas(22.0, vertices.get(20), vertices.get(19));//U e T
       grafo.adicionarArestas(210.0, vertices.get(20), vertices.get(21));//U e V
       grafo.adicionarArestas(107.0, vertices.get(20), vertices.get(22));//U e X
       
       grafo.adicionarArestas(38.0, vertices.get(21), vertices.get(18));//V e S
       grafo.adicionarArestas(210.0, vertices.get(21), vertices.get(20));//V e U
       grafo.adicionarArestas(370.0, vertices.get(21), vertices.get(0));//V e A 
       
       grafo.adicionarArestas(107.0, vertices.get(22), vertices.get(20));//X e U
       grafo.adicionarArestas(317.0, vertices.get(22), vertices.get(0));//X e A 
        
    }
}
