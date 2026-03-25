package o;

import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49962uyT {
    public static final C49962uyT AEQbTJ = new C49962uyT();
    public static final int OLrzqt = 8;

    private C49962uyT() {
    }

    public final int EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.zLjUOn(context, 0.2f);
    }

    public final int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.isConnected(context, 0.2f);
    }

    public static /* synthetic */ int getDefaultProfitLossColor$default(C49962uyT c49962uyT, android.content.Context context, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return c49962uyT.copydefault(context, z, f);
    }

    public final int copydefault(@NotNull android.content.Context context, boolean z, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return z ? C33512mxp.AEQbTJ.AuCTelauCTel(context, f) : C33512mxp.AEQbTJ.fetchVPNInfo(context, f);
    }

    public final int KWHzl(@NotNull android.content.Context context, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context contextKWHzl = C55374xij.KWHzl(context, 32, C33512mxp.AEQbTJ.isConnected() == 1 ? C52761wXj.LoaderManager.ODWQjV : C52761wXj.LoaderManager.DXXBbs);
        return C33129mqd.AEQbTJ(obj, 0) ? C55366xib.KWHzl(C52761wXj.ActionBar.iPSTqm, contextKWHzl) : C33129mqd.gEmmrt(obj, 0) ? C55366xib.KWHzl(C52761wXj.ActionBar.dvImUD, contextKWHzl) : C33070mpX.copydefault(C49511upt.ActionBar.KWHzl);
    }

    public final int copydefault(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33129mqd.AEQbTJ(str, "0") ? C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }

    public static /* synthetic */ int getSimpleOptionCircleColor$default(C49962uyT c49962uyT, android.content.Context context, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return c49962uyT.OLrzqt(context, z, f);
    }

    public final int OLrzqt(@NotNull android.content.Context context, boolean z, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return z ? C33512mxp.AEQbTJ.zLjUOn(context, f) : C33512mxp.AEQbTJ.isConnected(context, f);
    }
}
