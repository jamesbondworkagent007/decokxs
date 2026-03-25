package o;

import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55162xej;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31911mIm extends android.widget.FrameLayout implements C55162xej.Activity {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public float AEQbTJ;
    public int AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final android.graphics.Path EZpvd;
    public final C55162xej OLrzqt;
    public float copydefault;
    public final android.graphics.Path djBIcL;
    public final RectF gEmmrt;
    public float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31911mIm(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31911mIm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCornerRadius(float f) {
        this.copydefault = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.mIm.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C31911mIm(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31911mIm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C55162xej c55162xej = new C55162xej(context, null, 0, 6, null);
        c55162xej.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c55162xej.setPadding(0, 0, 0, C55298xhM.copydefault(10.0f, context));
        this.OLrzqt = c55162xej;
        this.EZpvd = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.AhwBna = paint;
        this.gEmmrt = new RectF();
        this.djBIcL = new android.graphics.Path();
        setWillNotDraw(false);
        addView(c55162xej);
        c55162xej.setOnLineReadyListener(this);
    }

    public final void setData(@NotNull java.util.List<java.lang.Float> list, float f, @androidx.annotation.ColorInt int i) {
        Intrinsics.checkNotNullParameter(list, "");
        C55162xej c55162xej = this.OLrzqt;
        C55162xej.setEntries$default(c55162xej, list, null, 0.0f, 6, null);
        c55162xej.setLineWidth(f);
        c55162xej.setLineColor(i);
        c55162xej.invalidate();
        invalidate();
    }

    public final void setChartBottomPadding(int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.OLrzqt.setPadding(0, 0, 0, C55298xhM.copydefault(i, context));
    }

    public final void setShadowColor(@androidx.annotation.ColorInt int i) {
        this.AYXKKw = i;
        copydefault(this.AEQbTJ);
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        float f = i;
        this.valueOf = f;
        float f2 = i2;
        this.AEQbTJ = f2;
        AEQbTJ(f, f2);
        copydefault(this.AEQbTJ);
    }

    @Override // o.C55162xej.Activity
    public void KWHzl(@NotNull java.util.List<? extends PointF> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        android.graphics.Path path = this.EZpvd;
        path.reset();
        int i3 = 0;
        for (java.lang.Object obj : list) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            PointF pointF = (PointF) obj;
            if (i3 == 0) {
                path.moveTo(pointF.x, pointF.y);
            } else {
                path.lineTo(pointF.x, pointF.y);
            }
            i3++;
        }
        path.lineTo(((PointF) CollectionsKt___CollectionsKt.AubY(list)).x, getHeight());
        path.lineTo(((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).x, getHeight());
        path.lineTo(((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).x, ((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).y);
        path.close();
        invalidate();
    }

    private final void AEQbTJ(float f, float f2) {
        this.gEmmrt.set(0.0f, 0.0f, f, f2 - 8.0f);
        android.graphics.Path path = this.djBIcL;
        path.reset();
        RectF rectF = this.gEmmrt;
        float f3 = this.copydefault;
        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f3, f3, f3, f3}, Path.Direction.CW);
        path.close();
    }

    private final void copydefault(float f) {
        this.AhwBna.setShader(KWHzl(f));
    }

    private final LinearGradient KWHzl(float f) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, f, ColorUtils.setAlphaComponent(this.AYXKKw, 80), 0, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: o.mIm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mIm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.Path path = this.djBIcL;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.Path path = this.djBIcL;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.onDraw(canvas);
            canvas.drawPath(this.EZpvd, this.AhwBna);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
