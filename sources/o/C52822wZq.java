package o;

import android.graphics.BlurMaskFilter;
import android.graphics.RectF;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ViewTreeObserverOnGlobalLayoutListenerC52808wZc;

/* JADX INFO: renamed from: o.wZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52822wZq extends AbstractC52821wZp {
    public final float AEQbTJ;
    public final float AYXKKw;
    public final float AhwBna;
    public final float KWHzl;
    public final float gEmmrt;
    public final float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52822wZq() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r11v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r12v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r13v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r14v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r15v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r16v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r17v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r18v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 float) : (0.0f float))
 A[MD:(float, float, float, float, float, float, float, float, float):void (m)] (LINE:26) call: o.wZq.<init>(float, float, float, float, float, float, float, float, float):void type: THIS */
    public /* synthetic */ C52822wZq(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.0f : f8, (i & 256) == 0 ? f9 : 0.0f);
    }

    public C52822wZq(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        super(f, f2, f3);
        this.AYXKKw = f4;
        this.valueOf = f5;
        this.AEQbTJ = f6;
        this.KWHzl = f7;
        this.gEmmrt = f8;
        this.AhwBna = f9;
    }

    @Override // o.AbstractC52821wZp
    public void EZpvd(android.graphics.Bitmap bitmap, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent) {
        RectF rectFOLrzqt;
        Intrinsics.copydefault(bitmap);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setDither(true);
        paint.setAntiAlias(true);
        if (this.EZpvd > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(this.EZpvd, BlurMaskFilter.Blur.SOLID));
        }
        if (pendingIntent != null && (rectFOLrzqt = pendingIntent.OLrzqt()) != null) {
            rectFOLrzqt.left -= this.AYXKKw;
            rectFOLrzqt.top -= this.valueOf;
            rectFOLrzqt.right += this.AEQbTJ;
            rectFOLrzqt.bottom += this.KWHzl;
        }
        Intrinsics.copydefault(pendingIntent);
        canvas.drawRoundRect(pendingIntent.OLrzqt(), this.gEmmrt, this.AhwBna, paint);
    }

    @Override // o.AbstractC52821wZp
    public void AEQbTJ(RectF rectF, float f, float f2) {
        Intrinsics.copydefault(rectF);
        rectF.inset(f, f2);
    }
}
