public class Main
{
    public static void main(String[] args)
    {
        int me = 0;
        int op = 1;
        int len = 5;

        int opposit = (me + len / 2) % len;

        boolean answer = false;

        if (me == op) {
            System.out.println("Draw");
            return;
        }



    /*if (me < opposit) {
      answer = (me < op) && (op <= opposit);
    } else {
      answer = (me < op) || (op <= opposit);
    }

    System.out.println(!answer);*/

        boolean B = me >= op;
        boolean C = op > opposit;
        System.out.println((me < opposit) && (B || C) || B && C);
    }
}