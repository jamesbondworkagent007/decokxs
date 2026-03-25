package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import o.C32113mPz;

/* JADX INFO: renamed from: o.ylX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57602ylX extends android.view.View {
    public android.graphics.Paint AEQbTJ;
    public android.text.TextPaint AhwBna;
    public int EZpvd;
    public float KWHzl;
    public java.lang.String OLrzqt;
    public int copydefault;
    public int djBIcL;
    public float valueOf;

    public C57602ylX(android.content.Context context) {
        this(context, null);
    }

    public C57602ylX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public C57602ylX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KWHzl = 40.0f;
        this.valueOf = 16.0f;
        this.EZpvd = 0;
        this.djBIcL = -1;
        this.OLrzqt = "";
        this.copydefault = 0;
        AEQbTJ(attributeSet);
    }

    public void AEQbTJ(android.util.AttributeSet attributeSet) {
        int resourceId;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.RKDWNf);
        this.valueOf = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.OFhtUX, this.valueOf);
        this.djBIcL = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.dmfpNf, this.djBIcL);
        this.KWHzl = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.RdAHlO, this.KWHzl);
        this.EZpvd = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.gwTjWJ, this.EZpvd);
        if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.dHguZz) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C32113mPz.PendingIntent.dHguZz, 0)) != 0) {
            this.OLrzqt = getContext().getString(resourceId);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C32113mPz.PendingIntent.hBpjJd)) {
            this.copydefault = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.hBpjJd, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AEQbTJ = paint;
        paint.setStyle(Paint.Style.FILL);
        this.AEQbTJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.AEQbTJ.setAntiAlias(true);
        this.AEQbTJ.setColor(this.EZpvd);
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.AhwBna = textPaint;
        textPaint.setAntiAlias(true);
        this.AhwBna.setTextSize(this.valueOf);
        this.AhwBna.setColor(this.djBIcL);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        EZpvd(canvas);
        AEQbTJ(canvas);
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        android.graphics.Path path = new android.graphics.Path();
        int width = getWidth();
        int height = getHeight();
        if (width != height) {
            throw new java.lang.IllegalStateException("SlantedTextView's width must equal to height");
        }
        switch (this.copydefault) {
            case 0:
                path = EZpvd(path, width, height);
                break;
            case 1:
                path = AYXKKw(path, width, height);
                break;
            case 2:
                path = KWHzl(path, width, height);
                break;
            case 3:
                path = copydefault(path, width, height);
                break;
            case 4:
                path = OLrzqt(path, width, height);
                break;
            case 5:
                path = djBIcL(path, width, height);
                break;
            case 6:
                path = AEQbTJ(path, width, height);
                break;
            case 7:
                path = valueOf(path, width, height);
                break;
        }
        path.close();
        canvas.drawPath(path, this.AEQbTJ);
        canvas.save();
    }

    public final android.graphics.Path EZpvd(android.graphics.Path path, int i, int i2) {
        float f = i;
        path.moveTo(f, 0.0f);
        float f2 = i2;
        path.lineTo(0.0f, f2);
        path.lineTo(0.0f, f2 - this.KWHzl);
        path.lineTo(f - this.KWHzl, 0.0f);
        return path;
    }

    public final android.graphics.Path AYXKKw(android.graphics.Path path, int i, int i2) {
        float f = i;
        float f2 = i2;
        path.lineTo(f, f2);
        path.lineTo(f, f2 - this.KWHzl);
        path.lineTo(this.KWHzl, 0.0f);
        return path;
    }

    public final android.graphics.Path KWHzl(android.graphics.Path path, int i, int i2) {
        float f = i;
        float f2 = i2;
        path.lineTo(f, f2);
        path.lineTo(f - this.KWHzl, f2);
        path.lineTo(0.0f, this.KWHzl);
        return path;
    }

    public final android.graphics.Path copydefault(android.graphics.Path path, int i, int i2) {
        float f = i2;
        path.moveTo(0.0f, f);
        path.lineTo(this.KWHzl, f);
        float f2 = i;
        path.lineTo(f2, this.KWHzl);
        path.lineTo(f2, 0.0f);
        return path;
    }

    public final android.graphics.Path OLrzqt(android.graphics.Path path, int i, int i2) {
        path.lineTo(0.0f, i2);
        path.lineTo(i, 0.0f);
        return path;
    }

    public final android.graphics.Path djBIcL(android.graphics.Path path, int i, int i2) {
        float f = i;
        path.lineTo(f, 0.0f);
        path.lineTo(f, i2);
        return path;
    }

    public final android.graphics.Path AEQbTJ(android.graphics.Path path, int i, int i2) {
        float f = i2;
        path.lineTo(i, f);
        path.lineTo(0.0f, f);
        return path;
    }

    public final android.graphics.Path valueOf(android.graphics.Path path, int i, int i2) {
        float f = i2;
        path.moveTo(0.0f, f);
        float f2 = i;
        path.lineTo(f2, f);
        path.lineTo(f2, 0.0f);
        return path;
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
        float[] fArrOLrzqt = OLrzqt(canvas, (int) (canvas.getWidth() - (this.KWHzl / 2.0f)), (int) (canvas.getHeight() - (this.KWHzl / 2.0f)));
        float f = fArrOLrzqt[0];
        float f2 = fArrOLrzqt[1];
        canvas.rotate(fArrOLrzqt[4], fArrOLrzqt[2], fArrOLrzqt[3]);
        canvas.drawText(this.OLrzqt, f, f2, this.AhwBna);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final float[] OLrzqt(android.graphics.Canvas canvas, int i, int i2) {
        float[] fArr = new float[5];
        int i3 = (int) (this.KWHzl / 2.0f);
        switch (this.copydefault) {
            case 0:
            case 4:
                RectF rectF = new RectF(new android.graphics.Rect(0, 0, i, i2));
                android.text.TextPaint textPaint = this.AhwBna;
                java.lang.String str = this.OLrzqt;
                rectF.right = textPaint.measureText(str, 0, str.length());
                rectF.bottom = this.AhwBna.descent() - this.AhwBna.ascent();
                rectF.left += (r4.width() - rectF.right) / 2.0f;
                float fHeight = rectF.top + ((r4.height() - rectF.bottom) / 2.0f);
                rectF.top = fHeight;
                fArr[0] = rectF.left;
                fArr[1] = fHeight - this.AhwBna.ascent();
                fArr[2] = i / 2;
                fArr[3] = i2 / 2;
                fArr[4] = -45.0f;
                return fArr;
            case 1:
            case 5:
                RectF rectF2 = new RectF(new android.graphics.Rect(i3, 0, i + i3, i2));
                android.text.TextPaint textPaint2 = this.AhwBna;
                java.lang.String str2 = this.OLrzqt;
                rectF2.right = textPaint2.measureText(str2, 0, str2.length());
                rectF2.bottom = this.AhwBna.descent() - this.AhwBna.ascent();
                rectF2.left += (r6.width() - rectF2.right) / 2.0f;
                float fHeight2 = rectF2.top + ((r6.height() - rectF2.bottom) / 2.0f);
                rectF2.top = fHeight2;
                fArr[0] = rectF2.left;
                fArr[1] = fHeight2 - this.AhwBna.ascent();
                fArr[2] = (i / 2) + i3;
                fArr[3] = i2 / 2;
                fArr[4] = 45.0f;
                return fArr;
            case 2:
            case 6:
                RectF rectF3 = new RectF(new android.graphics.Rect(0, i3, i, i2 + i3));
                android.text.TextPaint textPaint3 = this.AhwBna;
                java.lang.String str3 = this.OLrzqt;
                rectF3.right = textPaint3.measureText(str3, 0, str3.length());
                rectF3.bottom = this.AhwBna.descent() - this.AhwBna.ascent();
                rectF3.left += (r6.width() - rectF3.right) / 2.0f;
                float fHeight3 = rectF3.top + ((r6.height() - rectF3.bottom) / 2.0f);
                rectF3.top = fHeight3;
                fArr[0] = rectF3.left;
                fArr[1] = fHeight3 - this.AhwBna.ascent();
                fArr[2] = i / 2;
                fArr[3] = (i2 / 2) + i3;
                fArr[4] = 45.0f;
                return fArr;
            case 3:
            case 7:
                RectF rectF4 = new RectF(new android.graphics.Rect(i3, i3, i + i3, i2 + i3));
                android.text.TextPaint textPaint4 = this.AhwBna;
                java.lang.String str4 = this.OLrzqt;
                rectF4.right = textPaint4.measureText(str4, 0, str4.length());
                rectF4.bottom = this.AhwBna.descent() - this.AhwBna.ascent();
                rectF4.left += (r6.width() - rectF4.right) / 2.0f;
                float fHeight4 = rectF4.top + ((r6.height() - rectF4.bottom) / 2.0f);
                rectF4.top = fHeight4;
                fArr[0] = rectF4.left;
                fArr[1] = fHeight4 - this.AhwBna.ascent();
                fArr[2] = (i / 2) + i3;
                fArr[3] = (i2 / 2) + i3;
                fArr[4] = -45.0f;
                return fArr;
            default:
                return fArr;
        }
    }

    public C57602ylX EZpvd(java.lang.String str) {
        this.OLrzqt = str;
        postInvalidate();
        return this;
    }

    public C57602ylX AEQbTJ(int i) {
        this.EZpvd = i;
        this.AEQbTJ.setColor(i);
        postInvalidate();
        return this;
    }

    public C57602ylX copydefault(int i) {
        this.djBIcL = i;
        this.AhwBna.setColor(i);
        postInvalidate();
        return this;
    }

    public C57602ylX EZpvd(int i) {
        int i2 = this.copydefault;
        if (i2 > 7 || i2 < 0) {
            throw new java.lang.IllegalArgumentException(i + "is illegal argument ,please use right value");
        }
        this.copydefault = i;
        postInvalidate();
        return this;
    }

    public C57602ylX KWHzl(int i) {
        float f = i;
        this.valueOf = f;
        this.AhwBna.setTextSize(f);
        postInvalidate();
        return this;
    }

    public C57602ylX OLrzqt(int i) {
        this.KWHzl = i;
        postInvalidate();
        return this;
    }
}
