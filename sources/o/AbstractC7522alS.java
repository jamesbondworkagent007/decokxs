package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.alS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC7522alS extends MarkerView {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final android.graphics.Paint AYXKKw;
    public final java.lang.String AhwBna;
    public final android.graphics.Paint AkhnZx;
    public float AuCTel;
    public final android.widget.ImageView AuCTelauCTel;
    public Entry DbNXlk;
    public float djBIcL;
    public float ejfBZ;
    public int fARcdN;
    public final android.graphics.Paint fIwbmz;
    public float fJNWhG;
    public boolean fetchVPNInfo;
    public final android.widget.FrameLayout gEmmrt;
    public float getFieldNames;
    public float getNewProxyInstance;
    public float hDKMBd;
    public Highlight isConnected;
    public android.graphics.Paint iwGUEr;
    public final android.widget.ImageView uzCIH;
    public java.lang.Integer valueOf;
    public final MPPointF values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView EZpvd() {
        return this.AuCTelauCTel;
    }

    public abstract java.util.ArrayList<java.lang.Integer> KWHzl();

    public abstract android.view.View OLrzqt(@NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView OLrzqt() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.FrameLayout copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBarWidth(float f) {
        this.djBIcL = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaintRadius2(float f) {
        this.ejfBZ = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPointCenterRadius(float f) {
        this.AuCTel = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPointRadius(float f) {
        this.fJNWhG = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPointerDirection(int i) {
        this.fARcdN = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7522alS(@NotNull android.content.Context context) {
        super(context, C7343ahz.Activity.AubY);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = "optionsLog markerView";
        android.view.View viewFindViewById = findViewById(C7343ahz.TaskDescription.fZBcTu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.AuCTelauCTel = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(C7343ahz.TaskDescription.dvKsVJ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.uzCIH = (android.widget.ImageView) viewFindViewById2;
        android.view.View viewFindViewById3 = findViewById(C7343ahz.TaskDescription.isConnected);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.gEmmrt = (android.widget.FrameLayout) viewFindViewById3;
        this.fJNWhG = C33052mpF.AEQbTJ(6.0f, context);
        this.AuCTel = C33052mpF.AEQbTJ(4.0f, context);
        this.djBIcL = 20.0f;
        this.ejfBZ = C33052mpF.AEQbTJ(16.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AYXKKw = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AkhnZx = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.fIwbmz = paint3;
        this.getNewProxyInstance = C7865arr.copydefault(4.0f);
        android.view.View viewFindViewById4 = findViewById(C7343ahz.TaskDescription.isConnected);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        OLrzqt((android.view.ViewGroup) viewFindViewById4);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C32113mPz.ActionBar.QKVWgx));
        paint2.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setColor(ContextCompat.getColor(context, C52761wXj.Activity.aBDePw));
        paint3.setStyle(style);
        this.values = new MPPointF();
    }

    public final void setShadow(float f, float f2, @NotNull C7350aiF c7350aiF, float f3) {
        Intrinsics.checkNotNullParameter(c7350aiF, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.iwGUEr = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.iwGUEr;
        if (paint2 != null) {
            paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        }
        android.graphics.Paint paint3 = this.iwGUEr;
        if (paint3 != null) {
            paint3.setAlpha((int) (f * 255));
        }
        android.graphics.Paint paint4 = this.iwGUEr;
        if (paint4 != null) {
            paint4.setMaskFilter(new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL));
        }
        this.hDKMBd = c7350aiF.copydefault();
        this.getFieldNames = c7350aiF.AEQbTJ();
        this.getNewProxyInstance = f3;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.DbNXlk = entry;
        this.isConnected = highlight;
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (highlight != null) {
            setTriangleMargin(this.AuCTelauCTel, highlight.getDrawX(), getMeasuredWidth());
            setTriangleMargin(this.uzCIH, highlight.getDrawX(), getMeasuredWidth());
        }
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setTriangleMargin(android.widget.ImageView imageView, float f, int i) {
        Chart chartView = getChartView();
        if (chartView instanceof PieChart) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((LinearLayout.LayoutParams) layoutParams).setMarginStart((int) ((i / 2.0f) - (r5.width / 2)));
            return;
        }
        float f2 = i;
        float f3 = f2 / 2.0f;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        if (f < f3) {
            layoutParams3.setMarginStart((int) (f - (layoutParams3.width / 2)));
        } else if (chartView != null && f + f3 > chartView.getWidth()) {
            layoutParams3.setMarginStart((int) ((f2 - (chartView.getWidth() - f)) - (layoutParams3.width / 2)));
        } else {
            layoutParams3.setMarginStart((int) (f3 - (layoutParams3.width / 2)));
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        java.lang.Integer num;
        BarLineScatterCandleBubbleData data;
        java.util.Collection<IBarLineScatterCandleBubbleDataSet> dataSets;
        java.util.Collection<IBarLineScatterCandleBubbleDataSet> dataSets2;
        android.graphics.Paint paint = this.iwGUEr;
        if (paint != null) {
            MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
            java.lang.Integer numValueOf = canvas != null ? java.lang.Integer.valueOf(canvas.save()) : null;
            if (canvas != null) {
                canvas.translate(offsetForDrawingAtPoint.x + f + this.hDKMBd, offsetForDrawingAtPoint.y + f2 + this.getFieldNames);
            }
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            if (canvas != null) {
                float f3 = this.getNewProxyInstance;
                canvas.drawRoundRect(rectF, f3, f3, paint);
            }
            if (numValueOf != null) {
                canvas.restoreToCount(numValueOf.intValue());
            }
        }
        android.view.ViewParent chartView = getChartView();
        Entry entry = this.DbNXlk;
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && entry != null) {
            java.util.ArrayList<java.lang.Integer> arrayListKWHzl = KWHzl();
            if (arrayListKWHzl.size() > 0 && ((num = arrayListKWHzl.get(0)) == null || num.intValue() != 0)) {
                BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider = (BarLineScatterCandleBubbleDataProvider) chartView;
                BarLineScatterCandleBubbleData data2 = barLineScatterCandleBubbleDataProvider.getData();
                int iMax = -1;
                if (data2 != null && (dataSets2 = data2.getDataSets()) != null) {
                    for (IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet : dataSets2) {
                        if (iBarLineScatterCandleBubbleDataSet instanceof LineDataSet) {
                            LineDataSet lineDataSet = (LineDataSet) iBarLineScatterCandleBubbleDataSet;
                            if (lineDataSet.getEntryCount() > 0) {
                                iMax = java.lang.Math.max(lineDataSet.getEntryIndex(entry), iMax);
                            }
                        }
                    }
                }
                if (iMax >= 0 && (data = barLineScatterCandleBubbleDataProvider.getData()) != null && (dataSets = data.getDataSets()) != null) {
                    for (IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet2 : dataSets) {
                        if (iBarLineScatterCandleBubbleDataSet2 instanceof LineDataSet) {
                            LineDataSet lineDataSet2 = (LineDataSet) iBarLineScatterCandleBubbleDataSet2;
                            if (lineDataSet2.getEntryCount() > iMax && lineDataSet2.isHighlightEnabled()) {
                                this.AYXKKw.setColor(lineDataSet2.getColor());
                                ?? entryForIndex = lineDataSet2.getEntryForIndex(iMax);
                                MPPointD pixelForValues = barLineScatterCandleBubbleDataProvider.getTransformer(lineDataSet2.getAxisDependency()).getPixelForValues(entryForIndex.getX(), entryForIndex.getY());
                                OLrzqt(canvas, (float) pixelForValues.x, (float) pixelForValues.y);
                            }
                        }
                    }
                }
            }
        }
        super.draw(canvas, f, f2);
    }

    public final void OLrzqt(android.graphics.Canvas canvas, float f, float f2) {
        if (this.fetchVPNInfo && canvas != null) {
            canvas.drawCircle(f, f2, this.ejfBZ, this.fIwbmz);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.fJNWhG, this.AkhnZx);
        }
        java.lang.Integer num = this.valueOf;
        if (num != null) {
            this.AYXKKw.setColor(num.intValue());
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AuCTel, this.AYXKKw);
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        MPPointF offset = super.getOffset();
        Intrinsics.checkNotNullExpressionValue(offset, "");
        return offset;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        Chart chartView = getChartView();
        Entry entry = this.DbNXlk;
        if (entry instanceof BarEntry) {
            Intrinsics.copydefault(entry, "");
            if (((BarEntry) entry).isStacked() && ((f >= getWidth() || getWidth() + f <= chartView.getWidth()) && f2 < getHeight())) {
                return KWHzl(f, f2);
            }
        }
        if (f2 < getHeight() && chartView.getHeight() - f2 < getHeight()) {
            return KWHzl(f, f2);
        }
        this.values.x = AEQbTJ(f);
        this.values.y = copydefault(f2);
        return this.values;
    }

    public final MPPointF KWHzl(float f, float f2) {
        this.uzCIH.setVisibility(4);
        this.AuCTelauCTel.setVisibility(4);
        this.values.x = this.djBIcL;
        if (getWidth() + f > getChartView().getWidth()) {
            this.values.x = -(getWidth() + this.djBIcL);
        }
        if (getChartView().getHeight() - f2 > getHeight()) {
            this.values.y = 0.0f;
        } else {
            this.values.y = -(getChartView().getHeight() - getHeight());
        }
        return this.values;
    }

    public final float AEQbTJ(float f) {
        int width = getWidth() / 2;
        Chart chartView = getChartView();
        float width2 = width;
        if (f < width2) {
            return -f;
        }
        if (chartView != null && f + width2 > chartView.getWidth()) {
            width2 = getWidth() - (chartView.getWidth() - f);
        }
        return -width2;
    }

    private final float copydefault(float f) {
        float height;
        float f2;
        Chart chartView = getChartView();
        if (this.fARcdN == 2) {
            height = getHeight();
            f2 = this.fJNWhG;
        } else {
            if (chartView != null && f < chartView.getHeight() - f) {
                this.uzCIH.setVisibility(4);
                this.AuCTelauCTel.setVisibility(0);
                return this.fJNWhG;
            }
            this.AuCTelauCTel.setVisibility(4);
            this.uzCIH.setVisibility(0);
            height = getHeight();
            f2 = this.fJNWhG;
        }
        return -(height + f2);
    }

    public final void setCenterColor(int i) {
        this.valueOf = java.lang.Integer.valueOf(i);
    }

    public final void setOutLineColor(int i) {
        this.AkhnZx.setColor(i);
    }

    public final void setOutLineColor2(int i) {
        this.fetchVPNInfo = true;
        this.fIwbmz.setColor(i);
    }

    /* JADX INFO: renamed from: o.alS$TaskDescription */
    /* JADX INFO: loaded from: classes22.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.alS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
