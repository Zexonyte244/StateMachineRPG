//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Luta luta = new Luta();

        Heroi heroi = luta.getHeroi();
        Monstro monstro = luta.getMonstro();

        heroi.mudarEstado(
                new EstadoHeroiEsperando(heroi)
        );

        monstro.mudarEstado(
                new EstadoMonstroEsperando(monstro)
        );

        Gerenciador gerenciador =
                new Gerenciador(luta);

        gerenciador.executar();
    }
}