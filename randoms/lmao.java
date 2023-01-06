package randoms;

import java.awt.*;

public class lmao {
    public static void main(String[] args) {
        PasswordGenerator lmao = new PasswordGenerator(5, "deez");
        String lel = lmao.pwGen();
        System.out.println(lel);
        System.out.println(lmao.pwCount());
        PasswordGenerator.randCount = 10;
        System.out.println(lmao.pwGen());
    }
}
