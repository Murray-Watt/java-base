package org.mwatt;

import lombok.Getter;

@Getter
public class App
{
    private int instanceInt;

    public int incrementInstanceInt() {
        return ++instanceInt;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
