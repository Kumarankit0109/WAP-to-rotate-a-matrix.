public class arr16 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70};
        int n = arr.length;

        // print the array elements

        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();

        // reverse

        int k =3;
        int i =0, j =n/2;
        while (i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // print the resultant array output.

        for (int ele : arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
