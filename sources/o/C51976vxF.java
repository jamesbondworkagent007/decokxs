package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51976vxF {
    public static final C54536xML AEQbTJ(@NotNull C54536xML c54536xML, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(c54536xML, "");
        return (num != null && num.intValue() == 0) ? c54536xML.isConnected() : (num != null && num.intValue() == 1) ? c54536xML.copydefault() : (num != null && num.intValue() == 2) ? c54536xML.AuCTel() : c54536xML;
    }

    public static final java.lang.Integer KWHzl(java.lang.Integer num) {
        android.util.SparseArray<C33510mxn> sparseArrayEZpvd;
        if (num != null && num.intValue() == 0) {
            sparseArrayEZpvd = C33503mxg.OLrzqt();
        } else if (num != null && num.intValue() == 1) {
            sparseArrayEZpvd = C33503mxg.AEQbTJ();
        } else {
            sparseArrayEZpvd = (num != null && num.intValue() == 2) ? C33503mxg.EZpvd() : null;
        }
        if (sparseArrayEZpvd != null) {
            return C33503mxg.KWHzl(sparseArrayEZpvd);
        }
        return null;
    }
}
