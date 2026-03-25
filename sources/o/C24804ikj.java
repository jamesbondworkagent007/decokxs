package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24804ikj extends LinearLayoutCompat {
    public int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24804ikj(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:14) call: o.ikj.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C24804ikj(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24804ikj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23274hvD.LoaderManager.getFieldNames);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setMaxWidth((int) typedArrayObtainStyledAttributes.getDimension(C23274hvD.LoaderManager.uzCIH, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setMaxWidth(int i) {
        this.AEQbTJ = i;
        requestLayout();
        invalidate();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(OLrzqt(i, this.AEQbTJ), i2);
    }

    public final int OLrzqt(int i, int i2) {
        if (i2 <= 0 || View.MeasureSpec.getSize(i) <= i2) {
            return i;
        }
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }
}
