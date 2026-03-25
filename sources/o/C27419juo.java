package o;

import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27419juo implements IMarker {
    public final android.graphics.drawable.Drawable AEQbTJ;
    public final android.graphics.Rect AYXKKw;
    public final MPPointF AhwBna;
    public final android.graphics.drawable.Drawable AkhnZx;
    public android.graphics.drawable.Drawable AuCTel;
    public android.graphics.drawable.Drawable DbNXlk;
    public final android.graphics.Rect EZpvd;
    public final android.graphics.drawable.Drawable KWHzl;
    public final android.graphics.drawable.Drawable OLrzqt;
    public float copydefault;
    public FSize djBIcL;
    public final android.graphics.drawable.Drawable fetchVPNInfo;
    public WeakReference<Chart<?>> gEmmrt;
    public final android.graphics.drawable.Drawable isConnected;
    public final android.graphics.Rect valueOf;
    public android.graphics.drawable.Drawable values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(float f) {
        this.copydefault = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        return this.AhwBna;
    }

    public C27419juo(@NotNull android.content.Context context, @androidx.annotation.DrawableRes int i, @androidx.annotation.DrawableRes int i2, @androidx.annotation.DrawableRes int i3, @androidx.annotation.DrawableRes int i4, @androidx.annotation.DrawableRes int i5, @androidx.annotation.DrawableRes int i6) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
        this.isConnected = drawable;
        android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(context, i2);
        this.fetchVPNInfo = drawable2;
        android.graphics.drawable.Drawable drawable3 = ContextCompat.getDrawable(context, i3);
        this.AkhnZx = drawable3;
        this.AEQbTJ = ContextCompat.getDrawable(context, i4);
        this.OLrzqt = ContextCompat.getDrawable(context, i5);
        this.KWHzl = ContextCompat.getDrawable(context, i6);
        this.DbNXlk = drawable;
        this.AuCTel = drawable2;
        this.values = drawable3;
        this.AhwBna = new MPPointF();
        this.djBIcL = new FSize();
        this.EZpvd = new android.graphics.Rect();
        this.valueOf = new android.graphics.Rect();
        this.AYXKKw = new android.graphics.Rect();
    }

    public final void KWHzl(@NotNull Chart<?> chart) {
        Intrinsics.checkNotNullParameter(chart, "");
        this.gEmmrt = new WeakReference<>(chart);
    }

    private final Chart<?> KWHzl() {
        WeakReference<Chart<?>> weakReference = this.gEmmrt;
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
        if (intrinsicWidth == 0.0f && (drawable2 = this.DbNXlk) != null) {
            Intrinsics.copydefault(drawable2);
            intrinsicWidth = drawable2.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && (drawable = this.DbNXlk) != null) {
            Intrinsics.copydefault(drawable);
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        float f3 = 2;
        mPPointF.x = intrinsicWidth / f3;
        mPPointF.y = intrinsicHeight / f3;
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        android.graphics.drawable.Drawable drawable;
        java.lang.Object data = entry != null ? entry.getData() : null;
        InvestKLineDataPoint investKLineDataPoint = data instanceof InvestKLineDataPoint ? (InvestKLineDataPoint) data : null;
        if (investKLineDataPoint == null) {
            return;
        }
        if (investKLineDataPoint.valueOf() == InvestKLineDataPoint.Type.NORMAL) {
            this.DbNXlk = this.isConnected;
            this.AuCTel = this.fetchVPNInfo;
            drawable = this.AkhnZx;
        } else {
            this.DbNXlk = this.AEQbTJ;
            this.AuCTel = this.OLrzqt;
            drawable = this.KWHzl;
        }
        this.values = drawable;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(@NotNull android.graphics.Canvas canvas, float f, float f2) {
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.drawable.Drawable drawable = this.DbNXlk;
        if (drawable == null) {
            return;
        }
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.copyBounds(this.EZpvd);
        android.graphics.Rect rect = this.EZpvd;
        int i = rect.left;
        int i2 = rect.top;
        drawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        int iSave = canvas.save();
        canvas.translate(f - offsetForDrawingAtPoint.x, f2 - offsetForDrawingAtPoint.y);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
        drawable.setBounds(this.EZpvd);
        android.graphics.drawable.Drawable drawable2 = this.AuCTel;
        if (drawable2 == null) {
            return;
        }
        MPPointF mPPointFKWHzl = KWHzl(drawable2);
        float intrinsicWidth2 = drawable2.getIntrinsicWidth();
        Chart<?> chartKWHzl = KWHzl();
        int height = chartKWHzl != null ? chartKWHzl.getHeight() : drawable2.getIntrinsicHeight();
        drawable2.copyBounds(this.valueOf);
        android.graphics.Rect rect2 = this.valueOf;
        int i3 = rect2.left;
        int i4 = rect2.top;
        drawable2.setBounds(i3, ((int) this.copydefault) + i4, ((int) intrinsicWidth2) + i3, i4 + height);
        int iSave2 = canvas.save();
        canvas.translate(f - mPPointFKWHzl.x, 0.0f);
        drawable2.draw(canvas);
        canvas.restoreToCount(iSave2);
        drawable2.setBounds(this.valueOf);
        android.graphics.drawable.Drawable drawable3 = this.values;
        if (drawable3 == null) {
            return;
        }
        MPPointF mPPointFKWHzl2 = KWHzl(drawable3);
        Chart<?> chartKWHzl2 = KWHzl();
        int width = chartKWHzl2 != null ? chartKWHzl2.getWidth() : drawable3.getIntrinsicWidth();
        float intrinsicHeight2 = drawable3.getIntrinsicHeight();
        drawable3.copyBounds(this.AYXKKw);
        android.graphics.Rect rect3 = this.AYXKKw;
        int i5 = rect3.left;
        int i6 = rect3.top;
        drawable3.setBounds(i5, i6, width + i5, ((int) intrinsicHeight2) + i6);
        int iSave3 = canvas.save();
        canvas.translate(0.0f, f2 - mPPointFKWHzl2.y);
        drawable3.draw(canvas);
        canvas.restoreToCount(iSave3);
        drawable3.setBounds(this.AYXKKw);
    }

    private final MPPointF KWHzl(android.graphics.drawable.Drawable drawable) {
        MPPointF mPPointF = new MPPointF();
        FSize fSize = this.djBIcL;
        Intrinsics.copydefault(fSize);
        float intrinsicWidth = fSize.width;
        FSize fSize2 = this.djBIcL;
        Intrinsics.copydefault(fSize2);
        float intrinsicHeight = fSize2.height;
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
