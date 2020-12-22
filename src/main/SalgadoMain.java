package main;

import java.util.Scanner;

public class SalgadoMain {
    
    public static void main(String[] args) {
        CompraSalgado compra = new CompraSalgado();
        Scanner sc = new Scanner(System.in);
        int op = -1;
        while (op != 4) {
            System.out.println("Olá! O que deseja fazer na lanchonete?\n"
                    + "1) Comprar um salgado\n"
                    + "2) Ver itens comprados\n"
                    + "3) Finalizar compra\n"
                    + "4) Sair\n");
            op = sc.nextInt();
            switch (op) {
                case 1: 
                    SalgadoMain.comprarSalgado(compra, sc);
                    break;
                case 2: 
                    SalgadoMain.consultarItensVenda(compra);
                    break;
                case 3: 
                    SalgadoMain.finalizarCompra(compra, sc);
                    break;
                default: {
                }
            }
        }
    }
    
    private static void comprarSalgado(CompraSalgado compra, Scanner sc) {
        char tamanho = 'P';
        System.out.println("Qual tamanho de salgado você quer?\n"
                + "P - Pequeno\n"
                + "M - Médio\n"
                + "G - Grande");
        tamanho = sc.next().charAt(0);
        
        int salgado = 0;
        int sabor = -1;
        System.out.println("Qual salgado você quer comprar?\n1) Pastel\n2) Esfirra\n");
        salgado = sc.nextInt();
        if (salgado == 1) {
            System.out.println("Qual sabor de pastel você deseja?\n"
                    + "0) Carne\n"
                    + "1) Pizza\n"
                    + "2) Queijo\n");
            sabor = sc.nextInt();
            Pastel pastel = new Pastel(tamanho, sabor);
            compra.comprarSalgado(pastel);
        } else if (salgado == 2) {
            System.out.println("Qual sabor de pastel você deseja?\n"
                    + "0) Calabresa\n"
                    + "1) Frango\n"
                    + "2) Vegetariana\n");
            sabor = sc.nextInt();
            Esfirra esfirra = new Esfirra(tamanho, sabor);
            compra.comprarSalgado(esfirra);
        }
    }
    
    private static void consultarItensVenda(CompraSalgado compra) {
        System.out.println(compra.toString());
    }
    
    private static void finalizarCompra(CompraSalgado compra, Scanner sc) {
        if (!compra.toString().equals("[]")) {
            System.out.println("Itens comprados: \n" + compra.toString());
            System.out.println("Você deseja que o produto seja entregue no seu endereço?\n"
                    + "Caso positivo, digite S. Caso contrário, digite outra tecla.\n");
            char delivery = sc.next().charAt(0);
            boolean taxa = false;
            if (delivery == 'S') { taxa = true; }
            System.out.println("Preço Final (R$): \n" + compra.getPrecoFinal(taxa));
            System.out.println("Nós agradecemos pela preferência!");
            System.exit(0);
        }
    }
    
}