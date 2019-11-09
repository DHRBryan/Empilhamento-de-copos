package app;

public class Copo{
    private Object elemento;    //Onde ficarão guardadas as informações 
    private Copo proximo;       //Ponteiro ligando os elementos da pilha

    public Copo(Object novoElemento){
        this.elemento = novoElemento;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Copo getProximo() {
        return proximo;
    }

    public void setProximo(Copo proximo) {
        this.proximo = proximo;
    }

    
}