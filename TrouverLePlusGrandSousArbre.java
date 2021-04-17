import java.util.Scanner;

public class TrouverLePlusGrandSousArbre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrouverLePlusGrandSousArbre mainObj = new TrouverLePlusGrandSousArbre();
        System.out.print("Vueiller entrer le premier arbre:");
        String str1=sc.next();
        System.out.print("Vueiller entrer le deuxieme arbre:");
        String str2=sc.next();
        String len = mainObj.trouverLePlusGrandSousArbre(str1,str2);
        System.out.println("Le plus grand sous-arbre est:"+len);
    }

    //verifier le nombre de "(" et le nombre de ")"
    public boolean verifier(String str) {
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

    public String trouverLePlusGrandSousArbre(String str1, String str2) {
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