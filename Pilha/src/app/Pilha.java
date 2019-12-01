package app;

public class Pilha{
    private Copo topo;
    private int posicaoPilha;

    public Pilha(){
        this.posicaoPilha = -1;       //Posição que define o topo da pilha
    }

    public boolean pilhaVazia(){
        if(this.posicaoPilha == -1){  //Se a posição do topo for -1 então está vazia
            return true;
        }
        return false;
    }

    public int tamanho(){
        if(this.pilhaVazia()){
            return 0;
        }
        return this.posicaoPilha + 1;  //Se a pilha não está vazia o tamanho será a posição do topo +1
    }

    public Object retornaTopo(){
        if(this.pilhaVazia()){
            return null;
        }
        return this.topo.getElemento();  //Retorna o valor que está contido no topo da pilha
    }

    public void desempilhar(){
        if(this.tamanho() == 0){
            System.out.println("Vazia");
        }  
        topo = topo.getProximo();       //O topo da pilha recebe seu próximo elemento logo abaixo
        this.posicaoPilha--;            //Decrementa a posição do topo da fila
    }

    public void empilhar(Object atributo){
        Copo novoCopo = new Copo(atributo);     //Cria um objeto para inserir no topo da pilha
        novoCopo.setProximo(this.topo);         //Faz o ponteiro do próximo apontar para o topo
        topo = novoCopo;                        //Transforma o objeto no novo topo
        this.posicaoPilha++;                    //Incrementa a posição do topo da pilha
    }
    
}