public class EstadoHeroiDefendendo extends EstadoBase{
    public EstadoHeroiDefendendo(Agente agente) {
        super(agente, "DEFENDENDO");
    }

    @Override
    public void executar() {
        avancarTurno();

        Log.mostrar(agente.getNome() + " está defendendo. ");

        if(turnosEstado >= 1 && !agente.getLuta().fimBatalha()){
            agente.mudarEstado(new EstadoHeroiEsperando(agente));
        }
    }
}
