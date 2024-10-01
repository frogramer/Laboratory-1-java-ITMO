public class Lab1
{
    public static double formula1(float x)
    {
        double st = Math.cbrt(Math.pow(Math.E, x));
        double ans = Math.pow(Math.E,st);
        return ans;
    }
    public static double formula2(float x)
    {
        double skobka1 = (x - (3.0/4));
        double skobka2 = (2.0 / x) / skobka1;
        double st = Math.pow(skobka2, 3);
        double ans = Math.cos(st);
        return ans;
    }
    public static double formula3(float x) {
        double cos = Math.cos(Math.cbrt(Math.pow(0.5 * x, x)));
        double dr = (Math.pow(Math.pow(Math.E, x) / 2.0, 2) + 0.5) / 4;
        double st = Math.log(Math.abs(x));
        st = Math.pow(st, Math.pow(0.75 * x, x) / 0.25);
        dr = Math.pow(dr, st);
        dr = 1.0 - dr;
        double ans = cos * dr;
        st = 3.0 * (1.0 - Math.cbrt(Math.atan((x - 5.0) / 14.0)));
        ans = Math.pow(ans, st);
        return ans;
    }
    public static void say(double[][] z)
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 14; j++)
            {
                System.out.printf("%.3f", z[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        int[] z1 = new int[9];
        int el = 0;
        for (int i = 7; i < 24; i += 2)
        {
            z1[el] = i;
            el++;
        }
        float [] x = new float [14];
        for (int i = 0; i < 14; ++i)
        {
            float a = (float) Math.random() * -12 + 2;
            x[i] = a;
        }
        double[][] z = new double[9][14];
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 14; j++)
            {
                switch (z1[i])
                {
                    case 19 -> z[i][j] = formula1(x[j]);
                    case 11, 13, 17, 21 -> z[i][j] = formula2(x[j]);
                    default -> z[i][j] = formula3(x[j]);
                }
            }
        }
        say(z);
    }
}

