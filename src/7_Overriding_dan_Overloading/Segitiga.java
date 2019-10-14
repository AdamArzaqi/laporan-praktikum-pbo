package TugasOverloading_1841720075Adam;

public class Segitiga {
        public int sudut;
    public void SetSudut(int sudut){
        this.sudut = sudut;
    } 
    public int totalSudut(int sudutA){
        return sudut-sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        double sisiC = Math.sqrt(Math.pow(sisiA, 2)+Math.pow(sisiB, 2));
        return sisiC;
    }
    public int getSudut(){
        return this.sudut;
    }
}