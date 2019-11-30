package app;

/**
 * GPACalc Handling main operations of the app
 */

public class GPACalc {
    Grade[] gradesArr = new Grade[] {
        new Grade("HD", 4),
        new Grade("D", 3.5),
        new Grade("C", 2.5),
        new Grade("P", 1.5),
        new Grade("F", 0.5)
    };
    int totalCredit = 0;
    int totalPoint = 0;
 
    public void use(String[] args){                     // quick
        for(int i = 0; i < gradesArr.length; i++) {
            // add gradess
            addingGrades(i, Integer.parseInt(args[i+1]));
        }
        // print input
        for (Grade grade : gradesArr) {
           print("You entered " + grade.getGrdCount() +" "+ grade.getGrdName() + "(s)\n"); 
        }
        printResult();
    }

    public void use() {                                 // manual
        println("ENTER WHAT YOU GOT");
        for(int i = 0; i < gradesArr.length; i++) {
            print("How many " + gradesArr[i].getGrdName() + " you got: ");
            addingGrades(i, In.nextInt());
        }

        printResult();
    }

    public void addingGrades(int i, int gradecount) {   // there must be a better way doing this
        gradesArr[i].setGrdCount(gradecount);
        totalCredit += gradesArr[i].getTotalCredit();
        totalPoint += gradesArr[i].getTotalGrade();
    }

    public void printResult() {
        println("\n******************************************");
        println("Assunimg each subj is 6cp");
        println("Credit = " + totalCredit);
        println("Total = " + totalPoint);
        println("GPA = " + (totalPoint / totalCredit));
        println("******************************************");
    }

    public static void println(String txt) { System.out.println(txt); }
    public static void print(String txt) { System.out.print(txt); }
}
