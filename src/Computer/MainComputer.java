package Computer;

import org.w3c.dom.css.CSSPrimitiveValue;

public class MainComputer {
    public static void main(String[] args) {

        Computer computerOne = new Computer("MacBook Air", 999  );

        Computer computerTwo = new Computer("MacBook Pro", "16GB", "512", 1500);

        computerOne.getInfo();
        System.out.println();
        computerTwo.getInfo();
    }


}
