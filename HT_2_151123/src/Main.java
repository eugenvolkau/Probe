public class Main {
    public static void main(String[] args)
    {
        boolean isYFin = true;
        boolean isGWeth = false;
        boolean hasBoRain = true;
        boolean isJiFr = true;
        boolean hasKaCo = false;
        boolean hikeHap = isYFin&&(isGWeth||hasBoRain)&&(isJiFr^hasKaCo);
        if (hikeHap == true)
        {
        System.out.println("Luck! Solitaire has worked out.");
        }
        else
        {
            System.out.println("What a failure!");
        }

    }
}