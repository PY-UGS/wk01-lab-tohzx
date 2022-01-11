import java.util.Scanner;

class Main{
    
    public static void main(String [] args){
        String yourName = "Toh Zheng Xiang";
        System.out.println(String.format("Question 2a \r\nHello, I am %s!", yourName));
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("\r\nQuestion 2b \r\nEnter the module code: ");  
        String module = scanner.next();
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
        scanner.close();
        System.out.println(moduleName);


        System.out.println("\r\nQuestion 2c");
        for(int i = 102; i > 66; i--){
            if(i%2 == 1){
                System.out.println("Value of x : " + i);
            }
        }
    }
}