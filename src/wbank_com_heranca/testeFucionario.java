package wbank_com_heranca;

public class testeFucionario {
    public static void main(String[] args) {

        System.out.println();

        Funcionario f1 = new Funcionario();
        f1.setNome("William B");
        f1.setCpf("00099988877");
        f1.setSalario(1650.00);

        System.out.println("O salario é: " + f1.getSalario());
        System.out.println("O valor da bonificação é: " + f1.getBonificacao());
        System.out.printf("O total é: R$%.2f\n", f1.getBonificacao() + f1.getSalario());


        System.out.println();

        Funcionario f2 = new Funcionario();
        f2.setNome("Luana B");
        f2.setCpf("99988877788");
        f2.setSalario(1750.00);
        f2.setTipo(1);

        System.out.println("O salario é: " + f2.getSalario());
        System.out.println("O valor da bonificação é: " + f2.getBonificacao());
        System.out.printf("O total é: R$%.2f\n", f2.getBonificacao() + f2.getSalario());

        System.out.println();


        Funcionario f3 = new Funcionario();
        f3.setNome("Fernando B");
        f3.setCpf("66677788855");
        f3.setSalario(5000.00);
        f3.setTipo(3);

        System.out.println("O salario é: " + f3.getSalario());
        System.out.println("O valor da bonificação é: " + f3.getBonificacao());
        System.out.printf("O total é: R$%.2f", f3.getBonificacao() + f3.getSalario());

        System.out.println();


    }
}
