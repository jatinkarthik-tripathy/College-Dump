package intern_ques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Jatin
 */
class Student {

    public String name;
    public double cgpa;
    public int token;

    Student(String name, double cgpa, int token) {
        this.name = name;
        this.cgpa = cgpa;
        this.token = token;
    }

}

class SortbyCGPA implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        if (a.cgpa > b.cgpa) {
            return -1;
        } else if (a.cgpa < b.cgpa) {
            return 1;
        } else if (a.cgpa == b.cgpa) {
            if (a.name.compareTo(b.name) < 0) {
                return -1;
            } else if (a.name.compareTo(b.name) > 0) {
                return 1;
            } else if (a.name.compareTo(b.name) == 0) {
                if (a.token < b.token) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}

public class Intern_ques {

    public static void main(String[] args) {
        int total_events;
        int counter = 0;
        String[] form_type;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number events: ");
        total_events = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students = new ArrayList<>(total_events);
        for (int i = 0; i < total_events; i++) {
            form_type = sc.nextLine().split(" ");
            if ("ENTER".equals(form_type[0])) {
                students.add(new Student(form_type[1], Double.parseDouble(form_type[2]),
                        Integer.parseInt(form_type[3])));
                Collections.sort(students, new SortbyCGPA());
            } else if ("SERVED".equals(form_type[0])) {
                students.remove(0);
            }
        }

        System.out.println("Sorted by CGPA");
        students.forEach((i) -> {
            System.out.println(i.name + " " + i.cgpa + " " + i.token);
        });
    }

}
