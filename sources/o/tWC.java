package o;

import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tWC extends LineChartRenderer {
    public float EZpvd;
    public float[] OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(float f) {
        this.EZpvd = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tWC(@NotNull LineDataProvider lineDataProvider, @NotNull ChartAnimator chartAnimator, @NotNull ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(lineDataProvider, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
        this.OLrzqt = new float[4];
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0138 A[LOOP:0: B:25:0x0076->B:46:0x0138, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225 A[EDGE_INSN: B:82:0x0225->B:79:0x0225 BREAK  A[LOOP:0: B:25:0x0076->B:46:0x0138], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawLinear(android.graphics.Canvas canvas, ILineDataSet iLineDataSet) {
        int i;
        int i2;
        Intrinsics.copydefault(iLineDataSet);
        int entryCount = iLineDataSet.getEntryCount();
        int i3 = 0;
        boolean z = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        int i4 = z ? 4 : 2;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        android.graphics.Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, iLineDataSet);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet, transformer, this.mXBounds);
        }
        if (iLineDataSet.getColors().size() > 1) {
            int i5 = i4 * 2;
            if (this.OLrzqt.length <= i5) {
                this.OLrzqt = new float[i4 * 4];
            }
            BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
            int i6 = xBounds.min;
            int i7 = xBounds.range + i6;
            if (i6 <= i7) {
                while (true) {
                    if (iLineDataSet.getEntryForIndex(i6) != 0) {
                        ?? entryForIndex = iLineDataSet.getEntryForIndex(i6);
                        Intrinsics.checkNotNullExpressionValue(entryForIndex, "");
                        this.OLrzqt[0] = entryForIndex.getX();
                        this.OLrzqt[1] = entryForIndex.getY() * phaseY;
                        if (i6 < this.mXBounds.max) {
                            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i6 + 1);
                            if (z) {
                                this.OLrzqt[2] = entryForIndex2.getX();
                                float[] fArr = this.OLrzqt;
                                float f = fArr[1];
                                fArr[3] = f;
                                fArr[4] = fArr[2];
                                fArr[5] = f;
                                fArr[6] = entryForIndex2.getX();
                                this.OLrzqt[7] = entryForIndex2.getY() * phaseY;
                            } else {
                                this.OLrzqt[2] = entryForIndex2.getX();
                                this.OLrzqt[3] = entryForIndex2.getY() * phaseY;
                            }
                        } else {
                            float[] fArr2 = this.OLrzqt;
                            fArr2[2] = fArr2[0];
                            fArr2[3] = fArr2[1];
                        }
                        transformer.pointValuesToPixel(this.OLrzqt);
                        if (!this.mViewPortHandler.isInBoundsRight(this.OLrzqt[0])) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(this.OLrzqt[2]) && (this.mViewPortHandler.isInBoundsTop(this.OLrzqt[1]) || this.mViewPortHandler.isInBoundsBottom(this.OLrzqt[3]))) {
                            this.mRenderPaint.setColor(iLineDataSet.getColor(i6));
                            Intrinsics.copydefault(canvas2);
                            canvas2.drawLines(this.OLrzqt, 0, i5, this.mRenderPaint);
                        }
                        if (i6 != i7) {
                        }
                    } else if (i6 != i7) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        } else {
            int i8 = entryCount * i4;
            if (this.OLrzqt.length < C56548yJl.copydefault(i8, i4) * 2) {
                this.OLrzqt = new float[C56548yJl.copydefault(i8, i4) * 4];
            }
            if (iLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                int i9 = xBounds2.min;
                int i10 = xBounds2.range + i9;
                if (i9 <= i10) {
                    i = 0;
                    i2 = 0;
                    while (true) {
                        ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i9 == 0 ? i3 : i9 - 1);
                        ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i9);
                        if (entryForIndex3 != 0 && entryForIndex4 != 0) {
                            this.OLrzqt[i] = entryForIndex3.getX();
                            int i11 = i + 2;
                            this.OLrzqt[i + 1] = entryForIndex3.getY() * phaseY;
                            if (z) {
                                this.OLrzqt[i11] = entryForIndex4.getX();
                                this.OLrzqt[i + 3] = entryForIndex3.getY() * phaseY;
                                this.OLrzqt[i + 4] = entryForIndex4.getX();
                                i11 = i + 6;
                                this.OLrzqt[i + 5] = entryForIndex3.getY() * phaseY;
                            }
                            this.OLrzqt[i11] = entryForIndex4.getX();
                            this.OLrzqt[i11 + 1] = entryForIndex4.getY() * phaseY;
                            i = i11 + 2;
                            if (entryForIndex4.getX() == this.EZpvd) {
                                i2 = i;
                            }
                        }
                        if (i9 == i10) {
                            break;
                        }
                        i9++;
                        i3 = 0;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (i > 0) {
                    transformer.pointValuesToPixel(this.OLrzqt);
                    int iCopydefault = C56548yJl.copydefault((this.mXBounds.range + 1) * i4, i4) * 2;
                    this.mRenderPaint.setColor(iLineDataSet.getColor());
                    int i12 = i2 <= iCopydefault ? i2 : 0;
                    Intrinsics.copydefault(canvas2);
                    canvas2.drawLines(this.OLrzqt, i12, iCopydefault - i12, this.mRenderPaint);
                    this.mRenderPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.GiPPlLgiPPlL));
                    if (iCopydefault >= i2) {
                        canvas2.drawLines(this.OLrzqt, 0, i2, this.mRenderPaint);
                    }
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }
}
