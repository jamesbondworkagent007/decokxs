package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NoCopySpan {
    public static /* synthetic */ java.lang.String defaultSessionName$default(HM hm, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hm = HL.OLrzqt.copydefault();
        }
        return OLrzqt(hm);
    }

    public static final java.lang.String OLrzqt(@NotNull HM hm) {
        Intrinsics.checkNotNullParameter(hm, "");
        java.lang.String str = (java.lang.String) C59333zf.AEQbTJ(IOException.zsXlph.getFieldNames(), hm);
        if (str != null) {
            return str;
        }
        return "aws-sdk-kotlin-" + C5172Hm.AEQbTJ(C5173Hn.AEQbTJ.KWHzl());
    }
}
