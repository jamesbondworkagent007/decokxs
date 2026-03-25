package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22277hcN extends android.view.View {
    public C55363xiY copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22277hcN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22277hcN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.hcN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22277hcN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22277hcN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        if (isInEditMode()) {
            setBackgroundColor(C25382ivf.copydefault(C52761wXj.Activity.gdLjtZ, context));
        }
        int[] iArr = C23274hvD.LoaderManager.sSMYrx;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.copydefault = new C55363xiY(typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.DTwDnp, false), false, false, null, null, typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.QKVWgx, false), typedArrayObtainStyledAttributes.hasValue(C23274hvD.LoaderManager.QOLQEE) ? java.lang.Integer.valueOf((int) (typedArrayObtainStyledAttributes.getDimensionPixelSize(C23274hvD.LoaderManager.QOLQEE, 0) / context.getResources().getDisplayMetrics().density)) : null, false, false, 0, null, null, MTPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED, null);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void KWHzl() {
        C55363xiY c55363xiY = this.copydefault;
        if (c55363xiY != null) {
            C55418xja.KWHzl(this, c55363xiY);
        }
    }
}
