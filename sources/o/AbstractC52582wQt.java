package o;

import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.utils.MPPointF;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52582wQt extends MarkerView {
    public final java.lang.String AhwBna;
    public final MPPointF AkhnZx;
    public final android.widget.ImageView AuCTel;
    public final android.graphics.Paint DbNXlk;
    public Entry djBIcL;
    public final PointF fARcdN;
    public final android.widget.ImageView fIwbmz;
    public Highlight fetchVPNInfo;
    public final float isConnected;
    public final android.graphics.Paint valueOf;
    public final float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointF EZpvd() {
        return this.fARcdN;
    }

    public abstract java.util.ArrayList<java.lang.Integer> KWHzl();

    public abstract android.view.View OLrzqt(@NotNull android.view.ViewGroup viewGroup);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC52582wQt(@NotNull android.content.Context context) {
        super(context, C48033uCm.Activity.Ohcwxs);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = "optionsLog markerView";
        android.view.View viewFindViewById = findViewById(C48033uCm.Application.setDrawerIndicatorEnabled);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.fIwbmz = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(C48033uCm.Application.onDrawerSlide);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.AuCTel = (android.widget.ImageView) viewFindViewById2;
        this.fARcdN = new PointF();
        this.isConnected = C33052mpF.AEQbTJ(4.0f, context);
        this.values = C33052mpF.AEQbTJ(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.valueOf = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.DbNXlk = paint2;
        android.view.View viewFindViewById3 = findViewById(C48033uCm.Application.zFtALg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        OLrzqt((android.view.ViewGroup) viewFindViewById3);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C32113mPz.ActionBar.QKVWgx));
        paint2.setStyle(style);
        this.AkhnZx = new MPPointF();
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.djBIcL = entry;
        this.fetchVPNInfo = highlight;
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (highlight != null) {
            EZpvd(this.fIwbmz, highlight.getDrawX(), getMeasuredWidth());
            EZpvd(this.AuCTel, highlight.getDrawX(), getMeasuredWidth());
        }
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    private final void EZpvd(android.widget.ImageView imageView, float f, int i) {
        Chart chartView = getChartView();
        if (chartView instanceof PieChart) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = (int) ((i / 2.0f) - (r5.width / 2));
            return;
        }
        float f2 = i;
        float f3 = f2 / 2.0f;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        if (f < f3) {
            layoutParams3.leftMargin = (int) (f - (layoutParams3.width / 2));
        } else if (chartView != null && f + f3 > chartView.getWidth()) {
            layoutParams3.leftMargin = (int) ((f2 - (chartView.getWidth() - f)) - (layoutParams3.width / 2));
        } else {
            layoutParams3.leftMargin = (int) (f3 - (layoutParams3.width / 2));
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        Chart chartView = getChartView();
        Entry entry = this.djBIcL;
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && entry != null) {
            int i = 0;
            for (java.lang.Object obj : KWHzl()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                int iIntValue = ((java.lang.Number) obj).intValue();
                if (iIntValue != 0) {
                    this.valueOf.setColor(iIntValue);
                    copydefault(canvas, f, f2);
                }
                i++;
            }
        }
        PointF pointF = this.fARcdN;
        pointF.x = f;
        pointF.y = f2;
        super.draw(canvas, f, f2);
    }

    private final void copydefault(android.graphics.Canvas canvas, float f, float f2) {
        int iAEQbTJ = C33570myu.AEQbTJ();
        Highlight highlight = this.fetchVPNInfo;
        int i = iAEQbTJ / 2;
        if (C33129mqd.AEQbTJ(highlight != null ? java.lang.Float.valueOf(highlight.getDrawX()) : null, java.lang.Integer.valueOf(i))) {
            if (canvas != null) {
                canvas.drawCircle(300 + f, f2, this.isConnected, this.DbNXlk);
            }
            if (canvas != null) {
                canvas.drawCircle(f + 300, f2, this.values, this.valueOf);
                return;
            }
            return;
        }
        Highlight highlight2 = this.fetchVPNInfo;
        if (C33129mqd.gEmmrt(highlight2 != null ? java.lang.Float.valueOf(highlight2.getDrawX()) : null, java.lang.Integer.valueOf(i))) {
            if (canvas != null) {
                canvas.drawCircle(f - 300, f2, this.isConnected, this.DbNXlk);
            }
            if (canvas != null) {
                canvas.drawCircle(f - 300, f2, this.values, this.valueOf);
                return;
            }
            return;
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.isConnected, this.DbNXlk);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.values, this.valueOf);
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
        this.AkhnZx.x = AEQbTJ(f);
        this.AkhnZx.y = KWHzl(f2);
        return this.AkhnZx;
    }

    private final float AEQbTJ(float f) {
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

    private final float KWHzl(float f) {
        if (getChartView() != null && f < r0.getHeight() - f) {
            this.AuCTel.setVisibility(8);
            this.fIwbmz.setVisibility(8);
            return this.isConnected;
        }
        this.AuCTel.setVisibility(8);
        this.fIwbmz.setVisibility(8);
        return -(getHeight() + this.isConnected);
    }
}
