import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

                //lets create an array first
                //int eng = 23;
                int[] marks;
                marks = new int[3];
                //hence array is non-primitive therefore we use new datatype
                marks[0] = 29;
                marks[1] = 23;
                marks[2] = 30;
                System.out.println(marks[1]);
                //length
        System.out.println(marks.length);
        //sorting
        System.out.println("before");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println("after");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //2D array
        System.out.println("Sorting");
        int[][] finalmarks = {{29, 39, 31}, {41, 42, 43}};
        System.out.println(finalmarks[0][2]);
        //first index position [ ] represent first student and second index position represent its index position


    }
}