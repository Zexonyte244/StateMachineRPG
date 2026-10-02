public class EstadoHeroiEsperando extends EstadoBase{

    public EstadoHeroiEsperando(Agente agente) {
        super(agente, "ESPERANDO");
    }

    @Override
    public void executar() {

        avancarTurno();

        Log.mostrar(agente.getNome() + " esta esperando. " + "Turno no estado: " + turnosEstado);

        if(turnosEstado >= 1){
            agente.mudarEstado(new EstadoHeroiAtacando(agente));
        }
    }
}
