package o;

import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC46497tWn extends MarkerView {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final float AYXKKw;
    public final float AhwBna;
    public Highlight EZpvd;
    public Entry OLrzqt;
    public final android.graphics.Paint copydefault;
    public final PointF djBIcL;
    public android.graphics.Rect gEmmrt;
    public final android.widget.ImageView isConnected;
    public final android.graphics.Paint valueOf;
    public final android.widget.ImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointF AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView EZpvd() {
        return this.isConnected;
    }

    public abstract java.util.List<java.lang.Integer> KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.AYXKKw;
    }

    public abstract android.view.View copydefault(@NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView copydefault() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC46497tWn(@NotNull android.content.Context context) {
        super(context, C47501trL.Application.QXDzTk);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = new android.graphics.Rect();
        android.view.View viewFindViewById = findViewById(C47501trL.TaskDescription.HJWChPHhYHK);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.isConnected = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(C47501trL.TaskDescription.dXcUrg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.values = (android.widget.ImageView) viewFindViewById2;
        this.AYXKKw = C55298xhM.EZpvd(5.0f, context);
        this.djBIcL = new PointF();
        this.AhwBna = C55298xhM.EZpvd(3.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.valueOf = paint2;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(AbstractC46497tWn.OLrzqt(this.AEQbTJ));
            }
        });
        android.view.View viewFindViewById3 = findViewById(C47501trL.TaskDescription.DcqEDu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        copydefault((android.view.ViewGroup) viewFindViewById3);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.DGgkXd));
        paint2.setStyle(style);
    }

    /* JADX INFO: renamed from: o.tWn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tWn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final boolean gEmmrt() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(AbstractC46497tWn abstractC46497tWn) {
        return abstractC46497tWn.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.OLrzqt = entry;
        this.EZpvd = highlight;
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (highlight != null) {
            copydefault(this.isConnected, highlight.getDrawX(), getMeasuredWidth());
            copydefault(this.values, highlight.getDrawX(), getMeasuredWidth());
        }
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    private final void copydefault(android.widget.ImageView imageView, float f, int i) {
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
            if (gEmmrt()) {
                layoutParams3.rightMargin = i - ((int) (f + (layoutParams3.width / 2)));
                return;
            } else {
                layoutParams3.leftMargin = (int) (f - (layoutParams3.width / 2));
                return;
            }
        }
        if (chartView != null && f + f3 > chartView.getWidth()) {
            if (gEmmrt()) {
                layoutParams3.rightMargin = (int) ((chartView.getWidth() - f) - (layoutParams3.width / 2));
                return;
            } else {
                layoutParams3.leftMargin = (int) ((f2 - (chartView.getWidth() - f)) - (layoutParams3.width / 2));
                return;
            }
        }
        if (gEmmrt()) {
            layoutParams3.rightMargin = (int) (f3 - (layoutParams3.width / 2));
        } else {
            layoutParams3.leftMargin = (int) (f3 - (layoutParams3.width / 2));
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        android.view.ViewParent chartView = getChartView();
        Entry entry = this.OLrzqt;
        if (chartView != null && (chartView instanceof ScatterChart)) {
            copydefault(canvas, f, f2);
            return;
        }
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && entry != null) {
            int i = 0;
            for (java.lang.Object obj : KWHzl()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                int iIntValue = ((java.lang.Number) obj).intValue();
                if (iIntValue != 0) {
                    this.copydefault.setColor(iIntValue);
                    BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider = (BarLineScatterCandleBubbleDataProvider) chartView;
                    IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) barLineScatterCandleBubbleDataProvider.getData().getDataSetByIndex(i);
                    ?? entryForIndex = iBarLineScatterCandleBubbleDataSet.getEntryForIndex((int) entry.getX());
                    MPPointD pixelForValues = barLineScatterCandleBubbleDataProvider.getTransformer(iBarLineScatterCandleBubbleDataSet.getAxisDependency()).getPixelForValues(entryForIndex.getX(), entryForIndex.getY());
                    AEQbTJ(canvas, (float) pixelForValues.x, (float) pixelForValues.y);
                }
                i++;
            }
        }
        copydefault(canvas, f, f2);
    }

    private final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AYXKKw, this.valueOf);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AhwBna, this.copydefault);
        }
    }

    public final void copydefault(android.graphics.Canvas canvas, float f, float f2) {
        int iSave;
        PointF pointF = this.djBIcL;
        pointF.x = f;
        pointF.y = f2;
        try {
            MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
            if (canvas != null) {
                float f3 = offsetForDrawingAtPoint.x;
                float f4 = offsetForDrawingAtPoint.y;
                iSave = canvas.save();
                canvas.translate(f3 + f, f4 + f2);
                try {
                    android.graphics.Bitmap bitmapViewToBitmap$default = C55296xhK.viewToBitmap$default(this, 0, 0, 3, null);
                    if (bitmapViewToBitmap$default != null) {
                        canvas.drawBitmap(bitmapViewToBitmap$default, 0.0f, 0.0f, (android.graphics.Paint) null);
                    }
                    canvas.restoreToCount(iSave);
                } finally {
                }
            }
        } catch (java.lang.OutOfMemoryError e) {
            e.printStackTrace();
            pUU.KWHzl(e);
            if (canvas != null) {
                float f5 = getOffset().x;
                float f6 = getOffset().y;
                iSave = canvas.save();
                canvas.translate(f + f5, f2 + f6);
                try {
                    draw(canvas);
                } finally {
                }
            }
        }
    }
}
