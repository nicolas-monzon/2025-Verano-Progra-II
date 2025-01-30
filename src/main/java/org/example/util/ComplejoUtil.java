package org.example.util;

import org.example.model.ComplejoConParteRealPositiva;

public class ComplejoUtil {

    public static ComplejoConParteRealPositiva suma(ComplejoConParteRealPositiva complejo, ComplejoConParteRealPositiva complejo2) {
        return new ComplejoConParteRealPositiva(complejo.getReal() + complejo2.getReal(), complejo.getComplex() + complejo2.getComplex());
    }

}
