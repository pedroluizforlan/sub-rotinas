public class Aula10 {
    /*
   Faça uma subrotina somaEntre que receba como
   parâmetro dois números inteiros e
   retornar a soma dos números inteiros
   existentes entre eles.
   */
    public static int somaEntre(int inicio, int fim){
        int soma=0;
        for(int i = inicio; i<= fim; i++){
            //System.out.println(i);
            soma = soma + i;
        }
        return soma;
    }
    /*
    Faça a subrotina media que tenha como parâmetros
    três notas (double) e uma letra (char).
    Se o valor da letra é A, retorne a media aritmética
    Se o valor da letra é P, retorne a media ponderada
    com os pesos 1, 3 e 6.
    */
    public static double media(double n1, double n2,
                               double n3, char letra){
        double m = 0;
        if (letra == 'A') {
            m = (n1 + n2 + n3) / 3;
        } else if (letra == 'P'){ //Média ponderada
            double p1 = 1;
            double p2 = 3;
            double p3 = 6;
            m = (n1*p1+n2*p2+n3+p3)/(p1+p2+p3);
        }
        return m;
    }

    public static int fatorial(int fatorial){
        int n1 = fatorial;

        for (int i = 1; i < fatorial; i++){
           n1 = n1 * i;
        }
        return n1;
    }

    public static void main(String[] args) {
        System.out.println(fatorial(10));
    }
}
