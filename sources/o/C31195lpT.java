package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31195lpT {
    public static final C31195lpT AEQbTJ = new C31195lpT();

    private C31195lpT() {
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        long millis = java.util.concurrent.TimeUnit.DAYS.toMillis(1L);
        long millis2 = java.util.concurrent.TimeUnit.HOURS.toMillis(1L);
        long millis3 = java.util.concurrent.TimeUnit.MINUTES.toMillis(1L);
        long millis4 = java.util.concurrent.TimeUnit.SECONDS.toMillis(1L);
        if (j >= millis) {
            int iAhwBna = C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Long.valueOf(j), java.lang.Long.valueOf(millis), null, null, null, 14, null)));
            if (z) {
                return pTD.EZpvd(context, C23274hvD.FragmentManager.OLrzqt, iAhwBna, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna))));
            }
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.accept, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna))));
        }
        if (j >= millis2) {
            int iAhwBna2 = C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Long.valueOf(j), java.lang.Long.valueOf(millis2), null, null, null, 14, null)));
            if (z) {
                return pTD.EZpvd(context, C23274hvD.FragmentManager.KWHzl, iAhwBna2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna2))));
            }
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.AxsJAYsNCnLh, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna2))));
        }
        if (j >= millis3) {
            int iAhwBna3 = C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Long.valueOf(j), java.lang.Long.valueOf(millis3), null, null, null, 14, null)));
            if (z) {
                return pTD.EZpvd(context, C23274hvD.FragmentManager.copydefault, iAhwBna3, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna3))));
            }
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.DarRvM, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna3))));
        }
        int iAhwBna4 = j >= millis4 ? C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Long.valueOf(j), java.lang.Long.valueOf(millis4), null, null, null, 14, null))) : 0;
        if (!z) {
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.DCJXGO, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna4))));
        }
        if (z2) {
            return pTD.EZpvd(context, C23274hvD.FragmentManager.AEQbTJ, iAhwBna4, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna4))));
        }
        java.lang.String string = context.getString(C23274hvD.Fragment.OxVOHk);
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final java.lang.String EZpvd(long j) {
        java.lang.String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", java.util.Locale.US).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
