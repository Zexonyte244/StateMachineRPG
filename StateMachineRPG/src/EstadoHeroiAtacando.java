public class EstadoHeroiAtacando extends EstadoBase{
    public EstadoHeroiAtacando(Agente agente){
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

        luta.ataque(agente, luta.getMonstro(), (int) (Math.random() * 41));

        if (!luta.fimBatalha()){
            agente.mudarEstado(new EstadoHeroiDefendendo(agente));
        }
    }
}
