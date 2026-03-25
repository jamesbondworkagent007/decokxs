package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52702wVe extends ConstraintLayout {
    public final AbstractC50898vco OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52702wVe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52702wVe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.wVe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52702wVe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52702wVe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC50898vco abstractC50898vcoOLrzqt = AbstractC50898vco.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50898vcoOLrzqt, "");
        this.OLrzqt = abstractC50898vcoOLrzqt;
        EZpvd(attributeSet);
    }

    private final void EZpvd(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.ORxRYg, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.DTwDnp, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wVb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52702wVe.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.QOLQEE, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wVf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52702wVe.AEQbTJ(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final Unit copydefault(C52702wVe c52702wVe, int i) {
        java.lang.String string = c52702wVe.getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c52702wVe.setTitle(string);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52702wVe c52702wVe, int i) {
        java.lang.String string = c52702wVe.getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c52702wVe.setSubTitle(string);
        return Unit.INSTANCE;
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.AEQbTJ.setTitle(str);
    }

    public final void setSubTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.AEQbTJ.setDescription(str);
    }

    public final void setCheckedDisable() {
        this.OLrzqt.copydefault.setImageResource(C49511upt.TaskDescription.gEmmrt);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        android.widget.ImageView imageView = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }
}
