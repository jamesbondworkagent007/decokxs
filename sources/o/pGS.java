package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35966oKh;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pGS extends android.widget.FrameLayout {
    public final android.content.res.ColorStateList EZpvd;
    public final android.content.res.ColorStateList KWHzl;
    public android.widget.ImageView OLrzqt;
    public android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pGS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pGS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.pGS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ pGS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pGS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.AhwBna));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        this.KWHzl = colorStateListValueOf;
        android.content.res.ColorStateList colorStateListValueOf2 = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.valueOf));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "");
        this.EZpvd = colorStateListValueOf2;
        copydefault();
    }

    public final void copydefault() {
        android.view.LayoutInflater.from(getContext()).inflate(C35966oKh.Application.AEQbTJ, this);
        this.copydefault = (android.widget.ImageView) findViewById(C35966oKh.StateListAnimator.OLrzqt);
        this.OLrzqt = (android.widget.ImageView) findViewById(C35966oKh.StateListAnimator.KWHzl);
    }

    public final void EZpvd(boolean z, boolean z2) {
        android.content.res.ColorStateList colorStateList = z2 ? this.EZpvd : this.KWHzl;
        android.content.res.ColorStateList colorStateList2 = z2 ? this.KWHzl : this.EZpvd;
        if (z) {
            setSelected(true);
            android.widget.ImageView imageView = this.copydefault;
            if (imageView != null) {
                imageView.setSelected(true);
                imageView.setImageTintList(colorStateList);
            }
            android.widget.ImageView imageView2 = this.OLrzqt;
            if (imageView2 != null) {
                imageView2.setImageTintList(colorStateList);
                return;
            }
            return;
        }
        setSelected(false);
        android.widget.ImageView imageView3 = this.copydefault;
        if (imageView3 != null) {
            imageView3.setSelected(false);
            imageView3.setImageTintList(colorStateList2);
        }
        android.widget.ImageView imageView4 = this.OLrzqt;
        if (imageView4 != null) {
            imageView4.setImageTintList(colorStateList2);
        }
    }
}
