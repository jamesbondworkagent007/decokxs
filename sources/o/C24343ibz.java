package o;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24343ibz implements IMarker {
    public android.graphics.drawable.Drawable AEQbTJ;
    public WeakReference<Chart<?>> AYXKKw;
    public final android.graphics.Rect EZpvd;
    public android.graphics.drawable.Drawable KWHzl;
    public final android.content.Context OLrzqt;
    public final android.graphics.Rect copydefault;
    public FSize djBIcL;
    public final MPPointF gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        return this.gEmmrt;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
    }

    public C24343ibz(@NotNull android.content.Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.gEmmrt = new MPPointF();
        this.djBIcL = new FSize();
        this.copydefault = new android.graphics.Rect();
        this.EZpvd = new android.graphics.Rect();
        this.AEQbTJ = C33070mpX.EZpvd(i, context);
        this.KWHzl = C33070mpX.EZpvd(i2, context);
    }

    public final void EZpvd(@NotNull Chart<?> chart) {
        Intrinsics.checkNotNullParameter(chart, "");
        this.AYXKKw = new WeakReference<>(chart);
    }

    private final Chart<?> KWHzl() {
        WeakReference<Chart<?>> weakReference = this.AYXKKw;
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
        FSize fSize = this.djBIcL;
        Intrinsics.copydefault(fSize);
        float intrinsicWidth = fSize.width;
        FSize fSize2 = this.djBIcL;
        Intrinsics.copydefault(fSize2);
        float intrinsicHeight = fSize2.height;
        if (intrinsicWidth == 0.0f && (drawable2 = this.AEQbTJ) != null) {
            Intrinsics.copydefault(drawable2);
            intrinsicWidth = drawable2.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && (drawable = this.AEQbTJ) != null) {
            Intrinsics.copydefault(drawable);
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        float f3 = 2;
        mPPointF.x = intrinsicWidth / f3;
        mPPointF.y = intrinsicHeight / f3;
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(@NotNull android.graphics.Canvas canvas, float f, float f2) {
        int intrinsicHeight;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.AEQbTJ == null || this.KWHzl == null) {
            return;
        }
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        float fAEQbTJ = C55298xhM.AEQbTJ(62, this.OLrzqt);
        float fAEQbTJ2 = C55298xhM.AEQbTJ(62, this.OLrzqt);
        float fEZpvd = C55298xhM.EZpvd(0.5f, this.OLrzqt);
        Chart<?> chartKWHzl = KWHzl();
        if (chartKWHzl != null) {
            intrinsicHeight = chartKWHzl.getHeight();
        } else {
            android.graphics.drawable.Drawable drawable = this.KWHzl;
            Intrinsics.copydefault(drawable);
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        android.graphics.drawable.Drawable drawable2 = this.AEQbTJ;
        Intrinsics.copydefault(drawable2);
        drawable2.copyBounds(this.copydefault);
        android.graphics.drawable.Drawable drawable3 = this.AEQbTJ;
        Intrinsics.copydefault(drawable3);
        android.graphics.Rect rect = this.copydefault;
        int i = rect.left;
        int i2 = rect.top;
        drawable3.setBounds(i, i2, ((int) fAEQbTJ) + i, ((int) fAEQbTJ2) + i2);
        android.graphics.drawable.Drawable drawable4 = this.KWHzl;
        Intrinsics.copydefault(drawable4);
        drawable4.copyBounds(this.EZpvd);
        android.graphics.drawable.Drawable drawable5 = this.KWHzl;
        Intrinsics.copydefault(drawable5);
        android.graphics.Rect rect2 = this.EZpvd;
        int i3 = rect2.left;
        int i4 = rect2.top;
        drawable5.setBounds(i3, i4, ((int) fEZpvd) + i3, intrinsicHeight + i4);
        int iSave = canvas.save();
        canvas.translate(f, 0.0f);
        android.graphics.drawable.Drawable drawable6 = this.KWHzl;
        Intrinsics.copydefault(drawable6);
        drawable6.draw(canvas);
        canvas.restoreToCount(iSave);
        android.graphics.drawable.Drawable drawable7 = this.KWHzl;
        Intrinsics.copydefault(drawable7);
        drawable7.setBounds(this.EZpvd);
        int iSave2 = canvas.save();
        canvas.translate(f - offsetForDrawingAtPoint.x, f2 - offsetForDrawingAtPoint.y);
        android.graphics.drawable.Drawable drawable8 = this.AEQbTJ;
        Intrinsics.copydefault(drawable8);
        drawable8.draw(canvas);
        canvas.restoreToCount(iSave2);
        android.graphics.drawable.Drawable drawable9 = this.AEQbTJ;
        Intrinsics.copydefault(drawable9);
        drawable9.setBounds(this.copydefault);
    }
}
