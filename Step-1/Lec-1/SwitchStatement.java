import java.util.List;

public class SwitchStatement {
    static double switchCase(int choice, List<Double> arr){
       switch(choice){
        case 1:
        Double areaOfCircle=Math.PI* (arr.get(0) * arr.get(0));
        return areaOfCircle;

        case 2:
        Double areaOfrectangle=arr.get(0) * arr.get(1);
        return areaOfrectangle;

        default:
        System.out.println("Invalid choice");
        return -1;
       } 
    }
    public static void main(String[] args) {
        List<Double> arr=List.of(2.0);
        System.out.println(switchCase(1, arr));
    }    
}
