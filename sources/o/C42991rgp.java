package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42991rgp extends ConstraintLayout {
    public final C42916rfT OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42991rgp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42991rgp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.rgp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42991rgp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42991rgp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42916rfT c42916rfTKWHzl = C42916rfT.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42916rfTKWHzl, "");
        this.OLrzqt = c42916rfTKWHzl;
        KWHzl();
        AEQbTJ();
    }

    private final void KWHzl() {
        setClickable(true);
        setFocusable(true);
    }

    private final void AEQbTJ() {
        int iCopydefault;
        if (C33512mxp.AEQbTJ.AYXKKw() == 0) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DcMfJK);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
        }
        android.widget.ImageView imageView = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        mHE.tint$default(imageView, iCopydefault, null, 2, null);
    }
}
