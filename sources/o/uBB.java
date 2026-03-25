package o;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uBB extends android.view.View {
    public final android.graphics.Rect AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final int AhwBna;
    public final android.graphics.Rect AkhnZx;
    public final android.graphics.Paint EZpvd;
    public final android.graphics.drawable.Drawable OLrzqt;
    public final float djBIcL;
    public final int gEmmrt;
    public final int isConnected;
    public java.lang.String valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final int KWHzl = Color.parseColor("#3d3d3d");

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uBB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void setText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) str)) {
            return;
        }
        this.valueOf = str;
        requestLayout();
    }

    public uBB(android.content.Context context) {
        super(context);
        this.AhwBna = yII.EZpvd(OLrzqt(8.0f) + OLrzqt(3.0f));
        this.isConnected = yII.EZpvd(OLrzqt(8.0f));
        this.djBIcL = OLrzqt(4.0f);
        this.gEmmrt = yII.EZpvd(OLrzqt(8.0f));
        this.AkhnZx = new android.graphics.Rect();
        this.AEQbTJ = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(KWHzl);
        this.EZpvd = paint;
        this.OLrzqt = ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.OqhRBMiKdSzF, null);
        this.valueOf = "";
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setTextSize(EZpvd(10.0f));
        paint2.setColor(-1);
        this.AYXKKw = paint2;
    }

    public uBB(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AhwBna = yII.EZpvd(OLrzqt(8.0f) + OLrzqt(3.0f));
        this.isConnected = yII.EZpvd(OLrzqt(8.0f));
        this.djBIcL = OLrzqt(4.0f);
        this.gEmmrt = yII.EZpvd(OLrzqt(8.0f));
        this.AkhnZx = new android.graphics.Rect();
        this.AEQbTJ = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(KWHzl);
        this.EZpvd = paint;
        this.OLrzqt = ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.OqhRBMiKdSzF, null);
        this.valueOf = "";
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setTextSize(EZpvd(10.0f));
        paint2.setColor(-1);
        this.AYXKKw = paint2;
    }

    public uBB(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AhwBna = yII.EZpvd(OLrzqt(8.0f) + OLrzqt(3.0f));
        this.isConnected = yII.EZpvd(OLrzqt(8.0f));
        this.djBIcL = OLrzqt(4.0f);
        this.gEmmrt = yII.EZpvd(OLrzqt(8.0f));
        this.AkhnZx = new android.graphics.Rect();
        this.AEQbTJ = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(KWHzl);
        this.EZpvd = paint;
        this.OLrzqt = ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.OqhRBMiKdSzF, null);
        this.valueOf = "";
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setTextSize(EZpvd(10.0f));
        paint2.setColor(-1);
        this.AYXKKw = paint2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.text.TextUtils.isEmpty(this.valueOf)) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.AkhnZx.setEmpty();
        android.graphics.Paint paint = this.AYXKKw;
        java.lang.String str = this.valueOf;
        paint.getTextBounds(str, 0, str.length(), this.AkhnZx);
        if (!this.AkhnZx.isEmpty()) {
            setMeasuredDimension(this.AkhnZx.width() + this.gEmmrt, this.AhwBna + this.AkhnZx.height());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public final float OLrzqt(float f) {
        return android.util.TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public final float EZpvd(float f) {
        return android.util.TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        android.graphics.drawable.Drawable drawable = this.OLrzqt;
        if (drawable != null) {
            android.graphics.Rect rect = this.AEQbTJ;
            rect.left = 0;
            rect.right = this.AkhnZx.width() + this.gEmmrt;
            rect.top = 0;
            rect.bottom = this.AkhnZx.height() + this.isConnected;
            drawable.setBounds(rect);
        }
        android.graphics.drawable.Drawable drawable2 = this.OLrzqt;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Paint.FontMetrics fontMetrics = this.AYXKKw.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = (f - fontMetrics.top) / 2;
        canvas.drawText(this.valueOf, this.djBIcL, (this.AkhnZx.height() / 2) + (f2 - f) + OLrzqt(4.0f), this.AYXKKw);
    }
}
