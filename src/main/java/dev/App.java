package dev;


import com.github.lalyos.jfiglet.FigletFont;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      String titre = ResourceBundle.getBundle("application").getString("titre");
        String asciiArt = FigletFont.convertOneLine("Hello World");
        System.out.println(asciiArt);
        String environnement = ResourceBundle.getBundle("application").getString("environnement");
  System.out.println("Environnement : " + environnement);
    }
}
