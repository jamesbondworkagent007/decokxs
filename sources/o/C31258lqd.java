package o;

import android.view.ViewGroup;
import com.okinc.business.dexlogic.txs.TxType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31258lqd {

    /* JADX INFO: renamed from: o.lqd$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TxType.values().length];
            try {
                iArr[TxType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TxType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public static final void copydefault(@NotNull android.widget.TextView textView, @NotNull TxType txType) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(txType, "");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.height = C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        C25352ivB.AEQbTJ(textView, C52761wXj.LoaderManager.DTwDnp);
        int i = StateListAnimator.OLrzqt[txType.ordinal()];
        if (i == 1) {
            textView.setBackground(C33070mpX.KWHzl(C23274hvD.ActionBar.KWHzl));
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null));
            textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getOnBackPressedDispatcher));
            return;
        }
        if (i != 2) {
            return;
        }
        textView.setBackground(C33070mpX.KWHzl(C23274hvD.ActionBar.OLrzqt));
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setTextColor(C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null));
        textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.onActivityResult));
    }

    public static /* synthetic */ void setTextColorOrDisabledColor$default(android.widget.TextView textView, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = C52761wXj.Activity.UlJrfe;
        }
        copydefault(textView, i, i2);
    }

    public static final void copydefault(@NotNull android.widget.TextView textView, int i, int i2) {
        Intrinsics.checkNotNullParameter(textView, "");
        if (C59449zhJ.AEQbTJ(textView.getText(), "--")) {
            i = i2;
        }
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(C25382ivf.copydefault(i, context));
    }

    public static final void EZpvd(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        java.lang.CharSequence text = textView.getText();
        if (text instanceof android.text.Spannable) {
            android.text.Spannable spannable = (android.text.Spannable) text;
            java.util.Iterator itEZpvd = yHX.EZpvd((android.text.style.ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.ForegroundColorSpan.class));
            while (itEZpvd.hasNext()) {
                spannable.removeSpan((android.text.style.ForegroundColorSpan) itEZpvd.next());
            }
            textView.setText(text);
        }
    }

    public static /* synthetic */ void setTextAndColor$default(android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        copydefault(textView, charSequence, str, i);
    }

    public static final void copydefault(@NotNull android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setText(charSequence);
        textView.setTextColor(C31256lqb.KWHzl(str, C25382ivf.KWHzl(i)));
    }
}
