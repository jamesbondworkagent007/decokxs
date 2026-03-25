package o;

import android.graphics.Paint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lSN extends android.text.style.ReplacementSpan {
    public final int AEQbTJ;
    public final float EZpvd;
    public int OLrzqt;
    public final int copydefault;

    public lSN(int i, int i2, float f) {
        this.AEQbTJ = i;
        this.copydefault = i2;
        this.EZpvd = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (12.0f float) : (r3v0 float))
 A[MD:(int, int, float):void (m)] (LINE:10) call: o.lSN.<init>(int, int, float):void type: THIS */
    public /* synthetic */ lSN(int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? 12.0f : f);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(paint.measureText(charSequence, i, i2)));
        this.OLrzqt = iAhwBna;
        return iAhwBna;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.EZpvd);
        paint.setColor(this.AEQbTJ);
        canvas.drawLine(f, C33129mqd.djBIcL(C33129mqd.addS$default(java.lang.Integer.valueOf(i4), 9, null, null, null, 14, null)), f + C33129mqd.djBIcL(java.lang.Integer.valueOf(this.OLrzqt)), C33129mqd.djBIcL(C33129mqd.addS$default(java.lang.Integer.valueOf(i4), 9, null, null, null, 14, null)), paint);
        paint.setColor(this.copydefault);
        canvas.drawText(charSequence == null ? "" : charSequence, i, i2, f, C33129mqd.djBIcL(java.lang.Integer.valueOf(i4)), paint);
    }
}
