package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53534wnM extends ConstraintLayout {
    public AbstractC50928vdR KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53534wnM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53534wnM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.wnM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53534wnM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53534wnM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null);
        copydefault();
    }

    private final void copydefault() {
        int i = this.copydefault;
        setPaddingRelative(i, i, i, i);
        setBackground(C33070mpX.KWHzl(C48033uCm.ActionBar.AYXKKw));
        this.KWHzl = (AbstractC50928vdR) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.sJPPOI, this, true);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50928vdR abstractC50928vdR = this.KWHzl;
        if (abstractC50928vdR == null) {
            Intrinsics.gEmmrt("");
            abstractC50928vdR = null;
        }
        abstractC50928vdR.copydefault.setText(str);
    }
}
