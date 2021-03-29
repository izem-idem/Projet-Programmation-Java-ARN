public class RNA {
    String seq1 ="AUUCG";
    String dot_bracket = "--(--(---))--";

    public RNA(String seq1 ,String dot_bracket){
        this.seq1=seq1;
        this.dot_bracket=dot_bracket;
    }
    @Override
    public String toString() {
        return (this.seq1+this.dot_bracket);
    }

    public static boolean is_it_same (String seq_a,String seq_b) {
        int flag =0;
        if(seq_a.length() == seq_b.length()){
            for (int i = 0; i < seq_a.length(); i++) {
                if (seq_a.toCharArray()[i] != seq_b.toCharArray()[i]) {
                    flag += 1;
                }
            }
            if(flag == 0){
                return true;
            }
            else return false; // dans le cas les séq ou les dbn ont la même longueur mais ne sont pas similaires.
        }
        else return false; // false dans le cas ou les séquence ou les dbn n'ont pas la même longueur
    }

}



