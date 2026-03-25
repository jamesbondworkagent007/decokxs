package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28892kjO extends LinearLayoutCompat {
    public final hCL AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28892kjO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28892kjO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:13) call: o.kjO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28892kjO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28892kjO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        hCL hclEZpvd = hCL.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(hclEZpvd, "");
        this.AEQbTJ = hclEZpvd;
    }

    public static /* synthetic */ void setData$default(C28892kjO c28892kjO, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
        }
        c28892kjO.setData(str, i, i2);
    }

    public final void setData(@NotNull java.lang.String str, @androidx.annotation.DrawableRes int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        hCL hcl = this.AEQbTJ;
        hcl.KWHzl.setText(str);
        hcl.KWHzl.setIncludeFontPadding(false);
        hcl.KWHzl.setTextColor(i2);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(i);
        android.graphics.drawable.Drawable drawableCopydefault = drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, i2) : null;
        if (drawableCopydefault != null) {
            hcl.OLrzqt.setImageDrawable(drawableCopydefault);
        }
    }
}
