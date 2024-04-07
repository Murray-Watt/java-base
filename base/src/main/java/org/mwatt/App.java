package org.mwatt;

public class App
{
    private int instanceInt = 0;
    private static int staticInt = 0;
    private static long staticLong = 0;

    public int getInstanceInt() {
        return instanceInt;
    }

    public int incrementInstanceInt() {
        return ++instanceInt;
    }

    /*
     * Normally you would not have a getter for a static variable, but this is just for demonstration purposes.
     */
    public int getStaticInt() {
        return staticInt;
    }

    /*
        * Normally you would not have a setter for a static variable, but this is just for demonstration purposes.
     */
    public int incrementStaticInt() {
        return ++staticInt;
    }

    public static long getStaticLong() {
        return staticLong;
    }

    public static long incrementStaticLong() {
        return ++staticLong;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
