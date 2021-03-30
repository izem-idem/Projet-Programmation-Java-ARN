public class ARN {
    //attributs: sequence d'ARN et ses appariements
    private String sequence;
    private String appariements;

    //constructeur de ARN:
    public ARN (String sequence, String appariements){
        this.sequence = sequence;
        this.appariements = appariements;
    }

    public ARN() {
        this("0","0");
    }

    //methode:
    //pour montrer la sequence et les appariements de ARN:
    public void showARN(){
        System.out.println("Sequence d'ARN:"+this.sequence);
        System.out.println("Appariements:"+this.appariements);
    }

    //pour comparer entre 2 ARN:
    public static void comparer(ARN a, ARN b){
        if (a.sequence == b.sequence){
            System.out.println("leur sequence sont identiques");
        } else {
            System.out.println("leur sequence sont differents");
        }

        if (a.appariements == b.appariements){
            System.out.println("leur forme sont identiques");
        } else {
            System.out.println("leur forme sont differents");
        }
    }

    public static void main(String[] args){
        ARN arn1= new ARN("AAAAA","-----");
        arn1.showARN();
        ARN arn2 = new ARN("AAAAA","-----");
        arn2.showARN();
        ARN.comparer(arn2,arn1);
    }
}
