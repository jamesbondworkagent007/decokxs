package o;

import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49654usd extends AppCompatImageView {
    public final android.graphics.Paint AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public int AhwBna;
    public float AkhnZx;
    public final java.util.List<java.lang.Object> AuCTel;
    public final int DbNXlk;
    public float EZpvd;
    public final android.graphics.Paint KWHzl;
    public int OLrzqt;
    public float copydefault;
    public android.graphics.drawable.Drawable djBIcL;
    public final java.util.Map<java.lang.String, android.graphics.drawable.Drawable> ejfBZ;
    public boolean fARcdN;
    public float fIwbmz;
    public float fJNWhG;
    public final float fetchVPNInfo;
    public java.lang.Object gEmmrt;
    public final float isConnected;
    public float valueOf;
    public final float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49654usd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49654usd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.fARcdN = false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.usd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49654usd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49654usd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.AEQbTJ = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(style);
        this.AYXKKw = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(ContextCompat.getColor(context, C52761wXj.Activity.wlaJM));
        this.KWHzl = paint3;
        this.AuCTel = new java.util.ArrayList();
        float f = context.getResources().getDisplayMetrics().density * 32.0f;
        this.isConnected = f;
        float f2 = context.getResources().getDisplayMetrics().density * 16.0f;
        this.values = f2;
        int iOLrzqt = C55298xhM.OLrzqt(4, context);
        this.DbNXlk = iOLrzqt;
        this.fIwbmz = f;
        this.AkhnZx = f2;
        this.AhwBna = iOLrzqt;
        this.fetchVPNInfo = 0.375f;
        this.ejfBZ = new LinkedHashMap();
        this.copydefault = C55298xhM.AEQbTJ(1, context);
        this.valueOf = C55298xhM.OLrzqt(0.5f, context);
        this.OLrzqt = ContextCompat.getColor(context, C52761wXj.Activity.wlaJM);
        this.EZpvd = 0.8f;
        this.fARcdN = true;
    }

    public final void setTokens(@NotNull java.lang.Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.AuCTel.clear();
        C56406yEe.KWHzl(this.AuCTel, objArr);
        OLrzqt();
    }

    public final void setChain(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.gEmmrt = obj;
        KWHzl();
    }

    public final void setTokenSize(float f) {
        this.fIwbmz = f;
        requestLayout();
    }

    public final void setChainTokenSize(float f) {
        this.AkhnZx = f;
        requestLayout();
    }

    public final void setChainOffset(int i) {
        this.AhwBna = i;
        requestLayout();
    }

    public final void setOverlapOffset(float f) {
        this.fJNWhG = f;
        requestLayout();
    }

    public final void setBorderSize(float f) {
        this.copydefault = f;
        invalidate();
    }

    public final void setChainBorderSize(float f) {
        this.valueOf = f;
        invalidate();
    }

    public final void setBorderColor(@androidx.annotation.ColorInt int i) {
        this.OLrzqt = i;
        invalidate();
    }

    public final void setBorderOverlapAdjustment(float f) {
        this.EZpvd = f;
        invalidate();
    }

    public final void OLrzqt() {
        if (this.fARcdN && AEQbTJ()) {
            this.ejfBZ.clear();
            final int i = 0;
            for (java.lang.Object obj : this.AuCTel) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                EZpvd(obj, new Function1() { // from class: o.usc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C49654usd.KWHzl(this.KWHzl, i, (android.graphics.drawable.Drawable) obj2);
                    }
                });
                i++;
            }
        }
    }

    public static final Unit KWHzl(C49654usd c49654usd, int i, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        if (c49654usd.fARcdN && c49654usd.AEQbTJ()) {
            c49654usd.ejfBZ.put("token_" + i, drawable);
            int i2 = (int) c49654usd.fIwbmz;
            drawable.setBounds(0, 0, i2, i2);
            c49654usd.invalidate();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        if (this.fARcdN && AEQbTJ()) {
            java.lang.Object obj = this.gEmmrt;
            if (obj != null) {
                EZpvd(obj, new Function1() { // from class: o.use
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C49654usd.EZpvd(this.copydefault, (android.graphics.drawable.Drawable) obj2);
                    }
                });
            } else {
                this.djBIcL = null;
                invalidate();
            }
        }
    }

    public static final Unit EZpvd(C49654usd c49654usd, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        if (c49654usd.fARcdN && c49654usd.AEQbTJ()) {
            c49654usd.djBIcL = drawable;
            int i = (int) c49654usd.AkhnZx;
            drawable.setBounds(0, 0, i, i);
            c49654usd.invalidate();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.Object obj, Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        if (this.fARcdN && AEQbTJ()) {
            if (obj instanceof java.lang.String) {
                try {
                    Intrinsics.copydefault(Glide.AEQbTJ(getContext()).EZpvd((java.lang.String) obj).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getContext())).OLrzqt(new StateListAnimator(function1)));
                } catch (java.lang.IllegalArgumentException | java.lang.Exception unused) {
                }
            } else {
                if (obj instanceof java.lang.Integer) {
                    android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), ((java.lang.Number) obj).intValue());
                    if (drawable != null) {
                        function1.invoke(drawable);
                        return;
                    }
                    return;
                }
                if (obj instanceof android.graphics.drawable.Drawable) {
                    function1.invoke(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.usd$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> OLrzqt;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
            this.OLrzqt = function1;
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            if (C49654usd.this.fARcdN && C49654usd.this.AEQbTJ()) {
                this.OLrzqt.invoke(drawable);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.AuCTel.isEmpty() && this.gEmmrt == null) {
            return;
        }
        if (this.fJNWhG == 0.0f) {
            this.fJNWhG = this.fIwbmz * this.fetchVPNInfo;
        }
        int i3 = this.gEmmrt != null ? this.AhwBna : 0;
        if (this.AuCTel.isEmpty()) {
            setMeasuredDimension(getMeasuredWidth() + i3, getMeasuredHeight() + i3);
        } else {
            float f = i3;
            setMeasuredDimension(yII.EZpvd(this.fIwbmz + (this.fJNWhG * (this.AuCTel.size() - 1)) + f), yII.EZpvd(this.fIwbmz + f));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        int size = this.AuCTel.size();
        for (int i = 0; i < size; i++) {
            int iSave = canvas.save();
            if (getLayoutDirection() == 1) {
                canvas.translate(getWidth() - (this.fIwbmz + (this.fJNWhG * i)), 0.0f);
            } else {
                canvas.translate(this.fJNWhG * i, 0.0f);
            }
            android.graphics.drawable.Drawable drawable = this.ejfBZ.get("token_" + i);
            if (drawable != null) {
                drawable.draw(canvas);
                KWHzl(canvas, this.copydefault, this.OLrzqt, this.fIwbmz / 2.0f, this.AEQbTJ);
            } else {
                AEQbTJ(canvas);
            }
            canvas.restoreToCount(iSave);
        }
        android.graphics.drawable.Drawable drawable2 = this.djBIcL;
        if (drawable2 != null) {
            int iSave2 = canvas.save();
            if (drawable2.getLayoutDirection() == 1) {
                canvas.translate(0.0f, getHeight() - this.AkhnZx);
            } else {
                canvas.translate(getWidth() - this.AkhnZx, getHeight() - this.AkhnZx);
            }
            drawable2.draw(canvas);
            KWHzl(canvas, this.valueOf, this.OLrzqt, this.AkhnZx / 2.0f, this.AYXKKw);
            canvas.restoreToCount(iSave2);
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, float f, int i, float f2, android.graphics.Paint paint) {
        if (f > 0.0f) {
            paint.setStrokeWidth(f);
            paint.setColor(i);
            canvas.drawCircle(f2, f2, (f2 - (f / 2.0f)) + this.EZpvd, paint);
        }
    }

    public final boolean AEQbTJ() {
        try {
            getContext().getResources();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        copydefault();
    }
}
