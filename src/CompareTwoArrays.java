import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrays {
    public static void main(String[] args) {
        int a[]={3,4,5,32,23,36};
        int b[]={4,3,6,55,32,45};

        List<Integer> li=new ArrayList<>();
        for(int i : a){
            for(int j : b){
                if(i==j){
                    li.add(i);
                }
            }
        }
        System.out.println(li);

    }
}
