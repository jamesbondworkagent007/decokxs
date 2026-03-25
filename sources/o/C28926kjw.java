package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28926kjw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd() {
        return "--";
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AhwBna(@NotNull java.lang.String str) {
        java.lang.String percentWithoutSymbol$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            percentWithoutSymbol$default = "--";
        } else {
            percentWithoutSymbol$default = (C23313hvq.KWHzl(str, "1") && C23313hvq.OLrzqt(str, "0")) ? "<1%" : C23311hvo.formatPercentWithoutSymbol$default(str, false, 0, null, false, null, 28, null);
        }
        return C56390yDp.OLrzqt(percentWithoutSymbol$default, java.lang.Integer.valueOf(C23313hvq.OLrzqt(str, "20") ? C52761wXj.ActionBar.OuxcSI : C52761wXj.ActionBar.DCUTEI));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt((C23313hvq.KWHzl(str, "0.01") && C23313hvq.OLrzqt(str, "0")) ? "<1%" : C23311hvo.formatPercentWithoutSymbol$default(str, true, 0, null, false, null, 28, null), java.lang.Integer.valueOf(C23313hvq.EZpvd(str, "0.1") ? C52761wXj.ActionBar.OuxcSI : C52761wXj.ActionBar.DCUTEI));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> copydefault(@NotNull java.lang.String str) {
        java.lang.String percentWithoutSymbol$default;
        int i;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            percentWithoutSymbol$default = "--";
        } else {
            percentWithoutSymbol$default = (C23313hvq.KWHzl(str, "0.01") && C23313hvq.OLrzqt(str, "0")) ? "<1%" : C23311hvo.formatPercentWithoutSymbol$default(str, true, 0, null, false, null, 28, null);
        }
        if (C23313hvq.valueOf(str, "0.01")) {
            i = C52761wXj.ActionBar.DCUTEI;
        } else {
            i = C23313hvq.KWHzl(str, "0.1") ? C52761wXj.Activity.gdmIOq : C52761wXj.ActionBar.OuxcSI;
        }
        return C56390yDp.OLrzqt(percentWithoutSymbol$default, java.lang.Integer.valueOf(i));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> EZpvd(@NotNull java.lang.String str, boolean z, @NotNull android.content.Context context) {
        java.lang.String percentWithoutSymbol$default;
        int i;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            percentWithoutSymbol$default = context.getString(C23274hvD.Fragment.SlnMSS);
        } else if (str.length() == 0) {
            percentWithoutSymbol$default = "--";
        } else {
            percentWithoutSymbol$default = (C23313hvq.KWHzl(str, "0.01") && C23313hvq.OLrzqt(str, "0")) ? "<1%" : C23311hvo.formatPercentWithoutSymbol$default(str, true, 0, null, false, null, 28, null);
        }
        Intrinsics.copydefault((java.lang.Object) percentWithoutSymbol$default);
        if (z) {
            i = C52761wXj.Activity.gdmIOq;
        } else {
            i = C23313hvq.KWHzl(str, "0.3") ? C52761wXj.ActionBar.DCUTEI : C52761wXj.ActionBar.OuxcSI;
        }
        return C56390yDp.OLrzqt(percentWithoutSymbol$default, java.lang.Integer.valueOf(i));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        java.lang.String percentWithoutSymbol$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            percentWithoutSymbol$default = "--";
        } else {
            percentWithoutSymbol$default = (C23313hvq.KWHzl(str, "0.01") && C23313hvq.OLrzqt(str, "0")) ? "<1%" : C23311hvo.formatPercentWithoutSymbol$default(str, true, 0, null, false, null, 28, null);
        }
        return C56390yDp.OLrzqt(percentWithoutSymbol$default, java.lang.Integer.valueOf(C23313hvq.KWHzl(str, "0.1") ? C52761wXj.ActionBar.DCUTEI : C52761wXj.ActionBar.OuxcSI));
    }

    public static final void EZpvd(@NotNull android.widget.TextView textView, @NotNull java.lang.String str) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        textView.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C31256lqb.KWHzl(str, (Function0<java.lang.String>) new Function0() { // from class: o.kjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28926kjw.AEQbTJ();
            }
        }), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        if (C23313hvq.KWHzl(str, "100000")) {
            int i = C52761wXj.Activity.fdOvFl;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = C25382ivf.copydefault(i, context);
        } else if (C23313hvq.KWHzl(str, "200000")) {
            int i2 = C52761wXj.Activity.gdmIOq;
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault = C25382ivf.copydefault(i2, context2);
        } else {
            int i3 = C52761wXj.ActionBar.DCUTEI;
            android.content.Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iCopydefault = C25382ivf.copydefault(i3, context3);
        }
        textView.setTextColor(iCopydefault);
    }

    public static final void KWHzl(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull android.content.Context context) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        textView.setText(C25322iuY.OLrzqt.EZpvd(str));
        if (java.lang.System.currentTimeMillis() - C33129mqd.valueOf(str) < java.util.concurrent.TimeUnit.HOURS.toMillis(2L)) {
            iCopydefault = C25382ivf.copydefault(C52761wXj.ActionBar.DCUTEI, context);
        } else {
            iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context);
        }
        textView.setTextColor(iCopydefault);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> EZpvd(@NotNull java.lang.String str) {
        java.lang.String percentWithoutSymbol$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            percentWithoutSymbol$default = "--";
        } else {
            percentWithoutSymbol$default = (C23313hvq.KWHzl(str, "0.01") && C23313hvq.OLrzqt(str, "0")) ? "<1%" : C23311hvo.formatPercentWithoutSymbol$default(str, true, 0, null, false, null, 28, null);
        }
        return C56390yDp.OLrzqt(percentWithoutSymbol$default, java.lang.Integer.valueOf(C23313hvq.KWHzl(str, "0.1") ? C52761wXj.ActionBar.DCUTEI : C52761wXj.ActionBar.OuxcSI));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String percentWithoutSymbol$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            percentWithoutSymbol$default = "--";
        } else {
            percentWithoutSymbol$default = (C23313hvq.KWHzl(str, "0.01") && C23313hvq.OLrzqt(str, "0")) ? "<1%" : C23311hvo.formatPercentWithoutSymbol$default(str, true, 0, null, false, null, 28, null);
        }
        return C56390yDp.OLrzqt(percentWithoutSymbol$default, java.lang.Integer.valueOf(C23313hvq.KWHzl(str, "0.05") ? C52761wXj.ActionBar.DCUTEI : C52761wXj.ActionBar.OuxcSI));
    }

    public static final void OLrzqt(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        textView.setText(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? C25322iuY.OLrzqt.EZpvd(str) : "", (Function0<java.lang.String>) new Function0() { // from class: o.kjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28926kjw.EZpvd();
            }
        }));
        textView.setTextColor(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context));
    }
}
