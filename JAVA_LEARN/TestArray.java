public class TestArray {

    public static void main(String[] args) {
        String [] schoolBag2 = {
            "Pens",
            "Pencils",
            "Books",
            "Rubber"
        };

        String[] schoolBag = new String[4];
        schoolBag[0] = "pens";
        schoolBag[1] = "Books";
        schoolBag[2] = "Pencils";
        schoolBag[3] = "rubber";

        int size = schoolBag.length;
        System.out.println("The size of array is:" + size);
        //System.out.println(schoolBag2);


    }
    
}
