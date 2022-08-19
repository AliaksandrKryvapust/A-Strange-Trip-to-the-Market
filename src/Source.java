public class Source {
    public static void main(String[] args) {
    String s ="Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(isLockNessMonster(s));
    }
    public static boolean isLockNessMonster(String s){
        return s.contains("three fifty") || s.contains("3.50") || s.contains("tree fiddy")
                || s.contains("400 foot");
    }
}
