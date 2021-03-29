

public class Main extends RNA {

    public Main(String seq1, String dot_bracket) {
        super(seq1, dot_bracket);
    }

    public static void main(String[] args) {
        String seq1 ="GAAUUGCGGGAAAGGGGUCAACAGCCGUUCAGUACCAAGUCUCAGGGGAAACUUUGAGAUGGCCUUGCAAAGGGUAUGGUAAUAAGCUGACGGACAUGGUCCUAACCACGCAGCCAAGUCCUAAGUCAACAGAUCUUCUGUUGAUAUGGAUGCAGUUC";
        String appa_seq1 = "....((((((....((.......((((.((((.(((...(((((..........)))))...((.......))....)))......))))))))......))...)).))))......(((....((((((((...))))))))...)))........";

        String seq2 ="ACGUGCCACGAUUCAACGUGGCACAG";
        String appa_seq2= "--((((((((------))))))))--";

        RNA frag1= new RNA(seq1,appa_seq1);
        RNA frag2= new RNA(seq2,appa_seq2);
    }


}
