public abstract class EstadoBase implements Estado{

    protected final Agente agente;
    protected final String nome;
    protected int turnosEstado;

    protected EstadoBase(Agente agente, String nome) {
        this.agente = agente;
        this.nome = nome;
    }


    @Override
    public void entrar() {
        turnosEstado = 0;
        Log.mostrar("[SISTEMA]: " + agente.getNome() + " Entrou no estado: " + nome);
    }


    @Override
    public void sair() {
        Log.mostrar("[SISTEMA]: " + agente.getNome() + " saiu do estado: " + nome);
    }

    @Override
    public String getNome() {
        return nome;
    }

    protected void avancarTurno(){
        turnosEstado++;
    }
}
