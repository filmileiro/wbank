public class Conta {
    private double saldo;
    private int angencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        total++;
        System.out.println("\nConta de numero: " + total + ".");
        this.angencia = agencia;
        this.numero = numero;

        System.out.println("Conta Criada com sucesso!");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("O numero não pode ser menor ou igual a zero.");
            return;
        }
        this.numero = numero;
    }

    public void setAngencia(int angencia) {
        if (angencia <= 0) {
            System.out.println("A agencia não poder se menor ou igual a zero.");
            return;
        }
        this.angencia = angencia;
    }

    public int getAngencia() {
        return angencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void getTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public void deposita(double valor) {
        if (valor <= 0) {
            System.out.println("Não se pode depositar valores negativos.");
            return;
        }
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nIformaçoes da conta: " +
                "\nAgência: " + angencia +"."+
                "\nAngencia: " + numero +"."+
                "\nSaldo: R$" + String.format("%.2f.", saldo);
    }
}

