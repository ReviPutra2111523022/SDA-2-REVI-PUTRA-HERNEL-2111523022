import java.util.LinkedList;

public class SDA2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
       
        //karakter nama "REVI PUTRA HERNEL"
        saya.add("R");
        saya.add("E");
        saya.add("V");
        saya.add("I");
        saya.add("");
        saya.add("P");
        saya.add("U");
        saya.add("T");
        saya.add("R");
        saya.add("A");
        saya.add("");
        saya.add("H");
        saya.add("E");
        saya.add("R");
        saya.add("N");
        saya.add("E");
        saya.add("L");
        System.out.println(saya);
        System.out.println("\n");

        saya.add("B");
        saya.add("A");
        saya.add("I");
        saya.add("K");
        System.out.println("List sebelum di tambahkan karakter: " + saya);
        System.out.println("\n");

        //fungsi menyisipkan karakter
        saya.set(0,"U");
        saya.set(4,"T");
        saya.set(6,"L");
        saya.set(1,"I");
        System.out.println("List setelah ditambahkan karakter: " + saya);
        System.out.println("\n");

        //fungsi Remove
        saya.remove(1);
        saya.remove(5);
        saya.remove(4);
        saya.remove(3);
        saya.remove(2);
        saya.remove(5);
        saya.remove(7);
        saya.remove(8);
        System.out.println("List setalah di remove: " + saya);
        System.out.println(" \n");

        //Fungsi push
        saya.push("RAJIN");
        saya.push("BAIK");
        saya.push("SETIA");
        System.out.println("Setelah elemen p " + saya);
        System.out.println("\n");

        //Fungsi POP
        saya.pop();
        System.out.println("setelah pop: " + saya);
        //System.out.println(saya.pop());

    }
}
