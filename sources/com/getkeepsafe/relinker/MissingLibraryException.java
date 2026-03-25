package com.getkeepsafe.relinker;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MissingLibraryException extends RuntimeException {
    public MissingLibraryException(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + JwtUtilsKt.JWT_DELIMITER);
    }
}
