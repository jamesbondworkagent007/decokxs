package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lQY extends C55008xbo {
    public AbstractC31565lwS EZpvd;
    public final lQZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lQY(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lQZ EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.lQY.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ lQY(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lQY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC31565lwS abstractC31565lwSKWHzl = AbstractC31565lwS.KWHzl(android.view.LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(abstractC31565lwSKWHzl, "");
        this.EZpvd = abstractC31565lwSKWHzl;
        this.OLrzqt = new lQZ(this);
        android.widget.LinearLayout linearLayoutAuCTel = AuCTel();
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.removeAllViews();
            linearLayoutAuCTel.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.EZpvd.getRoot().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            marginLayoutParams = marginLayoutParams == null ? new ViewGroup.MarginLayoutParams(-2, -2) : marginLayoutParams;
            marginLayoutParams.setMarginEnd((int) (12 * linearLayoutAuCTel.getResources().getDisplayMetrics().density));
            this.EZpvd.getRoot().setLayoutParams(marginLayoutParams);
            linearLayoutAuCTel.addView(this.EZpvd.getRoot());
        }
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setShowSoftInputOnFocus(false);
            c55001xbhAkhnZx.setMaxDecimalValue(2);
            c55001xbhAkhnZx.setMaxInputLength(24);
            c55001xbhAkhnZx.setShowThousandsSeparator(true);
        }
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setForceShowKeyboard(false);
        }
    }

    public final void setUpCurrencyLabel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.OLrzqt.setText(str);
    }

    public final void KWHzl() {
        android.widget.LinearLayout linearLayoutAuCTel = AuCTel();
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.setVisibility(0);
        }
    }

    public final void setTextValue(@NotNull java.lang.String str) {
        C55001xbh c55001xbhAkhnZx;
        Intrinsics.checkNotNullParameter(str, "");
        C55001xbh c55001xbhAkhnZx2 = AkhnZx();
        if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(c55001xbhAkhnZx2 != null ? c55001xbhAkhnZx2.getText() : null), (java.lang.Object) str) || (c55001xbhAkhnZx = AkhnZx()) == null) {
            return;
        }
        c55001xbhAkhnZx.setText(str);
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strIsConnected;
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        return (c55001xbhAkhnZx == null || (strIsConnected = c55001xbhAkhnZx.isConnected()) == null) ? "" : strIsConnected;
    }

    public final void setSelection(int i) {
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setSelection(i);
        }
    }

    public final void setRightLabelText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setLabelText(str);
    }
}
