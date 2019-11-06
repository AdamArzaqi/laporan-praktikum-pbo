package Percobaan1_1841720075Adam;

public class IntershipEmployee extends Employee {
    private int length;
    private int Length;
    
    public IntershipEmployee(String name, int lenght){
        this.length = lenght;
        this.name = name;
    }
    public int getLength(){
        return Length;
    
    }
     public void setLength(int length){
         this.length = length;
     }
     @Override
     public String getEmployeeInfo(){
         String info = super.getEmployeeInfo()+"\n";
         info += "Registered as internship employee for "+length+"month/s\n";
         return info;
     }
}
     

