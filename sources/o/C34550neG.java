package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.neG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34550neG {
    public static /* synthetic */ void formatPercentage$default(android.widget.TextView textView, java.lang.String str, DisplaySign displaySign, java.lang.Float f, java.lang.Float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        if ((i & 8) != 0) {
            f2 = null;
        }
        EZpvd(textView, str, displaySign, f, f2);
    }

    public static final void EZpvd(@NotNull android.widget.TextView textView, java.lang.String str, @NotNull DisplaySign displaySign, java.lang.Float f, java.lang.Float f2) {
        java.lang.Float fFIwbmz;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        KWHzl(textView, str);
        float fFloatValue = (str == null || (fFIwbmz = C59443zhD.fIwbmz(str)) == null) ? 0.0f : fFIwbmz.floatValue();
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
            textView.setText("--");
            return;
        }
        if (f2 != null) {
            float fFloatValue2 = f2.floatValue();
            if (fFloatValue > f2.floatValue()) {
                textView.setText("> " + (displaySign != DisplaySign.AUTO ? Marker.ANY_NON_NULL_MARKER : "") + fFloatValue2 + "%");
                return;
            }
        }
        if (f != null) {
            float fFloatValue3 = f.floatValue();
            if (f.floatValue() > fFloatValue) {
                textView.setText("< " + fFloatValue3 + "%");
                return;
            }
        }
        RoundingMode roundingMode = RoundingMode.DOWN;
        C38307pTy c38307pTyKWHzl = C38307pTy.Companion.KWHzl(2, 2);
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Float.valueOf(fFloatValue), (java.lang.Object) 0)) {
            displaySign = DisplaySign.AUTO;
        }
        textView.setText(pTB.formatICUPercent$default(java.lang.Float.valueOf(fFloatValue), roundingMode, c38307pTyKWHzl, displaySign, null, null, 24, null));
    }

    public static final void KWHzl(@NotNull android.widget.TextView textView, java.lang.String str) {
        java.lang.Float fFIwbmz;
        Intrinsics.checkNotNullParameter(textView, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = mUM.EZpvd(context, C52761wXj.Activity.fdOvFl);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context2, 0.0f, 2, null);
        android.content.Context context3 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp, context3, 0.0f, 2, null);
        float fFloatValue = (str == null || (fFIwbmz = C59443zhD.fIwbmz(str)) == null) ? 0.0f : fFIwbmz.floatValue();
        if (fFloatValue > 0.0f) {
            iEZpvd = iTradeRiseDefault$default;
        } else if (fFloatValue < 0.0f) {
            iEZpvd = iTradeFallDefault$default;
        }
        textView.setTextColor(iEZpvd);
    }

    public static /* synthetic */ void colorIfEmptyOrZero$default(android.widget.TextView textView, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        copydefault(textView, str, num);
    }

    public static final void copydefault(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--") || C33129mqd.djBIcL(str) == 0.0f) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(mUM.EZpvd(context, C52761wXj.Activity.QwvEab));
        } else if (num != null) {
            int iIntValue = num.intValue();
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView.setTextColor(mUM.EZpvd(context2, iIntValue));
        }
    }
}
