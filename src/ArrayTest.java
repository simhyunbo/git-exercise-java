public class ArrayTest {
    public static void main(String[] args) {
        System.out.println(); //alt+shift+f10
        //10칸의 int array를 만들고
        //1부터 10까지 채워보세요
        //그리고 console에 출력 해보세요.

        int[] arr = new int[10];
        for(int i =0;i<arr.length;i++){
            arr[i]=i+1;
            System.out.print(arr[i]+" ");
        }

    }
}
