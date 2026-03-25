package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55022xcB extends ConstraintLayout {
    public final C54938xaX AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55022xcB(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleAndMessage() {
        setTitleAndMessage$default(this, null, null, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleAndMessage(java.lang.CharSequence charSequence) {
        setTitleAndMessage$default(this, charSequence, null, 2, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.xcB.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55022xcB(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55022xcB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54938xaX c54938xaXOLrzqt = C54938xaX.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54938xaXOLrzqt, "");
        this.AEQbTJ = c54938xaXOLrzqt;
        c54938xaXOLrzqt.getRoot().setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
    }

    public static /* synthetic */ void setTitleAndMessage$default(C55022xcB c55022xcB, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        c55022xcB.setTitleAndMessage(charSequence, charSequence2);
    }

    public final void setTitleAndMessage(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        AppCompatTextView appCompatTextView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C55307xhV.AEQbTJ(appCompatTextView, charSequence);
        AppCompatTextView appCompatTextView2 = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        C55307xhV.AEQbTJ(appCompatTextView2, charSequence2);
    }

    public final android.widget.TextView OLrzqt() {
        AppCompatTextView appCompatTextView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    public final android.widget.TextView copydefault() {
        AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }
}
