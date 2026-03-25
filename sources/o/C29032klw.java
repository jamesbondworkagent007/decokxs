package o;

import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29032klw extends android.view.View {
    public float AEQbTJ;
    public android.graphics.Paint AYXKKw;
    public int AhwBna;
    public android.graphics.Paint EZpvd;
    public float KWHzl;
    public int OLrzqt;
    public float copydefault;
    public float djBIcL;
    public float gEmmrt;
    public final RectF isConnected;
    public final RectF valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29032klw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29032klw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:13) call: o.klw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29032klw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29032klw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = new android.graphics.Paint(1);
        this.EZpvd = new android.graphics.Paint(1);
        this.AhwBna = C25382ivf.copydefault(C52761wXj.Activity.invokespecialODCBUN, context);
        this.OLrzqt = C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context);
        this.gEmmrt = C55298xhM.EZpvd(2.0f, context);
        this.djBIcL = C55298xhM.EZpvd(17.0f, context);
        this.copydefault = C55298xhM.EZpvd(2.0f, context);
        this.AEQbTJ = C55298xhM.EZpvd(2.0f, context);
        this.isConnected = new RectF();
        this.valueOf = new RectF();
        setupPaints();
    }

    public final void setupPaints() {
        android.graphics.Paint paint = this.AYXKKw;
        paint.setColor(this.AhwBna);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        android.graphics.Paint paint2 = this.EZpvd;
        paint2.setColor(this.OLrzqt);
        paint2.setStyle(style);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        this.isConnected.set(0.0f, height - (this.gEmmrt / 2.0f), getWidth(), (this.gEmmrt / 2.0f) + height);
        RectF rectF = this.isConnected;
        float f = this.AEQbTJ;
        canvas.drawRoundRect(rectF, f, f, this.AYXKKw);
        float width = getWidth();
        float f2 = this.djBIcL;
        float f3 = this.KWHzl * (width - f2);
        RectF rectF2 = this.valueOf;
        float f4 = this.copydefault / 2.0f;
        rectF2.set(f3, height - f4, f2 + f3, height + f4);
        RectF rectF3 = this.valueOf;
        float f5 = this.AEQbTJ;
        canvas.drawRoundRect(rectF3, f5, f5, this.EZpvd);
    }

    public final void setScrollProgress(float f) {
        float fKWHzl = C56548yJl.KWHzl(f, 0.0f, 1.0f);
        if (fKWHzl == this.KWHzl) {
            return;
        }
        this.KWHzl = fKWHzl;
        invalidate();
    }

    public final void setStyle(int i, int i2, float f, float f2) {
        this.AhwBna = i;
        this.OLrzqt = i2;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.djBIcL = C55298xhM.EZpvd(f, context);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.gEmmrt = C55298xhM.EZpvd(f2, context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.copydefault = C55298xhM.EZpvd(f2, context3);
        setupPaints();
        invalidate();
    }
}
