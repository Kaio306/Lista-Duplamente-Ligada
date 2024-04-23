package lista;

/**
 *
 * @author kaio.ovenancio
 */
public class Lista {
    
    private Celula inicio, atual, aux;
    
    public boolean isListaVazia(){
        return inicio == null;
    }
    
    public void inserir(Object objeto){
        
        if(isListaVazia()){
            inicio = new Celula(null, null, objeto);
            aux = inicio;
        }
        
        else{
            atual = new Celula(aux, null, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }
    
    public void exibir(){
        
        Celula c = atual;
        
        while (c != null){
            System.out.println(c.getDados());
            c = c.getAnt();
        }
    }
    
}
