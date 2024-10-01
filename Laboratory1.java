public class Laboratory1
{
    public static double formula1(double x)
    {
        double ans = Math.asin(0.25 * Math.sin(x));
        return ans;
    }
    public static double formula2(double x)
    {
        double dr = 1.0 - Math.tan(x) / 2.0;
        double ans = Math.sin(Math.pow(dr, Math.cos(x)));
        return ans;
    }
    public static double formula3(double x)
    {
        double dr = Math.pow(x / 22.0, 2);
        double ans = Math.cos(Math.sin(Math.atan(dr)));
        return ans;
    }
    public static void say(double[][] z)
    {
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 18; j++)
            {
                System.out.printf("%.5f", z[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        short[] z1 = new short[13];
        short ch = 7;
        for (int i = 0; i < 13; i += 1)
        {
            z1[i] = ch;
            ch += 1;
            //System.out.println(z1[i]);
        }
        double[] x = new double[18];
        for (int i = 0; i < 18; ++i)
        {
            double a = Math.random() * -11 + 11;
            x[i] = a;
            //System.out.println(x[i]);
        }
        double[][] z = new double[7][18];
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 18; j++)
            {
                switch (z1[i])
                {
                    case 19 -> z[i][j] = formula1(x[j]);
                    case 7, 9, 15 -> z[i][j] = formula2(x[j]);
                    default -> z[i][j] = formula3(x[j]);
                }
            }
        }
        say(z);
    }
}
