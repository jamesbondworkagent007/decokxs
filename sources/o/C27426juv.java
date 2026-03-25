package o;

import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27426juv extends BarChartRenderer {
    public static final Application Companion = new Application(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27426juv(@NotNull BarDataProvider barDataProvider, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(barDataProvider, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
    }

    /* JADX INFO: renamed from: o.juv$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.juv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(@NotNull android.graphics.Canvas canvas, @NotNull IBarDataSet iBarDataSet, int i) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(iBarDataSet, "");
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        BarData barData = this.mChart.getBarData();
        float barWidth = barData != null ? barData.getBarWidth() : 0.85f;
        C56539yJc c56539yJcAEQbTJ = C56548yJl.AEQbTJ(C56548yJl.AhwBna(0, barBuffer.size()), 4);
        int iKWHzl = c56539yJcAEQbTJ.KWHzl();
        int iCopydefault = c56539yJcAEQbTJ.copydefault();
        int iOLrzqt = c56539yJcAEQbTJ.OLrzqt();
        if ((iOLrzqt <= 0 || iKWHzl > iCopydefault) && (iOLrzqt >= 0 || iCopydefault > iKWHzl)) {
            return;
        }
        while (true) {
            int i2 = iKWHzl + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i2])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[iKWHzl])) {
                    return;
                }
                int i3 = iKWHzl / 4;
                T entryForIndex = iBarDataSet.getEntryForIndex(i3);
                Intrinsics.copydefault(entryForIndex, "");
                float[] fArr = barBuffer.buffer;
                float f = fArr[iKWHzl];
                float fConvertDpToPixel = fArr[iKWHzl + 1];
                float f2 = fArr[i2];
                float f3 = fArr[iKWHzl + 3];
                float f4 = f2 - f;
                float f5 = (f4 - (f4 * barWidth)) / 2.0f;
                if (((BarEntry) entryForIndex).getY() <= 0.0f) {
                    fConvertDpToPixel = f3 - com.github.mikephil.charting.utils.Utils.convertDpToPixel(0.5f);
                }
                this.mRenderPaint.setColor(iBarDataSet.getColor(i3));
                RectF rectF = new RectF(f + f5, fConvertDpToPixel, f2 - f5, f3);
                canvas.drawRoundRect(rectF, 4.0f, 4.0f, this.mRenderPaint);
                if (iBarDataSet.getBarBorderWidth() > 0.0f) {
                    this.mBarBorderPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
                    this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
                    canvas.drawRoundRect(rectF, 4.0f, 4.0f, this.mBarBorderPaint);
                }
            }
            if (iKWHzl == iCopydefault) {
                return;
            } else {
                iKWHzl += iOLrzqt;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(@NotNull android.graphics.Canvas canvas, @NotNull Highlight[] highlightArr) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(highlightArr, "");
        BarData barData = this.mChart.getBarData();
        if (barData == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                T entryForXValue = iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                BarEntry barEntry = entryForXValue instanceof BarEntry ? (BarEntry) entryForXValue : null;
                if (barEntry != null && isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    iBarDataSet.getEntryIndex(barEntry);
                    float[] fArr = {barEntry.getX() - 0.5f, barEntry.getY(), barEntry.getX() + 0.5f, 0.0f};
                    transformer.pointValuesToPixel(fArr);
                    float f = fArr[0];
                    float fConvertDpToPixel = fArr[1];
                    float f2 = fArr[2];
                    float f3 = fArr[3];
                    float f4 = f2 - f;
                    float barWidth = (f4 - (barData.getBarWidth() * f4)) / 2.0f;
                    if (barEntry.getY() <= 0.0f) {
                        fConvertDpToPixel = f3 - com.github.mikephil.charting.utils.Utils.convertDpToPixel(0.5f);
                    }
                    canvas.drawRoundRect(new RectF(f + barWidth, fConvertDpToPixel, f2 - barWidth, f3), 4.0f, 4.0f, this.mHighlightPaint);
                }
            }
        }
    }
}
