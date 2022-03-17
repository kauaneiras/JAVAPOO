public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta(0000, "Jubileu");
        c1.abrirConta("CC");
        c1.depositar(150.4f);
        c1.sacar(500.f);
        c1.estadoAtual();
    }


}
