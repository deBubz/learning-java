package app;

/**
 * Grade model class for GPACalc.java
 * 
 */
public class Grade {
    private String grdName;
    private double grdPoint;
    private int grdCount;

    public Grade(String grdName, double grdPoint) {
        this.grdName = grdName;
        this.grdPoint = grdPoint;
    };

    public String getGrdName() { return grdName; } 
    public int getGrdCount() { return grdCount; }

    public void setGrdCount(int grdCount) { this.grdCount = grdCount; }



    public double getTotalGrade(){
        return this.grdPoint * (double)this.grdCount * 6;
    }

    public int getTotalCredit() {
        return this.grdCount * 6;
    }
    
}