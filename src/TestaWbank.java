public class TestaWbank {
    public static void main(String[] args) {

        //criando contas:
        Conta conta1 = new Conta(1415,1008 );
        conta1.deposita(1000.00);
        Cliente cliente1 = new Cliente("William B.", "00099988877", "Programador");
        conta1.setTitular(cliente1);
        System.out.println(cliente1);
        System.out.println(conta1);

        Conta conta2 = new Conta(1416,1009 );
        conta2.deposita(500.00);
        Cliente cliente2 = new Cliente("Júlio V.", "00099988855", "Professor");
        conta2.setTitular(cliente2);
        System.out.println(cliente2);
        System.out.println(conta2);

        Conta conta3 = new Conta(1417,1010 );
        conta3.deposita(1500.00);
        Cliente cliente3 = new Cliente("Carlos T.", "00099988865", "Quadrinista");
        conta3.setTitular(cliente3);
        System.out.println(cliente3);
        System.out.println(conta3);

        //trabalhando com elas:

        //trasfere:
        conta3.transfere(300,conta2);
        System.out.println("\nAtualização de Saldo na conta do " + conta2.getTitular().getNome());
        System.out.println(conta2);
        System.out.println("\nAtualização de Saldo na conta do " + conta3.getTitular().getNome());
        System.out.println(conta3);

        //deposita:
        conta1.deposita(400);
        System.out.println("\nAtualização de Saldo na conta do " + conta1.getTitular().getNome());
        System.out.println(conta1);

        //saca:
        conta2.saca(200.00);
        System.out.println("\nAtualização de Saldo na conta do " + conta1.getTitular().getNome());
        System.out.println(conta2);

        System.out.println("\nO total de contas criadas: " + Conta.getTotal());



    }
}
