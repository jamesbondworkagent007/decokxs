package com.okinc.planet.widget;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.ParcelableSpan;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class OrbitTypefaceSpanUnder28 extends TypefaceSpan implements ParcelableSpan {
    public final String EZpvd;
    public final Typeface OLrzqt;

    @Override // android.text.style.TypefaceSpan, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.text.style.TypefaceSpan
    public String getFamily() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.text.style.TypefaceSpan
    public Typeface getTypeface() {
        return this.OLrzqt;
    }

    public OrbitTypefaceSpanUnder28(@NonNull Typeface typeface) {
        this(null, typeface);
    }

    public OrbitTypefaceSpanUnder28(@Nullable String str, @Nullable Typeface typeface) {
        super(str);
        this.EZpvd = str;
        this.OLrzqt = typeface;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        OLrzqt(textPaint);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NonNull TextPaint textPaint) {
        OLrzqt(textPaint);
    }

    public final void OLrzqt(@NonNull Paint paint) {
        Typeface typeface = this.OLrzqt;
        if (typeface != null) {
            paint.setTypeface(typeface);
            return;
        }
        String str = this.EZpvd;
        if (str != null) {
            KWHzl(paint, str);
        }
    }

    public final void KWHzl(@NonNull Paint paint, @NonNull String str) {
        Typeface typeface = paint.getTypeface();
        int style = typeface == null ? 0 : typeface.getStyle();
        Typeface typefaceCreate = Typeface.create(str, style);
        int i = style & (~typefaceCreate.getStyle());
        if ((i & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typefaceCreate);
    }
}
