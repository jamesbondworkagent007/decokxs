package o;

import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ole, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37004ole extends android.view.View {
    public final java.util.List<java.lang.Float> AEQbTJ;
    public float AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final RectF AkhnZx;
    public float EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public final float copydefault;
    public final float djBIcL;
    public float fetchVPNInfo;
    public final int gEmmrt;
    public final android.graphics.Paint valueOf;
    public final float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37004ole(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37004ole(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.ole.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C37004ole(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37004ole(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
        paint.setStrokeWidth(3.0f);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.AhwBna = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.GiPPlLgiPPlL));
        paint2.setStrokeWidth(3.0f);
        paint2.setStyle(style);
        this.valueOf = paint2;
        this.gEmmrt = 10000;
        float f = context.getResources().getDisplayMetrics().density;
        this.copydefault = f;
        float f2 = 2.0f * f;
        this.KWHzl = f2;
        this.values = (f * 3.0f) + f2;
        this.djBIcL = 3.0f;
        this.OLrzqt = 6.0f;
        this.fetchVPNInfo = f2;
        float f3 = 2;
        this.EZpvd = f2 * f3;
        this.AYXKKw = f2 / f3;
        this.AkhnZx = new RectF();
    }

    public final void EZpvd(int i) {
        this.AEQbTJ.add(0, java.lang.Float.valueOf(C56548yJl.copydefault((float) java.lang.Math.pow(i / this.gEmmrt, 0.5d), 0.05f)));
        int width = (int) (getWidth() / this.values);
        while (this.AEQbTJ.size() > width) {
            this.AEQbTJ.remove(r0.size() - 1);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = 0.5f * height;
        int i = (int) (width / this.values);
        float f2 = this.djBIcL;
        float f3 = 10.0f;
        float f4 = ((0.05f * height) * this.OLrzqt) / 10.0f;
        for (int size = this.AEQbTJ.size(); size < i; size++) {
            float f5 = width - (size * this.values);
            if (f5 < 0.0f) {
                break;
            }
            if (size >= this.AEQbTJ.size()) {
                RectF rectF = this.AkhnZx;
                float f6 = 2;
                float f7 = this.fetchVPNInfo / f6;
                float f8 = (f2 + f4) / f6;
                rectF.set(f5 - f7, f - f8, f5 + f7, f8 + f);
                RectF rectF2 = this.AkhnZx;
                float f9 = this.AYXKKw;
                canvas.drawRoundRect(rectF2, f9, f9, this.valueOf);
            }
        }
        int size2 = this.AEQbTJ.size();
        int i2 = 0;
        while (i2 < size2) {
            float f10 = width - (i2 * this.values);
            if (f10 < 0.0f) {
                return;
            }
            float f11 = 2;
            float fFloatValue = (this.djBIcL + (((this.AEQbTJ.get(i2).floatValue() * height) * this.OLrzqt) / f3)) / f11;
            float fMin = java.lang.Math.min(this.EZpvd, fFloatValue);
            RectF rectF3 = this.AkhnZx;
            float f12 = this.KWHzl / f11;
            rectF3.set(f10 - f12, f - fFloatValue, f10 + f12, fFloatValue + f);
            canvas.drawRoundRect(this.AkhnZx, fMin, fMin, this.AhwBna);
            i2++;
            f3 = 10.0f;
        }
    }

    public final void AEQbTJ() {
        this.AEQbTJ.clear();
        invalidate();
    }
}
