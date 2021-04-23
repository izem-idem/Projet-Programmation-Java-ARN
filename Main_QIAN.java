//JIAYING QIAN
public class Main_QIAN {
    public static void main(String[] args){
        ARN seq1 = ARN.createARN("AcGG","--()");
        seq1.showARN();
        ARN seq2 = ARN.createARN("AAGG","(())");
        ARN.comparer(seq1,seq2);
        LePlusGrandSousArbre.trouver(seq1.getAppariements(),seq2.getAppariements());
    }
}
