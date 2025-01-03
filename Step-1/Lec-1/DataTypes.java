public class DataTypes {
   static int dataTypeSize(String str){
    int size=-1;
    switch(str.toLowerCase()){
        case "int":
        case "integer":
        size=Integer.BYTES; break;
        case "character":
        case "char":
        size=Character.BYTES; break;
        case "long":
        size=Long.BYTES; break;
        case "short":
        size=Short.BYTES; break;
        case "float":
        size=Float.BYTES; break;    
        case "double":  
        size=Double.BYTES; break;
        case "byte":
        size=Byte.BYTES; break;
        case "boolean": 
        size=1; break;
        default:
        return size;
    }

    return size;
   }
   public static void main(String[] args) {
    String str="Integer";
    System.out.println(dataTypeSize(str));
   }
}