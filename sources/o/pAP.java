package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pAP extends ConstraintLayout {
    public android.widget.TextView AEQbTJ;
    public android.widget.TextView AYXKKw;
    public android.widget.TextView EZpvd;
    public android.widget.TextView KWHzl;
    public android.widget.TextView OLrzqt;
    public android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pAP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pAP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.pAP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ pAP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pAP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    public final void EZpvd() {
        android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.invokespecialhlXVux, (android.view.ViewGroup) this, true);
        this.KWHzl = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.QfJbVf);
        this.OLrzqt = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.fiXcQa);
        this.EZpvd = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.dGgpab);
        this.AYXKKw = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.getSmallIconId);
        this.copydefault = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.QFTsTN);
        this.AEQbTJ = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.DKr);
        setTimeBg(false);
    }

    public final void setTime(long j) {
        KWHzl(j);
    }

    public final void KWHzl(long j) {
        android.widget.TextView textView = this.KWHzl;
        if (textView != null) {
            textView.setText(pDO.copydefault.EZpvd(j));
        }
        android.widget.TextView textView2 = this.OLrzqt;
        if (textView2 != null) {
            textView2.setText(pDO.copydefault.copydefault(j));
        }
        android.widget.TextView textView3 = this.EZpvd;
        if (textView3 != null) {
            textView3.setText(pDO.copydefault.OLrzqt(j));
        }
        android.widget.TextView textView4 = this.AYXKKw;
        if (textView4 != null) {
            textView4.setText(pDO.copydefault.KWHzl(j));
        }
    }

    public static /* synthetic */ void setTimeBg$default(pAP pap, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pap.setTimeBg(z);
    }

    public final void setTimeBg(boolean z) {
        android.widget.TextView textView = this.KWHzl;
        if (textView != null) {
            textView.setEnabled(!z);
        }
        android.widget.TextView textView2 = this.OLrzqt;
        if (textView2 != null) {
            textView2.setEnabled(!z);
        }
        android.widget.TextView textView3 = this.EZpvd;
        if (textView3 != null) {
            textView3.setEnabled(!z);
        }
        android.widget.TextView textView4 = this.AYXKKw;
        if (textView4 != null) {
            textView4.setEnabled(!z);
        }
    }
}
