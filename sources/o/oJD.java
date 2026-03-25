package o;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oJD extends android.view.View {
    public boolean AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public final RectF AuCTel;
    public float DbNXlk;
    public final android.graphics.Paint EZpvd;
    public android.graphics.drawable.Drawable KWHzl;
    public final float OLrzqt;
    public final RectF copydefault;
    public boolean djBIcL;
    public final android.graphics.Rect ejfBZ;
    public final android.text.TextPaint fARcdN;
    public float fIwbmz;
    public float fJNWhG;
    public final android.graphics.Paint fetchVPNInfo;
    public final android.graphics.Path gEmmrt;
    public float getFieldNames;
    public int isConnected;
    public float iwGUEr;
    public float uzCIH;
    public final android.graphics.Rect valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oJD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oJD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.oJD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ oJD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oJD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        float fApplyDimension = android.util.TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        this.OLrzqt = fApplyDimension;
        this.values = "";
        this.getFieldNames = fApplyDimension;
        this.fJNWhG = fApplyDimension;
        this.iwGUEr = fApplyDimension;
        this.isConnected = -12303292;
        this.AhwBna = -3355444;
        this.AkhnZx = ViewCompat.MEASURED_STATE_MASK;
        this.DbNXlk = android.util.TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.fARcdN = textPaint;
        this.AYXKKw = new android.graphics.Paint(1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.fetchVPNInfo = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.EZpvd = paint2;
        this.gEmmrt = new android.graphics.Path();
        this.ejfBZ = new android.graphics.Rect();
        this.valueOf = new android.graphics.Rect();
        this.copydefault = new RectF();
        this.AuCTel = new RectF();
        int[] iArr = C35399nuc.VoiceInteractor.copydefault;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C35399nuc.VoiceInteractor.AEQbTJ);
        setText(string == null ? "" : string);
        setTextColor(typedArrayObtainStyledAttributes.getColor(C35399nuc.VoiceInteractor.EZpvd, ViewCompat.MEASURED_STATE_MASK));
        setTextSize(typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.KWHzl, android.util.TypedValue.applyDimension(2, 12.0f, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics())));
        setDrawable(typedArrayObtainStyledAttributes.getDrawable(C35399nuc.VoiceInteractor.valueOf));
        setTextTopPadding(typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.AuCTel, this.getFieldNames));
        setTextBottomPadding(typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.DbNXlk, this.fJNWhG));
        setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.fetchVPNInfo, this.iwGUEr));
        setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.values, this.fIwbmz));
        setStartColor(typedArrayObtainStyledAttributes.getColor(C35399nuc.VoiceInteractor.AhwBna, this.isConnected));
        setEndColor(typedArrayObtainStyledAttributes.getColor(C35399nuc.VoiceInteractor.gEmmrt, this.AhwBna));
        setStrokeColor(typedArrayObtainStyledAttributes.getColor(C35399nuc.VoiceInteractor.isConnected, this.AkhnZx));
        setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(C35399nuc.VoiceInteractor.AkhnZx, this.DbNXlk));
        setCloseBorder(typedArrayObtainStyledAttributes.getBoolean(C35399nuc.VoiceInteractor.AYXKKw, this.AEQbTJ));
        OLrzqt(typedArrayObtainStyledAttributes.getBoolean(C35399nuc.VoiceInteractor.djBIcL, this.djBIcL));
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{C52761wXj.ActionBar.zblBkD});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
        try {
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
            if (resourceId != 0) {
                textPaint.setTypeface(ResourcesCompat.getFont(context, resourceId));
            }
            typedArrayObtainStyledAttributes2.recycle();
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setColor(this.AkhnZx);
            paint.setStrokeWidth(this.DbNXlk);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            if (this.djBIcL) {
                paint2.setStyle(style);
                paint2.setColor(-65281);
                paint2.setStrokeWidth(android.util.TypedValue.applyDimension(1, 0.5f, getResources().getDisplayMetrics()));
            }
            OLrzqt();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public final void setText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        OLrzqt();
        requestLayout();
        invalidate();
    }

    public final void setDrawable(android.graphics.drawable.Drawable drawable) {
        this.KWHzl = drawable;
        requestLayout();
        invalidate();
    }

    public final void setTextTopPadding(float f) {
        this.getFieldNames = f;
        requestLayout();
        invalidate();
    }

    public final void setTextBottomPadding(float f) {
        this.fJNWhG = f;
        requestLayout();
        invalidate();
    }

    public final void setTextStartPadding(float f) {
        this.iwGUEr = f;
        requestLayout();
        invalidate();
    }

    public final void setTextEndPadding(float f) {
        this.fIwbmz = f;
        requestLayout();
        invalidate();
    }

    public final void setStartColor(int i) {
        this.isConnected = i;
        invalidate();
    }

    public final void setEndColor(int i) {
        this.AhwBna = i;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.AkhnZx = i;
        this.fetchVPNInfo.setColor(i);
        invalidate();
    }

    public final void setStrokeWidth(float f) {
        this.DbNXlk = f;
        this.fetchVPNInfo.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public final void setCloseBorder(boolean z) {
        this.AEQbTJ = z;
        invalidate();
    }

    private final void OLrzqt(boolean z) {
        this.djBIcL = z;
        if (z && this.EZpvd.getColor() == 0) {
            this.EZpvd.setStyle(Paint.Style.STROKE);
            this.EZpvd.setColor(-65281);
            this.EZpvd.setStrokeWidth(android.util.TypedValue.applyDimension(1, 0.5f, getResources().getDisplayMetrics()));
        }
        invalidate();
    }

    public final void setTextColor(int i) {
        this.fARcdN.setColor(i);
        invalidate();
    }

    public final void setTextSize(float f) {
        this.fARcdN.setTextSize(f);
        OLrzqt();
        requestLayout();
        invalidate();
    }

    public final void OLrzqt() {
        this.uzCIH = this.fARcdN.measureText(this.values);
        android.text.TextPaint textPaint = this.fARcdN;
        java.lang.String str = this.values;
        textPaint.getTextBounds(str, 0, str.length(), this.ejfBZ);
    }

    public final void setTextPadding(float f) {
        setTextPadding(f, f, f, f);
    }

    public final void setTextPadding(float f, float f2) {
        setTextPadding(f, f2, f, f2);
    }

    public final void setTextPadding(float f, float f2, float f3, float f4) {
        setTextStartPadding(f);
        setTextTopPadding(f2);
        setTextEndPadding(f3);
        setTextBottomPadding(f4);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        float paddingTop = getPaddingTop();
        float f = this.getFieldNames;
        float fHeight = this.ejfBZ.height();
        float f2 = 2;
        int iResolveSize = android.view.View.resolveSize(yII.EZpvd(paddingTop + f + fHeight + this.fJNWhG + getPaddingBottom() + (this.DbNXlk * f2)), i2);
        float f3 = iResolveSize / 2.0f;
        if (this.KWHzl != null) {
            int paddingTop2 = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            intrinsicWidth = (int) (((iResolveSize - paddingTop2) - paddingBottom) * (r1.getIntrinsicWidth() / r1.getIntrinsicHeight()));
        } else {
            intrinsicWidth = 0;
        }
        setMeasuredDimension(android.view.View.resolveSize((int) (getPaddingLeft() + intrinsicWidth + this.iwGUEr + this.uzCIH + this.fIwbmz + f3 + getPaddingRight() + (this.DbNXlk * f2)), i), iResolveSize);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        EZpvd(i, i2);
    }

    public final void EZpvd(int i, int i2) {
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        if (drawable != null) {
            int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
            int paddingTop2 = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            this.valueOf.set(paddingLeft, paddingTop2, ((int) (paddingTop * (drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()))) + paddingLeft, paddingTop + paddingTop2);
            drawable.setBounds(this.valueOf);
        }
        float f = this.DbNXlk / 2.0f;
        float paddingTop3 = getPaddingTop() + f;
        float f2 = i2;
        float paddingBottom = (f2 - getPaddingBottom()) - f;
        float f3 = (paddingBottom - paddingTop3) / 2.0f;
        float fExactCenterX = this.valueOf.exactCenterX();
        float f4 = this.valueOf.right + this.iwGUEr + this.uzCIH + this.fIwbmz;
        float f5 = f4 + f3;
        this.copydefault.set(f4 - f3, paddingTop3, f5, paddingBottom);
        this.gEmmrt.reset();
        this.gEmmrt.moveTo(fExactCenterX, paddingTop3);
        this.gEmmrt.lineTo(f4, paddingTop3);
        this.gEmmrt.arcTo(this.copydefault, 270.0f, 180.0f);
        this.gEmmrt.lineTo(fExactCenterX, paddingBottom);
        if (this.AEQbTJ) {
            this.gEmmrt.close();
        }
        float f6 = f2 / 2.0f;
        this.AYXKKw.setShader(new LinearGradient(fExactCenterX, f6, f5, f6, this.isConnected, this.AhwBna, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        canvas.drawPath(this.gEmmrt, this.AYXKKw);
        if (this.DbNXlk > 0.0f) {
            canvas.save();
            canvas.translate(this.DbNXlk / 2.0f, 0.0f);
            canvas.drawPath(this.gEmmrt, this.fetchVPNInfo);
            canvas.restore();
        }
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        float f = this.valueOf.right + this.iwGUEr;
        float paddingTop = getPaddingTop();
        float f2 = this.DbNXlk / 2.0f;
        float height = getHeight() - getPaddingBottom();
        float f3 = this.DbNXlk / 2.0f;
        float f4 = paddingTop + f2 + this.getFieldNames;
        float f5 = (height - f3) - this.fJNWhG;
        canvas.drawText(this.values, f, (((f5 - f4) / 2.0f) + f4) - ((this.fARcdN.descent() + this.fARcdN.ascent()) / 2.0f), this.fARcdN);
        if (this.djBIcL) {
            canvas.drawRect(this.valueOf, this.EZpvd);
            this.AuCTel.set(f, f4, this.uzCIH + f, f5);
            canvas.drawRect(this.AuCTel, this.EZpvd);
            canvas.drawRect(this.copydefault, this.EZpvd);
        }
    }
}
