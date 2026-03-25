package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public final class kLY {
    public static /* synthetic */ void formatPercentage$default(android.widget.TextView textView, java.lang.String str, DisplaySign displaySign, java.lang.Float f, java.lang.Float f2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        AEQbTJ(textView, str, displaySign, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : num);
    }

    public static final void AEQbTJ(@NotNull android.widget.TextView textView, java.lang.String str, @NotNull DisplaySign displaySign, java.lang.Float f, java.lang.Float f2, @androidx.annotation.ColorRes java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        KWHzl(textView, str, num);
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
            textView.setText("--");
        } else {
            textView.setText(KWHzl(str, displaySign, false, f, f2));
        }
    }

    public static /* synthetic */ java.lang.String formatPercentage$default(java.lang.String str, DisplaySign displaySign, boolean z, java.lang.Float f, java.lang.Float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            f = java.lang.Float.valueOf(-99.999f);
        }
        if ((i & 8) != 0) {
            f2 = java.lang.Float.valueOf(99999.0f);
        }
        return KWHzl(str, displaySign, z, f, f2);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull DisplaySign displaySign, boolean z, java.lang.Float f, java.lang.Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        if (z) {
            str = C23313hvq.mulCheckS$default(str, 100, null, null, null, 14, null);
        }
        float fDjBIcL = C33129mqd.djBIcL(str);
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            if (fDjBIcL > f2.floatValue()) {
                return "> " + pTB.formatICUPercent$default(java.lang.Float.valueOf(fFloatValue), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), displaySign, null, null, 24, null);
            }
        }
        if (f != null) {
            float fFloatValue2 = f.floatValue();
            if (f.floatValue() > fDjBIcL) {
                return "< " + pTB.formatICUPercent$default(java.lang.Float.valueOf(fFloatValue2), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(2, 2), displaySign, null, null, 24, null);
            }
        }
        return pTB.formatICUPercent$default(java.lang.Float.valueOf(fDjBIcL), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(2, 2), displaySign, null, null, 24, null);
    }

    public static final java.lang.String OLrzqt(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        float fDjBIcL = C33129mqd.djBIcL(str);
        if (z) {
            return hSP.OLrzqt(java.lang.String.valueOf(C33129mqd.djBIcL(java.lang.Float.valueOf(fDjBIcL / C33129mqd.djBIcL(str2)))), fDjBIcL > 0.0f ? Marker.ANY_NON_NULL_MARKER : "") + " " + str3;
        }
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, java.lang.String.valueOf(fDjBIcL), true, RoundingMode.DOWN, true, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 432, null);
    }

    public static /* synthetic */ void updateColorByValue$default(android.widget.TextView textView, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        KWHzl(textView, str, num);
    }

    public static final void KWHzl(@NotNull android.widget.TextView textView, java.lang.String str, @androidx.annotation.ColorRes java.lang.Integer num) {
        java.lang.Float fFIwbmz;
        Intrinsics.checkNotNullParameter(textView, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iKWHzl = C25382ivf.KWHzl(context, num != null ? num.intValue() : C52761wXj.Activity.QwvEab);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context2, 0.0f, 2, null);
        android.content.Context context3 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp, context3, 0.0f, 2, null);
        float fFloatValue = (str == null || (fFIwbmz = C59443zhD.fIwbmz(str)) == null) ? 0.0f : fFIwbmz.floatValue();
        if (fFloatValue > 0.0f) {
            iKWHzl = iTradeRiseDefault$default;
        } else if (fFloatValue < 0.0f) {
            iKWHzl = iTradeFallDefault$default;
        }
        textView.setTextColor(iKWHzl);
    }

    public static /* synthetic */ void colorIfEmptyOrZero$default(android.widget.TextView textView, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        AEQbTJ(textView, str, num);
    }

    public static final void AEQbTJ(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--") || C33129mqd.djBIcL(str) == 0.0f) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(C25382ivf.KWHzl(context, C52761wXj.Activity.QwvEab));
        } else if (num != null) {
            int iIntValue = num.intValue();
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView.setTextColor(C25382ivf.KWHzl(context2, iIntValue));
        }
    }
}
