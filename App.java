public class App {
    public static void main(String[] args) {
        int[] num = new int[]{1,11,3,7,5};
        int[] newNum = new int[num.length];
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0){
            newNum[j] = num [i];
            j++;
            } 
        }
        System.out.println();
        for (int i = 0; i < newNum.length; i++) {
            System.out.println(newNum[i]+ " ");
        }
    }
}
