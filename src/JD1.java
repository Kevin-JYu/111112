import java.util.*;
public class JD1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[][] temp = new int[index][2];
        int indexpre = 0;
        int temps = index;
        while(temps > 0 && scanner.hasNextInt()){
            temp[indexpre][0] = scanner.nextInt();
            temp[indexpre][1] = scanner.nextInt();
            temps --;
            indexpre ++;
        }
        int countMax = 0;
        boolean[] left = new boolean[index];
        boolean[] right = new boolean[index];
        List<List<Integer>> listLeft = new ArrayList<>();
        List<List<Integer>> listRight = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            if(left[i]){
                continue;
            }
            List<Integer> listTemp = new ArrayList<>();
            listTemp.add(i);
            for (int j = i + 1; j < index; j++) {
                if(left[j]){
                    continue;
                }
                int preOne = temp[i][0];
                int endOne = temp[i][1];
                int preTwo = temp[j][0];
                int endTwo = temp[j][1];
                if((preOne - preTwo) == (endOne - endTwo)){
                    listTemp.add(j);
                    left[j] = true;
                }
            }
            left[i] = true;
            listLeft.add(listTemp);
        }
        for (int i = 0; i < index; i++) {
            if(right[i]){
                continue;
            }
            List<Integer> listTemp = new ArrayList<>();
            listTemp.add(i);
            for (int j = i + 1; j < index; j++) {
                if(right[j]){
                    continue;
                }
                int preOne = temp[i][0];
                int endOne = temp[i][1];
                int preTwo = temp[j][0];
                int endTwo = temp[j][1];
                if((preTwo - preOne) == (endOne - endTwo)){
                    listTemp.add(j);
                    right[j] = true;
                }
            }
            right[i] = true;
            listRight.add(listTemp);
        }
        for (int i = 0; i < listLeft.size(); i++) {
            int count = listLeft.get(i).size();
            if(count == 1){
                continue;
            }
            countMax += (count - 1) * count / 2;
        }
        for (int i = 0; i < listRight.size(); i++) {
            int count = listRight.get(i).size();
            if(count == 1){
                continue;
            }
            countMax += (count - 1) * count / 2;
        }
        System.out.println(countMax);
    }
}