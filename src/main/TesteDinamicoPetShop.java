package main;

import modelo.Cachorro;
import modelo.Dono;
import modelo.Endereco;
import repository.CachorroRepository;

import java.util.Scanner;

public class TesteDinamicoPetShop {
    private static final CachorroRepository cachorroRepository = new CachorroRepository();

    public static void main(String[] args) {
        final int SAIR_DO_SISTEMA = 4;
        int opcaoSelecionada = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Ver cadastrados");
            System.out.println("3 - Limpar cadastros");
            System.out.println("4 - Sair");

            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada){
                case 1:
                    cadastra(scanner, cachorroRepository);
                    break;
                case 2:
                    cachorroRepository.printCachorrosCadastrados();
                    break;
                case 3:
                    cachorroRepository.limparCadastro();
                    break;
                case 4:
                    System.out.println("Saindo do Sistema.");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }

        }while (opcaoSelecionada != SAIR_DO_SISTEMA);
    }
    private static void cadastra(Scanner scanner, CachorroRepository cachorroRepository) {
        System.out.println("_____________ CADASTRO DE CACHORROS _____________");
        System.out.println("_____________ Informe os dados do DONO _____________");

        System.out.println("Digite o nome do Dono: ");
        String nomeDono = scanner.next();

        System.out.println("Informe os seguintes dados de Endereço:");

        System.out.println("Digite a Rua:");
        String rua = scanner.next();

        System.out.println("Digite o Numero:");
        String numero = scanner.next();

        System.out.println("Digite o Bairro:");
        String bairro = scanner.next();

        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);

        Dono dono = new Dono(nomeDono, endereco);

        System.out.println("_____________ Informe os dados do CACHORRO _____________");

        System.out.println("Digite o nome do Cachorro:");
        String nomeCachorro = scanner.next();

        System.out.println("Digite a raca:");
        String raca = scanner.next();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        Cachorro cachorro = new Cachorro(nomeCachorro, dono);
        cachorro.setRaca(raca);
        cachorro.setIdade(idade);

        cachorroRepository.cadastrar(cachorro);
        System.out.println("CADASTRO REALIZADO COM SUCESSO! ACESSE A OPÇÃO 2 PARA CONSULTAR.");
    }

}
