import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TreeNode> treeNodes = new ArrayList<TreeNode>();
        String s = "--((((((((------))))))))--";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                if (count==0){
                    treeNodes.add(new TreeNode("(","root"));

                }else{
                    treeNodes.add(new TreeNode("(",treeNodes.get(treeNodes.size()-1).getNodeId()));

                }
                count++;

            }else if(s.charAt(i) == '-'){
                if (count == 0){
                    treeNodes.add(new TreeNode("-","root"));
                }else{
                    treeNodes.add(new TreeNode("-",treeNodes.get(treeNodes.size()-1).getParentId()));
                }
            }else{
                count--;
                //treeNodes.add(new TreeNode(")",));
            }
        }
        ManyNodeTree tree = new ManyNodeTree();

        System.out.println(tree.iteratorTree(tree.createTree(treeNodes).getRoot()));
    }

}
