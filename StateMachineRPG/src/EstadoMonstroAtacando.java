public class EstadoMonstroAtacando extends EstadoBase{
    public EstadoMonstroAtacando(Agente agente){
        super(agente, "ATACANDO.");
    }

    @Override
    public void executar() {
        avancarTurno();
        Luta luta = agente.getLuta();

        if(luta.fimBatalha()){
            return;
        }

        Log.mostrar(agente.getNome() + " está atacando! ");

        luta.ataque(agente, luta.getHeroi(), (int) (Math.random() * 41));

        if (!luta.fimBatalha()){
            agente.mudarEstado(new EstadoMonstroEsperando(agente));
        }
    }
}
