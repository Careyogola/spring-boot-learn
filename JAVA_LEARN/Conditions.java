public class Conditions {


    public static void main(String[] args) {

        Conditions conditions = new Conditions();
        int result = conditions.forLoop();
        System.out.println("The result is:" + result);

        Conditions conditions2 = new Conditions();
        String grade = conditions2.stateMents();
        System.out.println("The grade is:" + grade);


        int xy = 10;

        while(xy < 15){
            System.out.println("My value is:" + xy);
            xy++;
            //System.out.print("/n");
        }
    }

    public int forLoop() {
        int total = 0;

        for(int i = 10; i > 1; i --){
           total = total + 1;
        }
         return total;
    }

    public String stateMents() {

        int testScore = 80;
        String grade;


        if (testScore >= 90) {
            grade = "A";
        } else if(testScore >= 85) {
            grade = "B";
        } else {
            grade = "C";
        }

        return grade;
    }
    
}
