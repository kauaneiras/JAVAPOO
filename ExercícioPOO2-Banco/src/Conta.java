public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public Conta(int numConta, String dono) {
        this.setNumConta(numConta);
        this.setDono(dono);
        this.saldo = 0; //toda conta começa com 50 reais
        this.status = false;
    }

    public void abrirConta(String tipo){
        setStatus(true);
        if (tipo.equals("CC")){
            this.saldo = 50.0f;
        }
        else{
            this.saldo = 150.0f;
        }
    }
    public void fecharConta(boolean status){
        if (saldo > 0){
            this.status = true;
            System.out.println("Tem dinheiro na conta");
        }
        else if (saldo < 0){
            this.status = true;
            System.out.println("Primeiro pague as suas dívidas");
        }
        else{
        this.status = false;}
    }
    public void depositar(float valDepositado){
        if(status = true){
        setSaldo(getSaldo() + valDepositado);}
        else {
            System.out.println("Erro, é impossível depositar");
        }

    }
    public void sacar(float valSacado){
        if(status = true && saldo > 0 && saldo>=valSacado) {
            setSaldo(getSaldo() - valSacado);
        }
        else if ((status == true && saldo <= 0 || status) == (true && saldo < valSacado)){
            System.out.println("Você não tem Saldo");
        }
        else {
            System.out.println("O senhor não tem conta");
        }
    }
    public void pagarMensal(float mensalidade){

        if(status = true && tipo.equals("CC")){
            mensalidade = 12.0f;
            if(mensalidade>= saldo){
                setSaldo(getSaldo() - mensalidade);
            } else{System.out.println("Impossível pagar a mensalidade por falta de saldo");}
        }
        else if (status = true && tipo.equals("CP")){
            mensalidade = 20.0f;
            if(mensalidade>= saldo){
                setSaldo(getSaldo() - mensalidade);
            } else{System.out.println("Impossível pagar a mensalidade por falta de saldo");}
        }
        else {System.out.println("Não há conta ativa em seu nome");}
    }

    public int getNumConta() {
        return numConta;

    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void estadoAtual(){
        System.out.println(this.getNumConta());
        System.out.println(this.getTipo());
        System.out.println(this.getDono());
        System.out.println(this.getSaldo());
        System.out.println(this.getStatus());
    }
}
