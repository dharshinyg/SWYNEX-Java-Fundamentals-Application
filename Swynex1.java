import java.util.*;
class Resort{
    Scanner sc;
    Resort(Scanner sc){
        this.sc=sc;
    }
    HashMap <String,String> details = new HashMap<>();
    public void add(){
        System.out.println("Enter Name:");
        String s= sc.nextLine();
        System.out.println("Phone Number:");
        String n = sc.nextLine();
        details.put(s,n);
    }
    public void remove(){
        System.out.println("Enter Name:");
        String s= sc.nextLine();
        if(details.containsKey(s)){
            details.remove(s);
        }
        else{
            System.out.println("Invalid");
        }
    }
    public void view(){
        System.out.println("Enter Name");
        String s=sc.nextLine();
        if(details.containsKey(s)){
            System.out.println(details.get(s));
        }
        else{
            System.out.println("Invalid");
        }
    }
}
public class Swynex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort obj = new Resort(sc);
        int choice=0;
        do{
            System.out.println("-----DashBoard-----\n1. Add\n2. Delete\n3. View\n4. Exit");
            System.out.println("-------------------");
            System.out.println("Select your choice");
            try{
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        System.out.println("Enter number of persons");
                        int num = sc.nextInt();
                        sc.nextLine();
                        for(int i=0;i<num;i++){
                            obj.add();
                        }
                        break;
                    case 2:
                        obj.remove();
                        break;
                    case 3:
                        obj.view();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Choose from Menu!");
                    }
                }
            catch(InputMismatchException E){
                System.out.println("Invalid Input");
                sc.nextLine();
            }
        }while(choice!=4);
    }  
}