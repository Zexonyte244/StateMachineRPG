public class EstadoMonstroEsperando extends EstadoBase{
    public EstadoMonstroEsperando(Agente agente) {
        super(agente, "ESPERANDO");
    }

    @Override
    public void executar() {

        avancarTurno();

        Log.mostrar(agente.getNome() + " Está esperando. " + " Turnos neste Estado: " + turnosEstado);

        if (turnosEstado >= 1) {

            agente.mudarEstado(
                    new EstadoMonstroAtacando(agente)
            );
        }
    }
}
