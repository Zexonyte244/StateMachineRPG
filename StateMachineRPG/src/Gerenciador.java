public class Gerenciador {
    private final Luta luta;
    public Gerenciador(Luta luta){
        this.luta = luta;
    }

    public void executar(){
        int turno = 1;

        while(!luta.fimBatalha() && turno <= 20){
            Log.mostrarRapido("");
            Log.mostrar(
                    "========== TURNO " + turno + " =========="
            );

            luta.getHeroi().executarEstado();

            if(luta.fimBatalha()){
                break;
            }

            luta.getMonstro().executarEstado();

            turno++;
        }

        Log.mostrarRapido("");
        Log.mostrar("========== FIM DA BATALHA ==========");

        if (luta.getHeroi().estaVivo()) {
            Log.mostrar("Vitória do Herói!");
        } else {
            Log.mostrar("Vitória do Monstro!");
        }
    }
}
