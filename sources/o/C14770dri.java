package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14770dri {
    public static /* synthetic */ int getChartPnlTextColor$default(java.lang.String str, android.content.Context context, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "0";
        }
        return AEQbTJ(str, context, str2);
    }

    public static final int AEQbTJ(java.lang.String str, @NotNull android.content.Context context, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.AEQbTJ(str, str2) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33129mqd.gEmmrt(str, str2) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
    }
}
