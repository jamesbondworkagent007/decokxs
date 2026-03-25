package o;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55118xds extends android.widget.LinearLayout {
    public int AEQbTJ;
    public int EZpvd;
    public float OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55118xds(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:17) call: o.xds.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55118xds(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55118xds(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = Integer.MAX_VALUE;
        this.AEQbTJ = Integer.MAX_VALUE;
        this.copydefault = 1.0f;
        this.OLrzqt = 1.0f;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.DXXBbs);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.EZpvd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ODWQjV, this.EZpvd);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.DarRvM, this.AEQbTJ);
        this.copydefault = typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.OqFWZa, this.copydefault);
        this.OLrzqt = typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.zuWLRA, this.OLrzqt);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setMaxHeight(int i) {
        this.EZpvd = i;
        requestLayout();
    }

    public final void setMaxWidth(int i) {
        this.AEQbTJ = i;
        requestLayout();
    }

    public final void setMaxHeightPercent(float f) {
        this.copydefault = f;
        requestLayout();
    }

    public final void setMaxWidthPercent(float f) {
        this.OLrzqt = f;
        requestLayout();
    }

    public final int copydefault(int i) {
        int iValueOf = C56548yJl.valueOf(i, this.EZpvd);
        float f = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(getContext().getResources(), "");
        return C56548yJl.valueOf(iValueOf, (int) (f * C55302xhQ.AEQbTJ(r1)));
    }

    public final int OLrzqt(int i) {
        int iValueOf = C56548yJl.valueOf(i, this.AEQbTJ);
        float f = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        return C56548yJl.valueOf(iValueOf, (int) (f * C55302xhQ.OLrzqt(r1)));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(OLrzqt(getMeasuredWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(copydefault(getMeasuredHeight()), 1073741824));
    }
}
