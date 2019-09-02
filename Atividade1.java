
package atividade1;


public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cateto1 = 10;
        int cateto2 = 20;
        double hipotenusa = teoremaPitagoras(cateto1,cateto2);
    }

    private static double teoremaPitagoras(int cate1, int cate2) {
        return Math.sqrt((cate1 * cate1) + (cate2 * cate2));
    }

}
