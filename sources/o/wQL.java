package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wQL extends android.widget.FrameLayout {
    public final uRE OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wQL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wQL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.wQL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wQL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wQL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.awiJhF, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (uRE) viewDataBindingInflate;
    }

    public final void setText(@NotNull C55852xrk c55852xrk) {
        Intrinsics.checkNotNullParameter(c55852xrk, "");
        this.OLrzqt.EZpvd.setText(c55852xrk.KWHzl());
        android.widget.TextView textView = this.OLrzqt.AEQbTJ;
        Intrinsics.copydefault(textView);
        java.lang.String strAEQbTJ = c55852xrk.AEQbTJ();
        int i = 8;
        textView.setVisibility((strAEQbTJ == null || !C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) ? 8 : 0);
        textView.setText(c55852xrk.AEQbTJ());
        android.widget.TextView textView2 = this.OLrzqt.OLrzqt;
        Intrinsics.copydefault(textView2);
        java.lang.String strCopydefault = c55852xrk.copydefault();
        if (strCopydefault != null && C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            i = 0;
        }
        textView2.setVisibility(i);
        textView2.setText(c55852xrk.copydefault());
    }
}
