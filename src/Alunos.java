import java.util.Scanner;

public class Alunos {
    static String ucSub[] = new String[10];
    static String ucGp[] = new String[8];
    static String ucCv[] = new String[3];
    static Scanner teclado = new Scanner(System.in);


    public static void inserirAlunos(String uc[]){
        for(int x = 0; x < uc.length; x++){
            System.out.println("Insira o nome: ");
            uc[x]= teclado.nextLine();
        }
    }

    public static void  mostrarAlunos(String uc[]){
        System.out.println("Alunos:");
        for(int x = 0; x < uc.length; x++){
            System.out.println(uc[x]);
        }
    }


    public static void mostrarAmbasUC() {
        // Lógica: Cada valor de um vetor é comparado com o outro
        // Ou seja: O valor 0 do primeiro vetor irá se comparar com todos os valores do segundo e avaliar se ele é verdadeiro
        for(int j = 0; j < ucSub.length ; j++){
            for(int x = 0; x < ucGp.length; x++){
                if(ucSub[j].equals(ucGp[x])){ //String não dá para usar ==, portanto se usa o método .equals
                    System.out.println(ucGp[x]);
                    break;
                }
            }
        }


    }


    public static void main(String[] args) {
        //inserirAlunos(ucCv);
        //mostrarAlunos(ucCv);

        int opcao = 0;
        int resposta = 0;
        while (opcao !=9) {
            System.out.println("1 - Inserir UC ");
            System.out.println("2 - Mostrar alunos da UC");
            System.out.println("3 - Mostrar alunos de ambas as UCS");
            System.out.println("9 - Fim");


            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("1 - Sub-Rotina");
                    System.out.println("2 - Gerência de Projetos");
                    resposta = teclado.nextInt();
                    teclado.nextLine();

                    if (resposta == 1){
                        inserirAlunos(ucSub);
                    } else {
                        inserirAlunos(ucGp);
                    }
                    break;

                case 2:
                    System.out.println("1 - Sub-Rotina");
                    System.out.println("2 - Gerência de Projetos");
                    resposta = teclado.nextInt();
                    teclado.nextLine();

                    if (resposta == 1){
                        mostrarAlunos(ucSub);
                    } else {
                        mostrarAlunos(ucGp);
                    }
                    break;

                case 3:
                    mostrarAmbasUC();
            }
        }
    }
}
