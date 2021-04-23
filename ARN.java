//JIAYING QIAN
public class ARN {
    //attributs: sequence d'ARN et ses appariements
    private String sequence;
    private String appariements;


    //constructeur de ARN:
    private ARN (String sequence, String appariements){
        this.sequence = sequence;
        this.appariements = appariements;
    }

    //methode
    //create ARN et assurer son sequence et son form c'est correct.
    public static ARN createARN(String sequence, String appariements){
        if (sequence.length()!= appariements.length())
        {
            System.out.println("Le sequence d'ARN n'a pas le meme longueur que ses appariements");
            System.exit(0);
        }
        for(int i=0;i<sequence.length();i++){
            char cha = sequence.charAt(i);
            if (cha == 'A' ||cha == 'U' ||cha == 'C' || cha == 'G' ||cha == 'a' ||cha == 'u' ||cha == 'c' || cha == 'g' ){
            }
            else{
                System.out.println("Le sequence n'est pas valide");
                System.exit(0);
            }
        }
        for(int i=0;i<sequence.length();i++){
            char cha = appariements.charAt(i);
            if (cha=='-' || cha=='(' || cha==')'){
            }
            else{
                System.out.println("Le fomat n'est  valide");
                System.exit(0);
            }
        }
        return new ARN(sequence,appariements);
    }

    public String getSequence(){
        return(this.sequence);
    }

    public String getAppariements(){
        return(this.appariements);
    }

    //pour montrer la sequence et les appariements de ARN:
    public void showARN(){
        System.out.println("Sequence d'ARN:"+this.sequence);
        System.out.println("Appariements:"+this.appariements);
    }

    //pour comparer entre 2 ARN:
    public static void comparer(ARN a, ARN b){
        if (a.sequence.equalsIgnoreCase(b.sequence)){
            System.out.println("leur sequence sont identiques");
        } else {
            System.out.println("leur sequence sont differents");
        }

        if (a.appariements.equalsIgnoreCase(b.appariements)){
            System.out.println("leur forme sont identiques");
        } else {
            System.out.println("leur forme sont differents");
        }
    }


}
