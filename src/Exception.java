public class Exception {



 public static void main(String[] args) {

     Exception exception=new Exception();


     System.out.println(exception.indexOf(new String[]{"ali"},"veli"));


             }

    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {

            if (names[i].equals(name)) { return i; }
        }
        return 2;
    }


}
