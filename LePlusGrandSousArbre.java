//JIAYING QIAN
public class LePlusGrandSousArbre {

    //verifier le nombre de "(" et le nombre de ")"
    public static boolean verifier(String str) {
        int left=0,right=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(') {
                left++;
            }else if(str.charAt(i)==')') {
                right++;
            }
        }
        if(left==right) {
            return true;
        }else {
            return false;
        }
    }

    public static void verifierMotif(String arg1, String arg2){
        String len = methode(arg1,arg2);
        if (len==arg1){
            System.out.println("le permier arbre est le motif de deuxieme arbre");
        } else if(len==arg2){
            System.out.println("le deuxieme arbre est le motif de premier arbre");
        } else {
            System.out.println("le premier arbre n'est pas le motif de deuxieme arbre, vice versa.");
        }
    }

    public static void trouver(String arg1, String arg2){
        String len = methode(arg1,arg2);
        if (len == "") {
            len = "il exist aucune sous-arbre entre ces deux arbre.";
        }
        System.out.println("Leur plus grand sous-arbre est:"+len);
    }

    public static String methode(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        String min = null;
        String max = null;
        String target = null;
        min = len1 <= len2 ? str1 : str2; //petit arbre entre les 2 arbre
        max = len1 >  len2 ? str1 : str2; //grand arbre entre les 2 arbre
        //Commencer par le plus grande de longeur de petit arbre.
        for (int i = min.length(); i >= 1; i--) {
            for (int j = 0; j <= min.length() - i; j++) {
                target = min.substring(j, j + i);
                for (int k = 0; k <= max.length() - i; k++) {
                    if (max.substring(k,k + i).equals(target) && verifier(target) ) {
                        return target;
                    }
                }
            }
        }
        return "";
    }
}