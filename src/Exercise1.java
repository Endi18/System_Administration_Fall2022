import java.util.Arrays;

public class Exercise1 {
   /*17.22 (Calculating the Average of the Elements in a Two-Dimensional
Array) We have a two-dimensional array of grades with 9
rows and three columns, representing 10 students’ grades on three exams.
Use streams to calculate the students’ individual averages.
 */

    public static void main(String[] args) {
        double[][] allGrades = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85},
                {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}};

        Arrays.stream(allGrades).forEach(row ->
            Arrays.stream(row)
                    .average()
                    .ifPresent(System.out::println));


    }//end main
}
