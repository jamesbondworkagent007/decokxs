package o;

import android.app.Application;
import android.graphics.Color;
import androidx.camera.video.AudioStats;
import com.okinc.core.util.SPUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33512mxp {
    public static java.lang.Integer AYXKKw;
    public static java.lang.Integer EZpvd;
    public static final int KWHzl;
    public static java.lang.Integer OLrzqt;
    public static Function0<java.lang.Integer> copydefault;
    public static Function0<java.lang.Integer> djBIcL;
    public static final C33512mxp AEQbTJ = new C33512mxp();
    public static final java.util.ArrayList<ActionBar> valueOf = new java.util.ArrayList<>();
    public static final java.util.Map<android.view.View, Function2<java.lang.Integer, java.lang.Integer, android.view.View>> isConnected = new LinkedHashMap();
    public static int gEmmrt = SPUtils.getInt("color_theme", 0).intValue();
    public static int AhwBna = SPUtils.getInt("theme_mode", 0).intValue();

    /* JADX INFO: renamed from: o.mxp$ActionBar */
    public interface ActionBar {
        void AEQbTJ(int i);

        void copydefault(int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Integer> AhwBna() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Integer> AkhnZx() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer DbNXlk() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.Integer num) {
        EZpvd = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer gEmmrt() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer valueOf() {
        return AYXKKw;
    }

    private C33512mxp() {
    }

    static {
        C32979mnm.EZpvd.OLrzqt().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: o.mxp.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "");
                Intrinsics.checkNotNullParameter(bundle, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.app.Activity */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                if ((activity instanceof InterfaceC33507mxk) && ((InterfaceC33507mxk) activity).needChangeUpDownColor()) {
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    C33512mxp.OLrzqt = java.lang.Integer.valueOf(C33512mxp.getFallDownColor$default(c33512mxp, activity, 0.0f, 2, null));
                    C33512mxp.AYXKKw = java.lang.Integer.valueOf(C33512mxp.getRiseUpColor$default(c33512mxp, activity, 0.0f, 2, null));
                }
                java.lang.Integer num = C33512mxp.OLrzqt;
                java.lang.Integer num2 = C33512mxp.AYXKKw;
                Objects.toString(num);
                Objects.toString(num2);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityPostCreated(activity, bundle);
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                C33512mxp.OLrzqt = java.lang.Integer.valueOf(C33512mxp.getFallDownColor$default(c33512mxp, activity, 0.0f, 2, null));
                C33512mxp.AYXKKw = java.lang.Integer.valueOf(C33512mxp.getRiseUpColor$default(c33512mxp, activity, 0.0f, 2, null));
            }
        });
        copydefault = new Function0() { // from class: o.mxo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C33512mxp.KWHzl());
            }
        };
        djBIcL = new Function0() { // from class: o.mxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C33512mxp.djBIcL());
            }
        };
        KWHzl = 8;
    }

    public final void KWHzl(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        valueOf.add(actionBar);
    }

    public final void AEQbTJ(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        valueOf.remove(actionBar);
    }

    public final void AEQbTJ(int i, int i2) {
        java.lang.Integer numValueOf = valueOf();
        java.lang.Integer numGEmmrt = gEmmrt();
        java.util.Iterator<Map.Entry<android.view.View, Function2<java.lang.Integer, java.lang.Integer, android.view.View>>> it = isConnected.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().invoke(numValueOf, numGEmmrt).invalidate();
        }
    }

    public final boolean EZpvd(int i) {
        return yEE.AhwBna(0, 1).contains(java.lang.Integer.valueOf(i));
    }

    public final boolean copydefault(int i) {
        java.lang.Integer num;
        if (!EZpvd(i) || i == isConnected()) {
            return false;
        }
        AhwBna = i;
        SPUtils.put("theme_mode", java.lang.Integer.valueOf(i));
        java.lang.Integer num2 = OLrzqt;
        if (num2 != null && (num = AYXKKw) != null) {
            OLrzqt = num;
            AYXKKw = num2;
        }
        java.util.Iterator<T> it = valueOf.iterator();
        while (it.hasNext()) {
            ((ActionBar) it.next()).copydefault(i);
        }
        AEQbTJ(AhwBna, gEmmrt);
        return true;
    }

    public final boolean OLrzqt(int i) {
        if (i == gEmmrt) {
            return false;
        }
        gEmmrt = i;
        SPUtils.put("color_theme", java.lang.Integer.valueOf(i));
        java.util.Iterator<ActionBar> it = valueOf.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            ActionBar next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            next.AEQbTJ(i);
        }
        AEQbTJ(AhwBna, gEmmrt);
        return true;
    }

    public final int AYXKKw() {
        java.lang.Integer num = EZpvd;
        return num != null ? num.intValue() : gEmmrt;
    }

    public static /* synthetic */ int profitColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AYXKKw(context, f);
    }

    public final int AYXKKw(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return hDKMBd(context, f);
    }

    public static /* synthetic */ int profitAlternativeColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.gEmmrt(context, f);
    }

    public final int gEmmrt(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return getNewProxyInstance(context, f);
    }

    public static /* synthetic */ int profitContentAlternativeColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.valueOf(context, f);
    }

    public final int valueOf(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.RXzakW, typedValue, true);
        return AEQbTJ(typedValue.data, f);
    }

    public static /* synthetic */ int lossColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AhwBna(context, f);
    }

    public final int AhwBna(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return DbNXlk(context, f);
    }

    public static /* synthetic */ int lossAlternativeColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.KWHzl(context, f);
    }

    public final int KWHzl(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return AkhnZx(context, f);
    }

    public static /* synthetic */ int lossContentAlternativeColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.djBIcL(context, f);
    }

    public final int djBIcL(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.QCjLjM, typedValue, true);
        return AEQbTJ(typedValue.data, f);
    }

    public static /* synthetic */ int getOKCoinRiseUpColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.OLrzqt(context, f);
    }

    public final int OLrzqt(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.DGUQLI, typedValue, true);
        int i = typedValue.data;
        AYXKKw = java.lang.Integer.valueOf(i);
        return AEQbTJ(i, f);
    }

    public static /* synthetic */ int getOKCoinFallDownColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AEQbTJ(context, f);
    }

    public final int AEQbTJ(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.fHqPtx, typedValue, true);
        int i = typedValue.data;
        OLrzqt = java.lang.Integer.valueOf(i);
        return AEQbTJ(i, f);
    }

    public static /* synthetic */ int getRiseUpColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.EZpvd(context, f);
    }

    public final int EZpvd(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return hDKMBd(context, f);
    }

    public static /* synthetic */ int getFallDownColor$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.copydefault(context, f);
    }

    public final int copydefault(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return DbNXlk(context, f);
    }

    public static /* synthetic */ int getRiseUpColor$default(C33512mxp c33512mxp, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return c33512mxp.KWHzl(f);
    }

    public final int KWHzl(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        java.lang.Integer num = AYXKKw;
        if (num == null) {
            return 0;
        }
        return AEQbTJ.AEQbTJ(num.intValue(), f);
    }

    public static /* synthetic */ int getFallDownColor$default(C33512mxp c33512mxp, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return c33512mxp.OLrzqt(f);
    }

    public final int OLrzqt(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        java.lang.Integer num = OLrzqt;
        if (num == null) {
            return 0;
        }
        return AEQbTJ.AEQbTJ(num.intValue(), f);
    }

    public static /* synthetic */ int profitColor$default(C33512mxp c33512mxp, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return c33512mxp.gEmmrt(f);
    }

    public final int gEmmrt(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        return AYXKKw(activityAEQbTJ, f);
    }

    public static /* synthetic */ int lossColor$default(C33512mxp c33512mxp, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return c33512mxp.EZpvd(f);
    }

    public final int EZpvd(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        return AhwBna(activityAEQbTJ, f);
    }

    public static /* synthetic */ int profitAlternativeColor$default(C33512mxp c33512mxp, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AEQbTJ(f);
    }

    public final int AEQbTJ(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        return gEmmrt(activityAEQbTJ, f);
    }

    public static /* synthetic */ int lossAlternativeColor$default(C33512mxp c33512mxp, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return c33512mxp.copydefault(f);
    }

    public final int copydefault(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        return KWHzl(activityAEQbTJ, f);
    }

    public static /* synthetic */ int tradeRise$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.hDKMBd(context, f);
    }

    public final int hDKMBd(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.sTzBva, f);
    }

    public static /* synthetic */ int tradeFall$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.DbNXlk(context, f);
    }

    public final int DbNXlk(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.aJFbMH, f);
    }

    public static /* synthetic */ int tradeRiseAlternative$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.getNewProxyInstance(context, f);
    }

    public final int getNewProxyInstance(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.sVXHln, f);
    }

    public static /* synthetic */ int tradeFallAlternative$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AkhnZx(context, f);
    }

    public final int AkhnZx(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.UscePu, f);
    }

    public static /* synthetic */ int tradeRiseBackground$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.iwGUEr(context, f);
    }

    public final int iwGUEr(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.hvKCwS, f);
    }

    public static /* synthetic */ int tradeFallBackground$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.values(context, f);
    }

    public final int values(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.apNbdB, f);
    }

    public static /* synthetic */ int tradeRiseTinted$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.sSMYrx(context, f);
    }

    public final int sSMYrx(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.zYHWMc, f);
    }

    public static /* synthetic */ int tradeFallTinted$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.uzCIH(context, f);
    }

    public final int uzCIH(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.gmHjFq, f);
    }

    public static /* synthetic */ int tradeRiseShaded$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AxsJAY(context, f);
    }

    public final int AxsJAY(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.zKcAg, f);
    }

    public static /* synthetic */ int tradeFallShaded$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.fIwbmz(context, f);
    }

    public final int fIwbmz(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.gSBher, f);
    }

    public static /* synthetic */ int tradeRiseDefault$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AuCTelauCTel(context, f);
    }

    public final int AuCTelauCTel(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.iPSTqm, f);
    }

    public static /* synthetic */ int tradeFallDefault$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.fetchVPNInfo(context, f);
    }

    public final int fetchVPNInfo(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.dvImUD, f);
    }

    public static /* synthetic */ int tradeRiseGraph$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.zLjUOn(context, f);
    }

    public final int zLjUOn(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.swzYdv, f);
    }

    public static /* synthetic */ int tradeFallGraph$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.isConnected(context, f);
    }

    public final int isConnected(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.fLIjIY, f);
    }

    public static /* synthetic */ int tradeRiseHighlightsFill$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.zsXlph(context, f);
    }

    public final int zsXlph(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.zAEkPU, f);
    }

    public static /* synthetic */ int tradeFallHighlightsFill$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.fJNWhG(context, f);
    }

    public final int fJNWhG(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.fXHmeK, f);
    }

    public static /* synthetic */ int tradeRiseHighlightsContent$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AubY(context, f);
    }

    public final int AubY(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.vLaW, f);
    }

    public static /* synthetic */ int tradeFallHighlightsContent$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AuCTel(context, f);
    }

    public final int AuCTel(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.dLBcXg, f);
    }

    public static /* synthetic */ int tradeRiseHighlightsInteractive$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.wlaJM(context, f);
    }

    public final int wlaJM(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.tIwhY, f);
    }

    public static /* synthetic */ int tradeFallHighlightsInteractive$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.ejfBZ(context, f);
    }

    public final int ejfBZ(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.fsSxsn, f);
    }

    public static /* synthetic */ int tradeRiseTagFill$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.AwvSrB(context, f);
    }

    public final int AwvSrB(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.zlvcHA, f);
    }

    public static /* synthetic */ int tradeFallTagFill$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.getFieldNames(context, f);
    }

    public final int getFieldNames(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.hlkKmr, f);
    }

    public static /* synthetic */ int tradeRiseTagContent$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.gHZMYf(context, f);
    }

    public final int gHZMYf(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.zDUObI, f);
    }

    public static /* synthetic */ int tradeFallTagContent$default(C33512mxp c33512mxp, android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return c33512mxp.fARcdN(context, f);
    }

    public final int fARcdN(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, C52761wXj.ActionBar.gUEfcq, f);
    }

    public final int AEQbTJ(int i, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        return ((double) (1.0f - f)) < 0.001d ? i : Color.argb(yII.EZpvd(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public final int KWHzl(@NotNull android.content.Context context, int i, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return AEQbTJ(C55366xib.KWHzl(i, context), f);
    }

    public final int values() {
        return AYXKKw() == 0 ? isConnected() == 1 ? C52761wXj.LoaderManager.spnCvw : C52761wXj.LoaderManager.Dmq : isConnected() == 1 ? C52761wXj.LoaderManager.ixgjPv : C52761wXj.LoaderManager.DCUTEIdCUTEI;
    }

    public static final int KWHzl() {
        return AEQbTJ.AYXKKw();
    }

    public static final int djBIcL() {
        return AEQbTJ.isConnected();
    }
}
