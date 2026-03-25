package o;

import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;

/* JADX INFO: renamed from: o.aqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7785aqQ extends AbstractC7787aqS {
    public android.content.Context AEQbTJ;
    public int AhwBna;
    public android.net.Uri EZpvd;
    public android.graphics.drawable.Drawable KWHzl;
    public int gEmmrt;
    public int valueOf;

    public C7785aqQ(int i) {
        super(i);
    }

    @Override // o.AbstractC7787aqS
    public android.graphics.drawable.Drawable copydefault() {
        try {
            return super.copydefault();
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // o.AbstractC7787aqS
    public android.graphics.drawable.Drawable OLrzqt() {
        BitmapDrawable bitmapDrawable;
        java.io.InputStream inputStreamOpenInputStream;
        BitmapDrawable bitmapDrawable2;
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            return drawable;
        }
        if (this.EZpvd != null) {
            try {
                inputStreamOpenInputStream = this.AEQbTJ.getContentResolver().openInputStream(this.EZpvd);
                bitmapDrawable2 = new BitmapDrawable(this.AEQbTJ.getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream));
            } catch (java.lang.Throwable unused) {
                bitmapDrawable = null;
            }
            try {
                bitmapDrawable2.setBounds(0, 0, bitmapDrawable2.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicHeight());
                inputStreamOpenInputStream.close();
                return bitmapDrawable2;
            } catch (java.lang.Throwable unused2) {
                bitmapDrawable = bitmapDrawable2;
                Objects.toString(this.EZpvd);
                return bitmapDrawable;
            }
        }
        try {
            android.graphics.drawable.Drawable drawable2 = this.AEQbTJ.getResources().getDrawable(this.valueOf);
            try {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                return drawable2;
            } catch (java.lang.Throwable unused3) {
                return drawable2;
            }
        } catch (java.lang.Throwable unused4) {
            return null;
        }
    }

    @Override // o.AbstractC7787aqS, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.gEmmrt;
    }

    @Override // o.AbstractC7787aqS, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        canvas.save();
        canvas.translate(this.AhwBna, 0.0f);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.restore();
    }
}
