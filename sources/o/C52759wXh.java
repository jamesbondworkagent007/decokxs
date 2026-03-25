package o;

import android.content.res.Resources;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52759wXh {
    public static final C52759wXh AEQbTJ = new C52759wXh();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wXi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52759wXh.OLrzqt();
        }
    });
    public static final int copydefault = 8;

    private C52759wXh() {
    }

    public final java.util.Map<java.lang.Integer, android.content.Context> KWHzl() {
        return (java.util.Map) EZpvd.getValue();
    }

    public static final java.util.Map OLrzqt() {
        return new LinkedHashMap();
    }

    public final android.content.Context OLrzqt(@androidx.annotation.StyleRes int i) {
        return KWHzl(i, "exchange");
    }

    public final android.content.Context KWHzl(@androidx.annotation.StyleRes int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(C52762wXk.AEQbTJ(), i);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iHash = Objects.hash(java.lang.Integer.valueOf(i), str, java.lang.Integer.valueOf(c33512mxp.values()));
        android.content.Context context = KWHzl().get(java.lang.Integer.valueOf(iHash));
        if (context != null) {
            return context;
        }
        C52759wXh c52759wXh = AEQbTJ;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "");
        c52759wXh.OLrzqt(theme, c52759wXh.EZpvd(str), c33512mxp.values());
        c52759wXh.KWHzl().put(java.lang.Integer.valueOf(iHash), contextThemeWrapper);
        return contextThemeWrapper;
    }

    public static /* synthetic */ void wrapOKTheme$default(C52759wXh c52759wXh, Resources.Theme theme, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = C33512mxp.AEQbTJ.values();
        }
        c52759wXh.OLrzqt(theme, i, i2);
    }

    public final void OLrzqt(@NotNull Resources.Theme theme, @androidx.annotation.StyleRes int i, @androidx.annotation.StyleRes int i2) {
        Intrinsics.checkNotNullParameter(theme, "");
        theme.applyStyle(i, true);
        theme.applyStyle(i2, true);
    }

    public final int EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "pay") ? C52761wXj.LoaderManager.igXuih : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "web3") ? C52761wXj.LoaderManager.fdOvFl : C52761wXj.LoaderManager.fERRXa;
    }
}
