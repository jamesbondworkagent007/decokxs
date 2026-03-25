package o;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xet, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55172xet extends android.view.View {
    public final android.graphics.Paint AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public final C55174xev copydefault;
    public float djBIcL;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55172xet(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55172xet(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.ixgjPv int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.xet.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55172xet(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.ixgjPv : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55172xet(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AEQbTJ = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AYXKKw = paint2;
        C55174xev c55174xev = new C55174xev(this);
        this.copydefault = c55174xev;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55174xev, attributeSet, i, 0, 4, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.config, i, C52761wXj.LoaderManager.dxcTrN);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setCount(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.zvzmfz, 0));
        setCurrentIndex(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.setLocationManually, -1));
        setActiveColor(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.resume, 0));
        setInactiveColor(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.unregister, 0));
        typedArrayObtainStyledAttributes.recycle();
        int i2 = this.EZpvd;
        paint.setColor(i2 == 0 ? c55174xev.copydefault() : i2);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        int i3 = this.gEmmrt;
        paint2.setColor(i3 == 0 ? c55174xev.EZpvd() : i3);
        paint2.setStyle(style);
    }

    public final void setCount(int i) {
        this.KWHzl = i;
        invalidate();
    }

    public final void setCurrentIndex(int i) {
        this.OLrzqt = i;
        invalidate();
    }

    public final void setActiveColor(int i) {
        this.EZpvd = i;
        this.AEQbTJ.setColor(i);
        invalidate();
    }

    public final void setInactiveColor(int i) {
        this.gEmmrt = i;
        this.AYXKKw.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLayoutParams().height = (int) this.copydefault.KWHzl();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.djBIcL = View.MeasureSpec.getSize(i);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        float f;
        float fOLrzqt;
        Intrinsics.checkNotNullParameter(canvas, "");
        float f2 = this.djBIcL;
        float fOLrzqt2 = this.copydefault.OLrzqt();
        int i = this.KWHzl;
        float f3 = (f2 - (fOLrzqt2 * (i - 1))) / i;
        float f4 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i3 = C55296xhK.OLrzqt(context) ? (this.KWHzl - 1) - i2 : i2;
            if (i2 == 0) {
                int i4 = i3;
                float f5 = f4;
                canvas.drawArc(f4, 0.0f, f4 + (this.copydefault.AEQbTJ() * 2), this.copydefault.KWHzl(), 90.0f, 180.0f, true, this.OLrzqt >= i3 ? this.AEQbTJ : this.AYXKKw);
                RectF rectF = new RectF(this.copydefault.AEQbTJ() + f5, 0.0f, f5 + f3, this.copydefault.KWHzl());
                canvas.drawRect(rectF, this.OLrzqt >= i4 ? this.AEQbTJ : this.AYXKKw);
                f = rectF.right;
                fOLrzqt = this.copydefault.OLrzqt();
            } else {
                int i5 = i3;
                float f6 = f4;
                if (i2 == this.KWHzl - 1) {
                    RectF rectF2 = new RectF(f6, 0.0f, (f6 + f3) - this.copydefault.AEQbTJ(), this.copydefault.KWHzl());
                    canvas.drawRect(rectF2, this.OLrzqt >= i5 ? this.AEQbTJ : this.AYXKKw);
                    canvas.drawArc(rectF2.right - this.copydefault.AEQbTJ(), 0.0f, rectF2.right + this.copydefault.AEQbTJ(), rectF2.bottom, 270.0f, 180.0f, true, this.OLrzqt >= i5 ? this.AEQbTJ : this.AYXKKw);
                    f4 = f6;
                } else {
                    RectF rectF3 = new RectF(f6, 0.0f, f6 + f3, this.copydefault.KWHzl());
                    canvas.drawRect(rectF3, this.OLrzqt >= i5 ? this.AEQbTJ : this.AYXKKw);
                    f = rectF3.right;
                    fOLrzqt = this.copydefault.OLrzqt();
                }
            }
            f4 = f + fOLrzqt;
        }
    }

    public void AEQbTJ() {
        int i = this.OLrzqt;
        if (i < this.KWHzl - 1) {
            setCurrentIndex(i + 1);
            invalidate();
        }
    }

    public void EZpvd() {
        int i = this.OLrzqt;
        if (i > -1) {
            setCurrentIndex(i - 1);
            invalidate();
        }
    }
}
