package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vSg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50542vSg extends ConstraintLayout {
    public Function1<? super java.lang.Boolean, Unit> AEQbTJ;
    public final AbstractC50865vcH KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50542vSg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50542vSg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super java.lang.Boolean, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.vSg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50542vSg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50542vSg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OHsvZP, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC50865vcH) viewDataBindingInflate;
        OLrzqt();
    }

    private final void OLrzqt() {
        android.widget.TextView textViewCopydefault = this.KWHzl.copydefault.copydefault();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TextViewCompat.setLineHeight(textViewCopydefault, C55298xhM.OLrzqt(0, context));
    }

    public final C47988uAv AEQbTJ() {
        C47988uAv c47988uAv = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C55052xcf copydefault() {
        C55052xcf c55052xcf = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
        return c55052xcf;
    }

    public final AppCompatTextView KWHzl() {
        AppCompatTextView appCompatTextView = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AEQbTJ = null;
    }
}
