package o;

import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33491mxU {
    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return EIP1271Verifier.hexPrefix + new java.math.BigInteger(str).toString(16);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "";
        }
        try {
            if (C59449zhJ.AYXKKw(str, EIP1271Verifier.hexPrefix, true)) {
                str = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            java.lang.String string = new java.math.BigInteger(str, CharsKt__CharJVMKt.checkRadix(16)).toString();
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
