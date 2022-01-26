import java.util.Scanner;

class tutorial1Q2{

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("\r\nQuestion 2b \r\nEnter the module code: ");
        String module = in.next();
        String moduleName;
        switch (module) {
            case "CSC1010" :
                moduleName = "Computer Networks";
                break;
            case "CSC1009" :
                moduleName = "Object-Oriented Programming";
                break;
            case "CSC1008" :
                moduleName = "Data Structures and Algorithms";
                break;
            case "CSC1007" :
                moduleName = "Operating System";
                break;
            case "CSC1006" :
                moduleName = "Mathematics 2";
                break;
            default :
                moduleName = "Unknown module code";
        }
        in.close();
        // one println only (neater to me)
        System.out.println(moduleName);
        }
    }