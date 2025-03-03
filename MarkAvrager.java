package trainig.smarksavg;

/**
  *این کلاس برای نوشتن برنامه ی میانگین گیری نمره های دانش اموزان ساخته شده است*
  * معدل چند دانش اموز را محاسبه کند*
 */
public class MarkAvrager {
    
    private int[][] studentMarks = {
        {17, 15, 12, 14, 11},
        {18, 7, 13, 16, 20},
        {10, 15, 17, 19, 12},
        {9, 14, 16, 3, 12}
    };
    
    public static void main(String[] args) {
        MarkAvrager avrager = new MarkAvrager();
        avrager.stdMarkAvg();
    }
    
    private void stdMarkAvg() {
        int index = 0;
        while (index < studentMarks.length) {
            double avg = markAvrager(studentMarks[index]);
            System.err.println("Student marks for std no = " + index + "mark avg = " + avg);
            ++index;
        }
        
    }
    
    private double markAvrager(int[]marks) {
        double sum = 0;
        int i = 0;
        while (i < marks.length) {
            sum = sum + marks[i];
            ++i;
        }
        double avg = sum / marks.length;
        return avg;
    }
    
}