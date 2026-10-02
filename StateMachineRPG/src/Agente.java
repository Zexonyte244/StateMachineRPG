public abstract class Agente {

    private final String nome;
    private int vida;

    private final Luta luta;

    private Estado estadoAtual;

    protected Agente(String nome, Luta luta, int vida) {
        this.nome = nome;
        this.luta = luta;
        this.vida = vida;
    }

    public final void mudarEstado(Estado novoEstado){
        if (estadoAtual != null){
            estadoAtual.sair();
        }
        estadoAtual = novoEstado;

        if(estadoAtual != null){
            estadoAtual.entrar();
        }
    }

    public final void executarEstado(){
        if(estadoAtual != null){
            estadoAtual.executar();
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public void receberDano(int dano){
        vida -= dano;
        if(vida < 0){
            vida = 0;
        }

        Log.mostrar(nome + " recebeu " + dano + " de dano! Vida: " + vida);
    }

    public Luta getLuta() {
        return luta;
    }


}
