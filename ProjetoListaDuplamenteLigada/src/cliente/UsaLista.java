package cliente;

/**
 *
 * @author kaio.ovenancio
 */
import lista.Lista;
import modelo.Pessoa;
public class UsaLista {
    
    public static void main (String [] args){
        Lista lista = new Lista();
        lista.inserir(new Pessoa ("Kaio", 19));
        lista.inserir(new Pessoa ("Dani", 20));
        lista.inserir(new Pessoa ("José", 50));
        lista.inserir(new Pessoa ("Maria", 60));
        //Exibindo os dados
        lista.exibir();
        
        //removendo
        System.out.println("Após remocão");
        if(lista.remover(3)){
            lista.exibir();
        }else{
            System.out.println("Não achou!!");
        }
    }
    
}
