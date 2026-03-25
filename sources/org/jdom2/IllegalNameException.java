package org.jdom2;

import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes24.dex */
public class IllegalNameException extends IllegalArgumentException {
    private static final long serialVersionUID = 200;

    public IllegalNameException(String str, String str2, String str3) {
        super("The name \"" + str + "\" is not legal for JDOM/XML " + str2 + "s: " + str3 + JwtUtilsKt.JWT_DELIMITER);
    }

    public IllegalNameException(String str, String str2) {
        super("The name \"" + str + "\" is not legal for JDOM/XML " + str2 + "s.");
    }

    public IllegalNameException(String str) {
        super(str);
    }
}
