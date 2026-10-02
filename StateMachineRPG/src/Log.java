public class Log {

    private static final int PAUSA_MS = 1000;

    public static void mostrar(String mensagem) {
        System.out.println(mensagem);
        pausar(PAUSA_MS);
    }

    public static void mostrarRapido(String mensagem) {
        System.out.println(mensagem);
    }

    private static void pausar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}