package org.example;

import org.example.model.ComplejoConParteRealPositiva;
import org.example.util.ComplejoUtil;

public class App {

    public static void main(String[] args) {
        ComplejoConParteRealPositiva complejo = new ComplejoConParteRealPositiva(3, 0);
        ComplejoConParteRealPositiva complejo2 = new ComplejoConParteRealPositiva(2, 1);

        ComplejoConParteRealPositiva resultado = ComplejoUtil.suma(complejo, complejo2);
    }

}
