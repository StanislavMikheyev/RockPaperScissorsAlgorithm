public class Main
{

    enum GESTURE {
        ROCK, PAPER, SCISSORS
    };

    public static void main(String[] args)
    {
        int me = GESTURE.ROCK.ordinal();
        int op = GESTURE.SCISSORS.ordinal();
        int len = 3;

        int opposit = (me + len / 2) % len;

        if (me == op) {
            System.out.println("Draw");
            return;
        }

        boolean B = me >= op;
        boolean C = op > opposit;
        System.out.println((me < opposit) && (B || C) || B && C);
    }
}