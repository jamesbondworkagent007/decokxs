package o;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
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
import o.C52761wXj;
import o.uBT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class uBX extends MarkerView {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final android.graphics.Paint AEQbTJ;
    public final float AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final PointF AkhnZx;
    public final android.widget.ImageView DbNXlk;
    public Entry EZpvd;
    public Highlight OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public java.util.List<C48032uCl> djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final float isConnected;
    public java.util.Set<java.lang.Float> valueOf;
    public final android.widget.ImageView values;

    public abstract java.util.List<java.lang.Integer> AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C48032uCl> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.isConnected;
    }

    public abstract android.view.View OLrzqt(@NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<java.lang.Float> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointF copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataList(@NotNull java.util.List<C48032uCl> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.djBIcL = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmptyXPosition(@NotNull java.util.Set<java.lang.Float> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.valueOf = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uBX(@NotNull android.content.Context context) {
        super(context, uBT.Activity.KWHzl);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View viewFindViewById = findViewById(uBT.TaskDescription.fARcdN);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
        this.values = imageView;
        android.view.View viewFindViewById2 = findViewById(uBT.TaskDescription.ejfBZ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewFindViewById2;
        this.DbNXlk = imageView2;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(uBT.TaskDescription.KWHzl);
        this.copydefault = frameLayout;
        this.isConnected = C55298xhM.EZpvd(6.0f, context);
        this.AkhnZx = new PointF();
        this.AYXKKw = C55298xhM.EZpvd(4.0f, context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AEQbTJ = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AhwBna = paint2;
        this.djBIcL = yDY.AhwBna();
        this.valueOf = yEE.copydefault();
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.uCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(uBX.OLrzqt(this.copydefault));
            }
        });
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        OLrzqt(frameLayout);
        if (frameLayout != null) {
            int iOLrzqt = (C33070mpX.OLrzqt(C52761wXj.Activity.invokespecialDPHOMC, context) & 16777215) | (-436207616);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iOLrzqt);
            gradientDrawable.setCornerRadius(C55298xhM.EZpvd(4.0f, context));
            frameLayout.setBackground(gradientDrawable);
            imageView.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iOLrzqt));
            imageView2.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iOLrzqt));
        }
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.DGgkXd));
        paint2.setStyle(style);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uBX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final boolean AYXKKw() {
        return ((java.lang.Boolean) this.gEmmrt.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(uBX ubx) {
        return ubx.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.EZpvd = entry;
        this.OLrzqt = highlight;
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (highlight != null) {
            KWHzl(this.values, highlight.getDrawX(), getMeasuredWidth());
            KWHzl(this.DbNXlk, highlight.getDrawX(), getMeasuredWidth());
        }
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    private final void KWHzl(android.widget.ImageView imageView, float f, int i) {
        Chart chartView = getChartView();
        float f2 = i;
        float f3 = f2 / 2.0f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (chartView instanceof PieChart) {
            layoutParams2.leftMargin = (int) (f3 - (layoutParams2.width / 2));
            return;
        }
        if (f < f3) {
            if (AYXKKw()) {
                layoutParams2.rightMargin = i - ((int) (f + (layoutParams2.width / 2)));
                return;
            } else {
                layoutParams2.leftMargin = (int) (f - (layoutParams2.width / 2));
                return;
            }
        }
        if (chartView != null && f + f3 > chartView.getWidth()) {
            if (AYXKKw()) {
                layoutParams2.rightMargin = (int) ((chartView.getWidth() - f) - (layoutParams2.width / 2));
                return;
            } else {
                layoutParams2.leftMargin = (int) ((f2 - (chartView.getWidth() - f)) - (layoutParams2.width / 2));
                return;
            }
        }
        if (AYXKKw()) {
            layoutParams2.rightMargin = (int) (f3 - (layoutParams2.width / 2));
        } else {
            layoutParams2.leftMargin = (int) (f3 - (layoutParams2.width / 2));
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        android.view.ViewParent chartView = getChartView();
        Entry entry = this.EZpvd;
        if (chartView != null && (chartView instanceof ScatterChart)) {
            AEQbTJ(canvas, f, f2);
            return;
        }
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && entry != null) {
            int i = 0;
            for (java.lang.Object obj : AEQbTJ()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                int iIntValue = ((java.lang.Number) obj).intValue();
                if (iIntValue != 0) {
                    this.AEQbTJ.setColor(iIntValue);
                    BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider = (BarLineScatterCandleBubbleDataProvider) chartView;
                    IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) barLineScatterCandleBubbleDataProvider.getData().getDataSetByIndex(i);
                    ?? entryForIndex = iBarLineScatterCandleBubbleDataSet.getEntryForIndex((int) entry.getX());
                    MPPointD pixelForValues = barLineScatterCandleBubbleDataProvider.getTransformer(iBarLineScatterCandleBubbleDataSet.getAxisDependency()).getPixelForValues(entryForIndex.getX(), entryForIndex.getY());
                    KWHzl(canvas, (float) pixelForValues.x, (float) pixelForValues.y);
                }
                i++;
            }
        }
        AEQbTJ(canvas, f, f2);
    }

    private final void KWHzl(android.graphics.Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.isConnected, this.AhwBna);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AYXKKw, this.AEQbTJ);
        }
    }

    private final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2) {
        int iSave;
        PointF pointF = this.AkhnZx;
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
