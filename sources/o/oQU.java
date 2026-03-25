package o;

import android.graphics.Paint;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oQU extends android.view.View {
    public float AEQbTJ;
    public int OLrzqt;
    public final android.graphics.Paint copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oQU(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oQU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.oQU.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ oQU(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oQU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new android.graphics.Paint(1);
        this.AEQbTJ = C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.OLrzqt = C33070mpX.copydefault(C52761wXj.Activity.ORxRYg);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float fDp$default = this.AEQbTJ + C55298xhM.dp$default(5.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        OLrzqt(canvas, width, 0.0f, C55298xhM.dp$default(5.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(1.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(1.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        this.copydefault.setColor(this.OLrzqt);
        this.copydefault.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width, fDp$default, this.AEQbTJ, this.copydefault);
        OLrzqt(canvas, width, fDp$default + this.AEQbTJ + C55298xhM.dp$default(1.0f, (android.content.Context) null, 1, (java.lang.Object) null), (int) (getHeight() - ((this.AEQbTJ + fDp$default) + C55298xhM.dp$default(1.0f, (android.content.Context) null, 1, (java.lang.Object) null))), C55298xhM.dp$default(1.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final void OLrzqt(android.graphics.Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        this.copydefault.setColor(C33070mpX.copydefault(C52761wXj.Activity.ORxRYg));
        this.copydefault.setStyle(Paint.Style.FILL);
        float f7 = 0.0f;
        boolean z = true;
        float f8 = f2;
        while (f7 < f3) {
            float f9 = z ? f4 : f5;
            if (f7 + f9 > f3) {
                return;
            }
            float fDp$default = C55298xhM.dp$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null);
            canvas.drawRect(f - fDp$default, f8, f + fDp$default, f8 + f9, this.copydefault);
            float f10 = f9 + f6;
            f8 += f10;
            f7 += f10;
            z = false;
        }
    }
}
