package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: renamed from: o.arA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7822arA {
    public static java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        if (str == null || str.indexOf(46) != -1) {
            return str;
        }
        return str + JwtUtilsKt.JWT_DELIMITER + str2;
    }
}
