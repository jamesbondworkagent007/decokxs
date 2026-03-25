package o;

import android.text.TextUtils;
import android.widget.LinearLayout;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24801ikg extends android.widget.LinearLayout {
    public final android.widget.TextView AEQbTJ;
    public C22947hov EZpvd;
    public DefiChainInfo KWHzl;
    public final android.widget.ImageView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24801ikg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24801ikg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChain(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.KWHzl = defiChainInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.ikg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C24801ikg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24801ikg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        C25352ivB.AEQbTJ(textView, C32113mPz.Dialog.iwGUEr);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.setMarginEnd(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
        textView.setLayoutParams(layoutParams);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        this.AEQbTJ = textView;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        layoutParams2.gravity = 16;
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(C23274hvD.ActionBar.QbewEr);
        this.OLrzqt = imageView;
        setOrientation(0);
        setPaddingRelative(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
        setBackgroundResource(C23274hvD.ActionBar.copydefault);
        addView(textView);
        addView(imageView);
    }

    public final void copydefault() {
        this.KWHzl = null;
        this.EZpvd = null;
        setVisibility(8);
    }

    public final void setData(C22947hov c22947hov) {
        java.lang.String strOLrzqt;
        java.lang.String chainName;
        setVisibility(0);
        this.EZpvd = c22947hov;
        if (c22947hov == null) {
            C25352ivB.AEQbTJ(this.AEQbTJ, C32113mPz.Dialog.wlaJM);
            this.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.DQzvGN));
            setActivated(true);
            android.widget.TextView textView = this.AEQbTJ;
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            int i = C23274hvD.Fragment.getRccTransportControlFlagsFromActions;
            DefiChainInfo defiChainInfo = this.KWHzl;
            if (defiChainInfo == null || (chainName = defiChainInfo.getChainName()) == null) {
                chainName = "";
            }
            textView.setText(C33069mpW.KWHzl(applicationOLrzqt, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", chainName))));
            return;
        }
        setActivated(false);
        C25352ivB.AEQbTJ(this.AEQbTJ, C32113mPz.Dialog.iwGUEr);
        this.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        android.widget.TextView textView2 = this.AEQbTJ;
        java.lang.String strKWHzl = c22947hov.KWHzl();
        if (strKWHzl == null) {
            if (c22947hov.OLrzqt().length() > 0 && c22947hov.EZpvd().length() > 0) {
                strOLrzqt = c22947hov.OLrzqt() + " - " + c22947hov.EZpvd();
            } else {
                strOLrzqt = C25352ivB.OLrzqt(c22947hov.copydefault());
            }
            strKWHzl = strOLrzqt;
        }
        textView2.setText(strKWHzl);
    }
}
