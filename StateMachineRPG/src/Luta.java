public class Luta {
    private final Heroi heroi;
    private final Monstro monstro;

    public Luta(){
        heroi = new Heroi("Bartz", this, 100);
        monstro = new Monstro("Catoblepas", 80, this);
    }

    public void ataque(Agente atacante, Agente alvo, int dano){
        if (!atacante.estaVivo() || !alvo.estaVivo()){
            return;
        }

        Log.mostrar("" + atacante.getNome() + " ataca " + alvo.getNome() + "!");
        alvo.receberDano(dano);
    }

    public Heroi getHeroi(){
        return heroi;
    }

    public Monstro getMonstro() {
        return monstro;
    }

    public boolean fimBatalha(){
        return !heroi.estaVivo() || !monstro.estaVivo();
    }
}
