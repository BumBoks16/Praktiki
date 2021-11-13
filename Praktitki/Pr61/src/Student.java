import java.util.Arrays;
public class Student implements Comparable<Student>{
    public int[] iDNumber;
    private int points;

    public Student(int points){
        this.points = points;
    }
    public Student() {
        iDNumber = new int[6];
        iDNumber[0] = 54;
        iDNumber[1] = 22;
        iDNumber[2] = 13;
        iDNumber[3] = 11;
        iDNumber[4] = 3;
        iDNumber[5] = 100;
    }
    public void selectionSort() {
        for (int i = 0; i < iDNumber.length; i++) {
            int min = iDNumber[i];
            int min_i = i;
            for (int j = i + 1; j < iDNumber.length - 1; j++)
                if (iDNumber[j] < min) {
                    min = iDNumber[j];
                    min_i = j;
                }
            if (i != min_i) {
                int tmp = iDNumber[i];
                iDNumber[i] = iDNumber[min_i];
                iDNumber[min_i] = tmp;
            }
        }
    }
    public void PrintScr() {
        for (int qIDNumber : iDNumber) {
            System.out.println(qIDNumber);
        }
    }
    public void setIDNumber(int[] iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int[] getIDNumber() {
        return this.iDNumber;
    }
    public int getPoints() {
        return this.points;
    }
    @Override
    public String toString() {
        return "Student {" + "idNumber=" + Arrays.toString(iDNumber) + ", points=" + points + '}';
    }
    @Override
    public int compareTo(Student o) {
        return (o.getPoints()-this.points);
    }
}

