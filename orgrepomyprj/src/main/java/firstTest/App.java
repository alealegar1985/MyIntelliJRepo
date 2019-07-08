package firstTest;

import com.repo.testpackage.Bean1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        Bean1 b = new Bean1();
        b.setInt1(1);
        b.setInt2(2);
        b.setVar3("String3");
        b.setVar2("String2");
        b.setVar1("String1");
        System.out.println( "Il bean vale" + b);
    }
}
