package org.jdom2;

import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes24.dex */
public class IllegalDataException extends IllegalArgumentException {
    private static final long serialVersionUID = 200;

    public IllegalDataException(String str, String str2, String str3) {
        super("The data \"" + str + "\" is not legal for a JDOM " + str2 + ": " + str3 + JwtUtilsKt.JWT_DELIMITER);
    }

    public IllegalDataException(String str, String str2) {
        super("The data \"" + str + "\" is not legal for a JDOM " + str2 + JwtUtilsKt.JWT_DELIMITER);
    }

    public IllegalDataException(String str) {
        super(str);
    }
}
