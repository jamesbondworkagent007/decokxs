package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.xVx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54803xVx {
    public static /* synthetic */ int digitFormat$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return EZpvd(str, i);
    }

    public static final int EZpvd(java.lang.String str, int i) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) (C33129mqd.OLrzqt((java.lang.CharSequence) str) ? C33129mqd.formatS$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), null, null, null, 7, null) : ""), new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        int size = listSplit$default != null ? listSplit$default.size() : 0;
        if (size > 1) {
            Intrinsics.copydefault(listSplit$default);
            return ((java.lang.String) listSplit$default.get(1)).length();
        }
        if (size != 1) {
            return i;
        }
        Intrinsics.copydefault(listSplit$default);
        return -(((java.lang.String) listSplit$default.get(0)).length() - 1);
    }
}
