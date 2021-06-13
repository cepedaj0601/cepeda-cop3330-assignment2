package assignment2.ex34.base;

public class Remover {
    public static int employeeRemover(String[] employeeList, String name, int removed){
        for (int i = 0; i < 5; i++) {
            if (employeeList[i].equals(name)) {
                removed = i;
                System.out.println(i);
            }
        }
        return removed;
    }
}
