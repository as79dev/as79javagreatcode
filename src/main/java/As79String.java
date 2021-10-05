import static java.lang.System.*;

public class As79String {
    /**
     * Test
     * Kommentar
     * @param args Kommentar fehlt
     */
    public static void main(String[] args) {
        As79String as79 =new As79String();
        as79.countLength("MeinString");
        System.out.println("Done");
    }

    // Started working on branch string
    public Integer countLength(String s) {
        Integer i = s.length();
        System.out.println(s.length());
        return i;
    }


}
