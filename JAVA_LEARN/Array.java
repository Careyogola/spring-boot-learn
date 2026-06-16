public class Array {
    public static void main(String[] args) {
        int [] myMarks = {89,90,98,76,89};

        for(int i = 0; i < myMarks.length; i ++) {
            System.out.println(myMarks[i]);
        }

        int sum = 0;
        for (int i= 0; i < myMarks.length; i ++) {
            sum += myMarks[i];
        }

        System.out.println(sum);
    }
}

// single and multidimensional arrays 


