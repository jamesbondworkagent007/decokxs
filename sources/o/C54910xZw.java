package o;

import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xZw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54910xZw {
    public static final java.lang.String EZpvd(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        if (!C59449zhJ.AYXKKw(str, EIP1271Verifier.hexPrefix, true)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        if (C59449zhJ.AYXKKw(str, EIP1271Verifier.hexPrefix, true)) {
            return str;
        }
        return EIP1271Verifier.hexPrefix + str;
    }
}
