package org.jdom2;

import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes24.dex */
public class IllegalTargetException extends IllegalArgumentException {
    private static final long serialVersionUID = 200;

    public IllegalTargetException(String str, String str2) {
        super("The target \"" + str + "\" is not legal for JDOM/XML Processing Instructions: " + str2 + JwtUtilsKt.JWT_DELIMITER);
    }

    public IllegalTargetException(String str) {
        super(str);
    }
}
