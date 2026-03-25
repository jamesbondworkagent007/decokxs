package o;

import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19626gJi implements IMarker {
    public final android.graphics.Rect AEQbTJ;
    public final MPPointF AYXKKw;
    public FSize AhwBna;
    public final android.graphics.drawable.Drawable EZpvd;
    public float KWHzl;
    public final android.graphics.Rect OLrzqt;
    public final android.graphics.drawable.Drawable copydefault;
    public WeakReference<Chart<?>> djBIcL;
    public final android.graphics.drawable.Drawable gEmmrt;
    public final android.graphics.Rect valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        return this.AYXKKw;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
    }

    public C19626gJi(@NotNull android.content.Context context, @androidx.annotation.DrawableRes int i, @androidx.annotation.DrawableRes int i2, @androidx.annotation.DrawableRes int i3, @androidx.annotation.ColorInt int i4) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
        android.graphics.drawable.Drawable drawable2 = null;
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.OLrzqt(20, context), C55298xhM.OLrzqt(20, context));
            drawable.setTint(i4);
        } else {
            drawable = null;
        }
        this.copydefault = drawable;
        android.graphics.drawable.Drawable drawable3 = ContextCompat.getDrawable(context, i2);
        if (drawable3 != null) {
            drawable3.setTint(i4);
        } else {
            drawable3 = null;
        }
        this.gEmmrt = drawable3;
        android.graphics.drawable.Drawable drawable4 = ContextCompat.getDrawable(context, i3);
        if (drawable4 != null) {
            drawable4.setTint(i4);
            drawable2 = drawable4;
        }
        this.EZpvd = drawable2;
        this.AYXKKw = new MPPointF();
        this.AhwBna = new FSize();
        this.OLrzqt = new android.graphics.Rect();
        this.valueOf = new android.graphics.Rect();
        this.AEQbTJ = new android.graphics.Rect();
    }

    public final void copydefault(@NotNull Chart<?> chart) {
        Intrinsics.checkNotNullParameter(chart, "");
        this.djBIcL = new WeakReference<>(chart);
    }

    private final Chart<?> EZpvd() {
        WeakReference<Chart<?>> weakReference = this.djBIcL;
        if (weakReference == null) {
            return null;
        }
        Intrinsics.copydefault(weakReference);
        return weakReference.get();
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        MPPointF mPPointF = new MPPointF();
        FSize fSize = this.AhwBna;
        float intrinsicWidth = fSize.width;
        float intrinsicHeight = fSize.height;
        if (intrinsicWidth == 0.0f && (drawable2 = this.copydefault) != null) {
            intrinsicWidth = drawable2.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && (drawable = this.copydefault) != null) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        float f3 = 2;
        mPPointF.x = intrinsicWidth / f3;
        mPPointF.y = intrinsicHeight / f3;
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(@NotNull android.graphics.Canvas canvas, float f, float f2) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.copydefault == null || this.gEmmrt == null || this.EZpvd == null) {
            return;
        }
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        int intrinsicWidth = this.copydefault.getIntrinsicWidth();
        int intrinsicHeight = this.copydefault.getIntrinsicHeight();
        this.copydefault.copyBounds(this.OLrzqt);
        android.graphics.drawable.Drawable drawable = this.copydefault;
        android.graphics.Rect rect = this.OLrzqt;
        int i = rect.left;
        int i2 = rect.top;
        drawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        int iSave = canvas.save();
        canvas.translate(f - offsetForDrawingAtPoint.x, f2 - offsetForDrawingAtPoint.y);
        this.copydefault.draw(canvas);
        canvas.restoreToCount(iSave);
        this.copydefault.setBounds(this.OLrzqt);
        MPPointF mPPointFAEQbTJ = AEQbTJ(this.gEmmrt);
        float intrinsicWidth2 = this.gEmmrt.getIntrinsicWidth();
        Chart<?> chartEZpvd = EZpvd();
        int height = chartEZpvd != null ? chartEZpvd.getHeight() : this.gEmmrt.getIntrinsicHeight();
        this.gEmmrt.copyBounds(this.valueOf);
        android.graphics.drawable.Drawable drawable2 = this.gEmmrt;
        android.graphics.Rect rect2 = this.valueOf;
        int i3 = rect2.left;
        int i4 = rect2.top;
        drawable2.setBounds(i3, ((int) this.KWHzl) + i4, ((int) intrinsicWidth2) + i3, i4 + height);
        int iSave2 = canvas.save();
        canvas.translate(f - mPPointFAEQbTJ.x, 0.0f);
        this.gEmmrt.draw(canvas);
        canvas.restoreToCount(iSave2);
        this.gEmmrt.setBounds(this.valueOf);
        MPPointF mPPointFAEQbTJ2 = AEQbTJ(this.EZpvd);
        Chart<?> chartEZpvd2 = EZpvd();
        int width = chartEZpvd2 != null ? chartEZpvd2.getWidth() : this.EZpvd.getIntrinsicWidth();
        float intrinsicHeight2 = this.EZpvd.getIntrinsicHeight();
        this.EZpvd.copyBounds(this.AEQbTJ);
        android.graphics.drawable.Drawable drawable3 = this.EZpvd;
        android.graphics.Rect rect3 = this.AEQbTJ;
        int i5 = rect3.left;
        int i6 = rect3.top;
        drawable3.setBounds(i5, i6, width + i5, ((int) intrinsicHeight2) + i6);
        int iSave3 = canvas.save();
        canvas.translate(0.0f, f2 - mPPointFAEQbTJ2.y);
        this.EZpvd.draw(canvas);
        canvas.restoreToCount(iSave3);
        this.EZpvd.setBounds(this.AEQbTJ);
    }

    public final MPPointF AEQbTJ(android.graphics.drawable.Drawable drawable) {
        MPPointF mPPointF = new MPPointF();
        FSize fSize = this.AhwBna;
        float intrinsicWidth = fSize.width;
        float intrinsicHeight = fSize.height;
        if (intrinsicWidth == 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && drawable != null) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        float f = 2;
        mPPointF.x = intrinsicWidth / f;
        mPPointF.y = intrinsicHeight / f;
        return mPPointF;
    }
}
