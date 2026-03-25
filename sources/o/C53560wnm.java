package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53560wnm extends ConstraintLayout {
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt;
    public AbstractC48563uWa copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53560wnm(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53560wnm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:13) call: o.wnm.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53560wnm(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53560wnm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = "";
        this.OLrzqt = "";
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.AubY);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C48033uCm.LoaderManager.zsXlph);
        this.EZpvd = string == null ? "" : string;
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C48033uCm.LoaderManager.wlaJM);
        this.OLrzqt = string2 != null ? string2 : "";
        typedArrayObtainStyledAttributes.recycle();
        OLrzqt();
    }

    private final void OLrzqt() {
        this.copydefault = (AbstractC48563uWa) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.gkZNMa, this, true);
        setTitle(this.EZpvd);
        setContent(this.OLrzqt);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48563uWa abstractC48563uWa = this.copydefault;
        if (abstractC48563uWa == null) {
            Intrinsics.gEmmrt("");
            abstractC48563uWa = null;
        }
        abstractC48563uWa.copydefault.setText(str);
    }

    public final void setContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48563uWa abstractC48563uWa = this.copydefault;
        if (abstractC48563uWa == null) {
            Intrinsics.gEmmrt("");
            abstractC48563uWa = null;
        }
        abstractC48563uWa.KWHzl.setText(str);
    }

    public final void setContentColor(int i) {
        AbstractC48563uWa abstractC48563uWa = this.copydefault;
        if (abstractC48563uWa == null) {
            Intrinsics.gEmmrt("");
            abstractC48563uWa = null;
        }
        abstractC48563uWa.KWHzl.setTextColor(i);
    }
}
